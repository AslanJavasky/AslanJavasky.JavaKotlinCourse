package mod9_algorithms.lesson15_input_from_file

import java.io.BufferedReader
import java.io.FileInputStream
import java.io.IOException
import java.io.InputStreamReader
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import kotlin.io.path.Path

fun main() {

    val filePath = "assets/description.txt"
//    println(File(filePath).exists())
//    inputFromFileWithInputStreamReader(filePath)
//    inputFromFileWithBufferedReader(filePath)
    inputFromFileWithFilesNIO(filePath)

}

fun inputFromFileWithFilesNIO(filePath: String) {

    try {
        Files.readAllLines(Path(filePath),Charsets.UTF_8).forEach { line ->
            println(line)
        }
    }catch (e: IOException) {
        e.printStackTrace()
    }

}

fun inputFromFileWithBufferedReader(filePath: String) {
    val sb = StringBuilder()

    try {
        FileInputStream(filePath).use { fis ->
            InputStreamReader(fis, StandardCharsets.UTF_8).use {   isr ->
                BufferedReader(isr).use { br ->
                    while (true){
                       val line= br.readLine() ?: break
                        sb.append(line).append("\n")
                    }
                }
            }
        }
    } catch (e: IOException) {
        e.printStackTrace()
    }
    println(sb)

}

fun inputFromFileWithInputStreamReader(filePath: String) {

    val sb = StringBuilder()

    try {
        FileInputStream(filePath).use { fis ->
            InputStreamReader(fis, StandardCharsets.UTF_8).use { isr ->
                var code: Int
                while ((isr.read().also { code = it }) != -1) {
                    val ch=code.toChar()
                    sb.append(ch)
                }
            }
        }
    } catch (e: IOException) {
        e.printStackTrace()
    }
    println(sb)
}