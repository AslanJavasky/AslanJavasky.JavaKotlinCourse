package syntax.lesson13_null

fun main() {

    var nullableString: String? = "Aslan"
    println(nullableString?.uppercase() ?: "Null value here")

//    val PI: Double = 3.14
    val PI: Double? = null
    println("The pi constant is ${PI ?: "3.14"}")


}