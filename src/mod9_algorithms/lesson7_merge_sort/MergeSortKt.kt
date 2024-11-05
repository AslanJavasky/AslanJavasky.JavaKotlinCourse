package mod9_algorithms.lesson7_merge_sort

import mod9_algorithms.lesson7_merge_sort.MergeSortKt.mergeSort

object MergeSortKt {

    @JvmStatic
    fun mergeSort(arr: IntArray) {

        if (arr.size < 2) return
        val mid = arr.size / 2

        val left = IntArray(mid)
        val right = IntArray(arr.size - mid)

        for (i in 0 until mid) {
            left[i] = arr[i]
        }
        for (i in mid until arr.size) {
            right[i - mid] = arr[i]
        }
        mergeSort(left)
        mergeSort(right)

        merge(arr, left, right)

    }

    private fun merge(arr: IntArray, left: IntArray, right: IntArray) {

        var i = 0
        var j = 0
        var k = 0

        while (i < left.size && j < right.size) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++]
            } else {
                arr[k++] = right[j++]
            }
        }

        while (i < left.size) {
            arr[k++] = left[i++]
        }

        while (j < right.size) {
            arr[k++] = right[j++]
        }
    }


}

fun main() {
    val arr = intArrayOf(8, 16, 42, 15, 4, 23)
    println(arr.contentToString())
    mergeSort(arr)
    println(arr.contentToString())
}