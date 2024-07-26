package mod3_exception.lesson4_runCatching

fun main() {

    runCatching {
        val arr = arrayOf(4, 8, 15, 16, 23, 42)
        arr[5]
    }.onSuccess {
        println("Result: $it")
    }.onFailure {
        println("Exception: $it")
    }


}