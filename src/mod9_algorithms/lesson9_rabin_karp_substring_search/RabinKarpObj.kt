package mod9_algorithms.lesson9_rabin_karp_substring_search

object RabinKarpObj {
    private const val ALPHABET_CNT = 256
    private const val PRIME_NUMBER = 101

    fun search(text: String, pattern: String) {

        val textLength = text.length
        val patternLength = pattern.length

        var currentTextHash = 0
        var patternHash = 0
        var hashMultiplier = 1

        for (i in 0 until patternLength) {
            patternHash = (ALPHABET_CNT * patternHash + pattern[i].code) % PRIME_NUMBER
            currentTextHash = (ALPHABET_CNT * currentTextHash + text[i].code) % PRIME_NUMBER
        }

        for (i in 0 until patternLength - 1) {
            hashMultiplier = (hashMultiplier * ALPHABET_CNT) % PRIME_NUMBER
        }

        for (i in 0..(textLength - patternLength)) {
            if (patternHash == currentTextHash) {

                var j = 0
                while (j < patternLength && text[i + j] == pattern[j]) {
                    j++
                }
                if (j == patternLength) {
                    println("Substring found at index: $i")
                }
            }
            if (i < textLength - patternLength) {
                currentTextHash = (ALPHABET_CNT *
                        (currentTextHash - text[i].code * hashMultiplier)
                        + text[i + patternLength].code) % PRIME_NUMBER
            }
            if (currentTextHash < 0) currentTextHash += PRIME_NUMBER
        }
    }
}

fun main(){
    val text = "Aslan is the best teacher of Java"
    val pattern = "Java"
    RabinKarpObj.search(text, pattern)
    RabinKarpObj.search("sdkjgfbsdhjfgasgf", "Aslan")
    RabinKarpObj.search("Kotlin is a Kotlin conсise abracadabra version of Java", "Kotlin")
}