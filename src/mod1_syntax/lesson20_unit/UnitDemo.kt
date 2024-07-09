package mod1_syntax.lesson20_unit

fun main() {


    val multiply: (Int, Int) -> Unit = { a, b -> println("a * b = ${a * b}") }

    multiply(3,6)

}

