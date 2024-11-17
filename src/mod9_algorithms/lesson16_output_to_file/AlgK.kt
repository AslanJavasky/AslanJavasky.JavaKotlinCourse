package mod9_algorithms.lesson16_output_to_file

import java.io.IOException
import java.nio.file.Files
import java.nio.file.StandardOpenOption
import kotlin.io.path.Path


fun main() {

    val filePath = "assets/description.txt"
    val path = Path(filePath)

    try {
        val lines = Files.readAllLines(path)
        val updatedLines = lines.map { it.substring(0, it.length - 3) + " 555" }
        Files.write(path, updatedLines, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING)
        println("DONE!")
    } catch (e: IOException) {
        e.printStackTrace()
    }

}