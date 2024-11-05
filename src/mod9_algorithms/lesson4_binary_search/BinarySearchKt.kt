package mod9_algorithms.lesson4_binary_search


object BinarySearchKt {

    @JvmStatic
    fun binarySearchIter(arr: IntArray, target: Int): Int {
        var low = 0;
        var high = arr.size - 1;

        while (low <= high) {
            val mid = (low + high) / 2
            when {
                arr[mid] == target -> return mid
                arr[mid] < target -> low = mid + 1
                else -> high = mid - 1
            }
        }
        return -1
    }

    @JvmStatic
    fun binarySearchRec(arr: IntArray, target: Int): Int {
        return binarySearchHelper(arr, target, 0, arr.size - 1)

    }

    private fun binarySearchHelper(arr: IntArray, target: Int, low: Int, high: Int): Int =
        if (low > high) -1
        else {
            val mid = (low + high) / 2
            when {
                arr[mid] == target -> mid
                arr[mid] < target -> binarySearchHelper(arr, target, mid + 1, high)
                else -> binarySearchHelper(arr, target, low, mid - 1)
            }
        }
}

fun main() {
    var arr= intArrayOf(1,2,3,4,5,6,7,8,9,10,11,12)
    println(BinarySearchKt.binarySearchIter(arr,3))
    println(BinarySearchKt.binarySearchRec(arr,3))
    println(BinarySearchKt.binarySearchRec(arr,108))
}