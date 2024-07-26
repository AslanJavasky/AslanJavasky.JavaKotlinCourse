package mod3_exception.lesson4_runCatching

fun main() {

    val result = runCatching {
        val numerator = 10
        val denominator = 0
        numerator / denominator
    }

    if (result.isSuccess) {
        val value = result.getOrNull()
        println("Result: $value")
    } else {
        val exception = result.exceptionOrNull()
        println("Exception: $exception")
    }

}