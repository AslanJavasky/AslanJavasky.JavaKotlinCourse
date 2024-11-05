package mod9_algorithms.lesson6_quick_sort

object QuickSortKt {
    @JvmStatic
    fun quickSort(arr: IntArray, low: Int, high: Int) {
        if (low < high) {
            val indexPivot: Int = partition(arr, low, high)
            quickSort(arr, 0, indexPivot - 1)
            quickSort(arr, indexPivot + 1, high)

        }
    }

    private fun partition(arr: IntArray, low: Int, high: Int): Int {
        val pivot = arr[high]
        var i = low - 1

        for (j in low until high) {
            if (arr[j] < pivot) {
                i++
                val temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
        }
        val temp = arr[i + 1]
        arr[i + 1] = arr[high]
        arr[high] = temp

        return i + 1
    }
}

fun main() {

    val arr = intArrayOf(8, 15, 23, 4, 42, 16)
    println("arr before sort: ${arr.contentToString()}")
    QuickSortKt.quickSort(arr, 0, arr.size-1)
    println("arr after sort: ${arr.contentToString()}")

}

