package mod2_oop.lesson18_comparable

fun main() {

    val aslan=StudentKt("Aslan",33,5)
    val john=StudentKt("John",32,4)

    println(aslan.toString())
    println(aslan.hashCode())
    println(aslan.equals(john))

    //Data class
    val aslanDT=StudentDataClass("Aslan Javasky",33,5)
    println(aslanDT)
}