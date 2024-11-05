package mod9_algorithms.lesson10_kmp

fun KMPSearch(text: String, pattern: String) {
    //O(n+m)
    val n = text.length
    val m = pattern.length

    val prefixArray = computePrefixArray(pattern)

    var i = 0
    var j = 0

    while (i < n) {
        if (pattern[j] == text[i]) {
            i++
            j++
        }
        if (j == m) {
            println("Substring found at index: ${i - j}")
            j = prefixArray[j - 1]
        }else if (i< n && pattern[j] != text[i]){
            if (j !=0){
                j=prefixArray[j-1]
            }else{
                i++
            }
        }
    }
}

private fun computePrefixArray(pattern: String): IntArray {

    val m = pattern.length
    val prefixArray = IntArray(m)
    var length = 0
    var i = 1

    while (i < m) {

        if (pattern[i] == pattern[length]) {
            length++
            prefixArray[i] = length
            i++
        } else {
            if (length != 0) {
                length = prefixArray[length - 1]
            } else {
                prefixArray[i] = 0
                i++
            }
        }

    }
    return prefixArray
}


fun main() {
    val text = "abcabcabcabc"
    val pattern = "abc"
    KMPSearch(text, pattern)
    KMPSearch("Aslan is the best teacher of Java programming language!", "Java")
}



