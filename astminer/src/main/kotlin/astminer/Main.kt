package astminer

import astminer.cli.*
import astminer.examples.code2vecCMethods

fun main(args: Array<String>) {
    val window =  if (args.size > 1) args[1].toInt() else 0
    val step =  if (args.size > 2) args[2].toInt() else 5

    code2vecCMethods(args[0], window, step)
}