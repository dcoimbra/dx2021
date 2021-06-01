package astminer.examples

import astminer.cli.separateToken
import astminer.common.*
import astminer.common.model.LabeledPathContexts
import astminer.parse.antlr.javascript.JavaScriptMethodSplitter
import astminer.parse.antlr.javascript.JavaScriptParser
import astminer.parse.cpp.FuzzyCppParser
import astminer.parse.cpp.FuzzyMethodSplitter
import astminer.paths.*
import com.google.gson.Gson
import java.io.File

data class Sample (val project: String, val commit_id: String, val target: String, val func: String, val idx: String)

//Retrieve paths from all JavaScript files, using an Antlr parser.
//JavaScriptMethodSplitter is used to extract individual method nodes from the compilation unit tree.
fun code2vecCMethods(split: String) {
    val source = "dataset/${split}.jsonl"
    val outputDir = "../code2vec"

    val miner = PathMiner(PathRetrievalSettings(8, 3))

    val storage = Code2VecPathStorage(split, outputDir)

    File(source).forEachLine { line ->
        val sample = Gson().fromJson(line, Sample::class.java)
        val fileNode = FuzzyCppParser().parseInputStream(sample.func.byteInputStream()) ?: return@forEachLine
        fileNode.preOrder().forEach { it.setNormalizedToken(separateToken(it.getToken())) }

        val paths = miner.retrievePaths(fileNode)
        
        if (split == "train" && paths.isEmpty()) return@forEachLine

        var label = "safe"
        if (sample.target == "1") {
            label = "vuln"
        }
        storage.store(
            LabeledPathContexts(
                label,
                paths.map { toPathContext(it) { node -> node.getNormalizedToken() } })
        )
    }
    storage.close()
}
