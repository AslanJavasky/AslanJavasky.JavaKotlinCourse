package mod9_algorithms.lesson13_euclidean_algorithm

object EuclideanAlgorithmK {

    fun nodWhile(first: Int, second: Int): Int {
        //O(log min(n,m))
        if (first < 0 || second < 0) throw IllegalArgumentException("numbers must be greater than or equal zero")

        var a = first
        var b = second

        while (b != 0) {
            var temp = b
            b = a % b
            a = temp
        }

        return a
    }

    fun nodRec(first: Int, second: Int): Int {
        //O(log min(n,m))
        if (first < 0 || second < 0) throw IllegalArgumentException("numbers must be greater than or equal zero")
        return if (second == 0) first
        else nodRec(second, first % second)

    }
}

fun main() {
    println(EuclideanAlgorithmK.nodWhile(4,8))
    println(EuclideanAlgorithmK.nodWhile(100,75))
}