package astminer.parse.antlr

import astminer.common.model.Node
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.Vocabulary
import org.antlr.v4.runtime.tree.ErrorNode
import org.antlr.v4.runtime.tree.TerminalNode

fun convertAntlrTree(tree: ParserRuleContext, ruleNames: Array<String>, vocabulary: Vocabulary): SimpleNode {
    return compressTree(convertRuleContext(tree, ruleNames, null, vocabulary))
}

private fun convertRuleContext(ruleContext: ParserRuleContext, ruleNames: Array<String>, parent: Node?, vocabulary: Vocabulary): SimpleNode {
    val typeLabel = ruleNames[ruleContext.ruleIndex]
    val currentNode = SimpleNode(typeLabel, parent, null)
    val children: MutableList<Node> = ArrayList()

    val start = Coordinate(ruleContext.getStart().line, ruleContext.getStart().charPositionInLine)
    val end = Coordinate(ruleContext.getStop().line, ruleContext.getStop().charPositionInLine + 1)
    currentNode.setLocation(CodeLocation(start, end))

    ruleContext.children?.forEach {
        if (it is TerminalNode) {
            children.add(convertTerminal(it, currentNode, vocabulary))
            return@forEach
        }
        if (it is ErrorNode) {
            children.add(convertErrorNode(it, currentNode))
            return@forEach
        }
        children.add(convertRuleContext(it as ParserRuleContext, ruleNames, currentNode, vocabulary))
    }
    currentNode.setChildren(children)

    return currentNode
}

private fun convertTerminal(terminalNode: TerminalNode, parent: Node?, vocabulary: Vocabulary): SimpleNode {
    val currentNode = SimpleNode(vocabulary.getSymbolicName(terminalNode.symbol.type), parent, terminalNode.symbol.text)
    val location = Coordinate(terminalNode.symbol.line, terminalNode.symbol.charPositionInLine)
    currentNode.setLocation(CodeLocation(location, location))
    return currentNode
}

private fun convertErrorNode(errorNode: ErrorNode, parent: Node?): SimpleNode {
    val currentNode = SimpleNode("Error", parent, errorNode.text)
    val location = Coordinate(errorNode.symbol.line, errorNode.symbol.charPositionInLine)
    currentNode.setLocation(CodeLocation(location, location))
    return currentNode
}

/**
 * Remove intermediate nodes that have a single child.
 */
fun simplifyTree(tree: SimpleNode): SimpleNode {
    return if (tree.getChildren().size == 1) {
        simplifyTree(tree.getChildren().first() as SimpleNode)
    } else {
        tree.setChildren(tree.getChildren().map { simplifyTree(it as SimpleNode) }.toMutableList())
        tree
    }
}

/**
 * Compress paths of intermediate nodes that have a single child into individual nodes.
 */
fun compressTree(root: SimpleNode): SimpleNode {
    return if (root.getChildren().size == 1) {
        val child = compressTree(root.getChildren().first() as SimpleNode)
        val compressedNode = SimpleNode(
                root.getTypeLabel() + "|" + child.getTypeLabel(),
                root.getParent(),
                child.getToken()
        )
        compressedNode.setChildren(child.getChildren())
        child.getLocation()?.let { compressedNode.setLocation(it) }
        compressedNode
    } else {
        root.setChildren(root.getChildren().map { compressTree(it as SimpleNode) }.toMutableList())
        root
    }
}


fun decompressTypeLabel(typeLabel: String) = typeLabel.split("|")
