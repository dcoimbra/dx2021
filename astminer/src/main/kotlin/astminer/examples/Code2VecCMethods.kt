package astminer.examples

import astminer.cli.separateToken
import astminer.common.*
import astminer.common.model.LabeledPathContexts
import astminer.parse.antlr.javascript.JavaScriptMethodSplitter
import astminer.parse.antlr.javascript.JavaScriptParser
import astminer.parse.cpp.FuzzyCppParser
import astminer.parse.cpp.FuzzyMethodSplitter
import astminer.paths.*
import astminer.common.model.*
import com.google.gson.Gson
import java.io.File
import java.io.InputStream
import java.io.InputStreamReader
import java.io.BufferedReader

// data class Sample (val project: String, val commit_id: String, val target: String, val func: String, val idx: String)
data class Sample (val project: String, val file: String, val func: String, val label: String)

fun printPath(path: ASTPath){
    println("The path is $path")
    println(path.topNode.prettyPrint())
}

fun countLinesinStream(content: InputStream) : Long{
    val reader = content.bufferedReader()
    val lines = reader.lines()
    return lines.count();    
}

//Retrieve paths from all JavaScript files, using an Antlr parser.
//JavaScriptMethodSplitter is used to extract individual method nodes from the compilation unit tree.
fun code2vecCMethods(split: String) {
    val source = "dataset/${split}.jsonl"
    val outputDir = "../code2vec"

    //TODO - here I want to create a sliding window over each function instead
    val miner = PathMiner(PathRetrievalSettings(8, 3, 0, 100000000))

    val storage = Code2VecPathStorage(split, outputDir)

    File(source).forEachLine { line ->
        val sample = Gson().fromJson(line, Sample::class.java)
        val fileNode = FuzzyCppParser().parseInputStream(sample.func.byteInputStream()) ?: return@forEachLine
        println("File:" +  fileNode)
        fileNode.preOrder().forEach { it.setNormalizedToken(separateToken(it.getToken())) }

        // I want to calculate a number of sliding windows over the function
        println("There are ${countLinesinStream(sample.func.byteInputStream())} lines in this function")
        
        val paths = miner.retrievePaths(fileNode)

        println(paths.size.toString() + " paths: ")
  
        paths.forEach{
                //println("The path is $it")
                printPath(it)
            }
        

        if (split == "train" && paths.isEmpty()) return@forEachLine

        // var label = "safe"
        // if (sample.target == "1") {
        //     label = "vuln"
        // }
        var label = sample.project
        // Disregard the warning "Condition 'sample.label != null' is always 'true'" - it is wrong,
        // if label is missing it will be null and we want to use the project instead
        @Suppress("SENSELESS_COMPARISON")
        if (sample.label != null && sample.label != ""){
            label = sample.label
        }
        // println(sample)
        // println(label)
        
        storage.store(
            LabeledPathContexts(
                label,
                paths.map { toPathContext(it) { node -> node.getNormalizedToken() } })
        )
    }
    storage.close()
}
