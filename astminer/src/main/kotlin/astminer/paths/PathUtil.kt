package astminer.paths

import astminer.common.model.*
import java.security.MessageDigest

fun toPathContext(path: ASTPath, getToken: (Node) -> String = { node -> node.getToken() }): PathContext {
    val startToken = getToken(path.upwardNodes.first())
    val endToken = getToken(path.downwardNodes.last())
    val astNodes = path.upwardNodes.map { OrientedNodeType(it.getTypeLabel(), Direction.UP) } +
            OrientedNodeType(path.topNode.getTypeLabel(), Direction.TOP) +
            path.downwardNodes.map { OrientedNodeType(it.getTypeLabel(), Direction.DOWN) }

    val strBuilder = StringBuilder()
    astNodes.forEach { node ->
        strBuilder.append("${node.typeLabel} ${node.direction} ")
    }
    strBuilder.deleteCharAt(strBuilder.length - 1)

    val bytesPath = MessageDigest.getInstance("MD5").digest(strBuilder.toString().toByteArray())
    val encodedPath = bytesPath.joinToString("") {
        "%02x".format(it)
    }

    return PathContext(startToken, encodedPath, endToken)
}
