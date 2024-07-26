package mod2_oop.lesson10_polymorphism

fun main() {

    var harry:StudentKt = StudentKt("Harry Potter", 17, 4)
    var aslan: PersonKt = PersonKt("Aslan Javasky")
    aslan = harry

    println(harry is StudentKt)


    harry.sayHello()
}