package mod2_oop.lesson22_reflection

fun main() {

    val aslan = StudentKt("Aslan Javasky", 33, 5)

    val classStudent = StudentKt::class.java

    val sayHelloMethod = classStudent.getMethod("sayHello")

    sayHelloMethod.invoke(aslan)

}

