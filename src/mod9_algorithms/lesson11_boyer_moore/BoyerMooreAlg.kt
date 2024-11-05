package mod9_algorithms.lesson11_boyer_moore

class BoyerMooreAlg(
    private val pattern: String,
    private val text: String,

    ) {

    private val badChar = IntArray(ALPHABET_CNT) { -1 }
    private lateinit var goodSuffix: IntArray

    init {
        val m = pattern.length
        for (i in pattern.indices) {
            badChar[pattern[i].code] = i
        }

        var lastPrefixPosition = m
        goodSuffix = IntArray(m + 1)

//        for (i in m - 1 downTo 0) {
        var i = 0
        if (isPrefix(i + 1)) {
            lastPrefixPosition = i + 1
        }
        goodSuffix[i] = lastPrefixPosition - i + m - 1
//        }


//        }
        for (i in 0 until m - 1) {
            val len = suffixLength(i)
            goodSuffix[m - 1 - len] = minOf(goodSuffix[m - 1 - len], goodSuffix[m - 1 - i])
        }

    }

    private fun suffixLength(p: Int): Int {
        var len = 0
        var i = p
        var j = pattern.length - 1
        while (i >= 0 && pattern[i] == pattern[j]) {
            len++
            i--
            j--
        }
        return len
    }

    private fun isPrefix(p: Int): Boolean {
        for (i in p until pattern.length) {
            if (pattern[i] != pattern[i - p]) {
                return false
            }
        }
        return true
    }

    fun BMSearch() {

        val n = text.length
        val m = pattern.length
        var s = 0

        while (s <= (n - m)) {

            var j = m - 1

            while (j >= 0 && pattern[j] == text[s + j]) {
                j--
            }
            if (j < 0) {
                println("Substring found at index: $s")
                s += if (s + m < n) m - badChar[text[s + m].code] else 1
            } else {
                s += maxOf(goodSuffix[j], j - badChar[text[s + j].code])
            }
        }

    }


    companion object {
        private const val ALPHABET_CNT = 256
    }
}

