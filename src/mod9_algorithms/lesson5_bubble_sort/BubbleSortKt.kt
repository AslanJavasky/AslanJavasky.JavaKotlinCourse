package mod9_algorithms.lesson5_bubble_sort

fun bubbleSort(arr: IntArray) {
    var swapped = false

    for (i in 0 until arr.size - 1) {
        swapped = false
        for (j in 0 until arr.size - 1 - i) {
            if (arr[j] > arr[j + 1]) {

                var temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
                swapped = true
            }
        }
        if (!swapped) break
    }
}

fun main() {
    val arr = intArrayOf(4, 23, 42, 16, 15, 8)

    println("arr before sort:" + arr.contentToString())
    bubbleSort(arr)
    println("arr after sort:" + arr.contentToString())
}