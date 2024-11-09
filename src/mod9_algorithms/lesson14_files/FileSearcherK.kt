package mod9_algorithms.lesson14_files

import java.io.File

fun main() {

    val desktop = File("C:/Users/User/Desktop/")

    val fileNames = findFilesInDirectory(desktop)

    fileNames.forEach { println(it) }

}

fun findFilesInDirectory(dir: File): List<String> {

    val fileNames = mutableListOf<String>()

    if (dir.exists() && dir.isDirectory) {
        var files = dir.listFiles()
        files?.forEach {
            when{
                it.isFile -> fileNames.add(it.name)
                it.isDirectory -> fileNames.addAll(findFilesInDirectory(it))
            }
        }
    }
    return fileNames

}
