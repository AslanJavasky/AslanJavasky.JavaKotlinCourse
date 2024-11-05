package mod9_algorithms.lesson2_recursion

object FibonacciKt {
    private lateinit var memo: LongArray

    fun getFibonacciByIndexIter(index: Int): Long {
        if (index == 0) return 0
        if (index == 1) return 1

        var a = 0L
        var b = 1L
        var result = 1L
        for (i in 2..index) {
            result = a + b
            a = b
            b = result
        }
        return result
    }


    fun getFibonacciByIndexRecursion(index: Int): Long {
        if (index == 0) return 0
        if (index == 1) return 1

        return getFibonacciByIndexRecursion(index - 1) + getFibonacciByIndexRecursion(index - 2)
    }

    fun getFibonacciByIndexRecursionWithMemo(index: Int): Long {
        memo = LongArray(index + 1)
        return fibonacciMemoHelper(index)
    }

    private fun fibonacciMemoHelper(index: Int): Long {
        when {
            index == 0 -> return 0
            index == 1 -> return 1
            memo[index] != 0L -> return memo[index]
        }
        memo[index]=fibonacciMemoHelper(index-1)+fibonacciMemoHelper(index-2)
        return memo[index]
    }
}


fun main() {
    println(FibonacciKt.getFibonacciByIndexIter(80))//O(n)
//    println(FibonacciKt.getFibonacciByIndexRecursion(40))//O(2^n)
    println(FibonacciKt.getFibonacciByIndexRecursionWithMemo(80))//O(n)
}



