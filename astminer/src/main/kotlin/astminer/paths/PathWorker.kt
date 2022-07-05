package astminer.paths

import astminer.common.model.ASTPath
import astminer.common.model.Node
import astminer.common.model.PathPiece
import astminer.common.postOrderIterator
import kotlin.math.min


class PathWorker {

    companion object {
        private const val PATH_PIECES_KEY = "path_pieces"

        private fun Node.setPathPieces(pathPieces: List<PathPiece>) {
            this.setMetadata(PATH_PIECES_KEY, pathPieces)
        }

        private fun Node.getPathPieces(): List<PathPiece>? = this.getMetadata(PATH_PIECES_KEY) as List<PathPiece>?
    }

    fun retrievePaths(tree: Node) = retrievePaths(tree, null, null, null, null)

    fun updatePathPieces(
            currentNode: Node,
            pathPiecesPerChild: List<List<PathPiece>?>,
            maxLength: Int?
    ) = pathPiecesPerChild.filterNotNull().flatMap { childPieces ->
        childPieces.filter { pathPiece ->
            maxLength == null || pathPiece.size <= maxLength
        }.map { pathPiece ->
            pathPiece + currentNode
        }
    }

    fun collapsePiecesToPaths(
            currentNode: Node,
            pathPiecesPerChild: List<List<PathPiece>?>,
            maxLength: Int?, maxWidth: Int?, minLine: Int?, maxLine: Int?
    ): Collection<ASTPath> {
        val paths: MutableCollection<ASTPath> = ArrayList()
        val childrenCount = pathPiecesPerChild.size

        //TODO - rewrite this code in proper Kotlin
        fun inRange(currentNode: Node) : Boolean {
            val metaLine = currentNode.getMetadata("LINE_NUMBER")
            val line : Int? = if (metaLine is String) metaLine.toInt() else null
            var currNodeInRange : Boolean
            if (line != null){
                if (minLine != null){
                    if (minLine <= line) currNodeInRange = true else currNodeInRange = false
                }
                else 
                    currNodeInRange = true
                if (maxLine != null && currNodeInRange){
                    if (maxLine >= line) currNodeInRange = true else currNodeInRange = false
                }
                else 
                    currNodeInRange = true
            }
            else 
                currNodeInRange = true // many types of nodes do not have lines, do not fail them otherwise we are left with nothing

            if (!currNodeInRange) 
                println("${currentNode.getTypeLabel() + " " + currentNode.getToken()} : $metaLine is not in range [$minLine, $maxLine]}")
            else
                println("${currentNode.getTypeLabel() + " " + currentNode.getToken()} : $metaLine is in range [$minLine, $maxLine]}")

            return currNodeInRange
        }
    
        if (inRange(currentNode)){
            pathPiecesPerChild.forEachIndexed { index, leftChildPieces ->
                val maxIndex = maxWidth?.let { min(index + maxWidth + 1, childrenCount) } ?: childrenCount
                pathPiecesPerChild.subList(index + 1, maxIndex).forEach { rightChildPieces ->
                    leftChildPieces?.forEach { upPiece ->
                        rightChildPieces?.forEach { downPiece ->
                            if (maxLength == null || upPiece.size + 1 + downPiece.size <= maxLength) {
                                if (upPiece.all{inRange(it)} && downPiece.all{inRange(it)})
                                    paths.add(ASTPath(upPiece, currentNode, downPiece.asReversed()))
                            }
                        }
                    }
                }
            }
        }
        return paths
    }


    fun retrievePaths(tree: Node, maxLength: Int?, maxWidth: Int?, minLine: Int?, maxLine: Int?): Collection<ASTPath> {
        val iterator = tree.postOrderIterator()
        val paths: MutableList<ASTPath> = ArrayList()
        println("retrievePaths, node $tree")
        iterator.forEach { currentNode ->
            println("retrievePaths, currentNode $currentNode (${currentNode.getToken()})")
            if (currentNode.isLeaf()) {
                if (currentNode.getToken().isNotEmpty()) {
                    currentNode.setPathPieces(listOf(listOf(currentNode)))
                    println("retrievePaths, currentNode setPathPieces")
                    listOf(currentNode).forEach {
                        print(it.getToken())
                    }
                    println() 
                }
            } else {
                val pathPiecesPerChild = currentNode.getChildren().map { it.getPathPieces() }
                println("retrievePaths, currentNode pathPiecesPerChild $pathPiecesPerChild")
                pathPiecesPerChild.forEach {
                    it?.forEach{
                        print("$it [")
                        it.forEach{
                            print("${it.getToken()} ,")
                        }
                        println("]")
                    }
                }
                println() 

                val currentNodePathPieces = updatePathPieces(currentNode, pathPiecesPerChild, maxLength)
                println("retrievePaths, currentNode currentNodePathPieces $currentNodePathPieces")
                currentNodePathPieces.forEach { it.forEach{print(it.getToken() + ",")}}
                println() 

                val currentNodePaths = collapsePiecesToPaths(currentNode, pathPiecesPerChild, maxLength, maxWidth, minLine, maxLine)

                println("retrievePaths, currentNodePaths $currentNodePaths")
                currentNodePaths.forEach{
                    print("upward: ")
                    it.upwardNodes.forEach{print(it.getToken() + ",")}
                    println("")
                    print("top: ${it.topNode.getToken()}")
                    println("")
                    print("downward: ")
                    it.downwardNodes.forEach{print(it.getToken() + ",")}
                    println("")
                }
                paths.addAll(currentNodePaths)
                currentNode.setPathPieces(currentNodePathPieces)
            }

            if (paths.size >= 200) {
                println("retrievePaths, paths $paths")
                return@forEach
            }
        }

        if (paths.size <= 200) {
            println("retrievePaths, paths $paths")
            return paths
        }
        println("retrievePaths, paths ${paths.take(200)}")
        return paths.take(200)
    }
}