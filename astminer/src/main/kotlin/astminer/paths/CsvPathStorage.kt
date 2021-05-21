package astminer.paths

import astminer.common.model.PathContext
import astminer.common.model.PathContextId

class CsvPathStorage(split: String,
                     outputFolderPath: String,
                     pathsLimit: Long = Long.MAX_VALUE,
                     tokensLimit: Long = Long.MAX_VALUE
) : CountingPathStorage<String>(split, outputFolderPath, pathsLimit, tokensLimit) {

    override fun pathContextIdsToString(pathContextIds: List<PathContext>, label: String): String {
        val joinedPathContexts = pathContextIds.joinToString(";") { pathContextId ->
            "${pathContextId.startToken} ${pathContextId.orientedNodeTypes} ${pathContextId.endToken}"
        }
        return "$label,$joinedPathContexts"
    }
}
