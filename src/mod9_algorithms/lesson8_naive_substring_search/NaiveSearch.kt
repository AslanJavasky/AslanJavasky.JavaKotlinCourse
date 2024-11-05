package mod9_algorithms.lesson8_naive_substring_search


fun naiveSearch(text: String, pattern: String): Int {

    val n = text.length
    val m = pattern.length

    for (i in 0..n - m) {
        var j = 0
        while (j < m) {
            if (text[i + j] != pattern[j]) break
            j++
        }
        if (j == m) {
            return i
        }
    }
    return -1
}


fun main() {
    val text = "Aslan is the best teacher of Java"
    val pattern = "Java"
    println(naiveSearch(text, pattern))//29
    println(naiveSearch("sdkjgfbsdhjfgasgf", "Aslan"))//-1
    println(naiveSearch("Kotlin is a conсise version of Java", "Kotlin"))//0
}
