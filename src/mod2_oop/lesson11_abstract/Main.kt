package mod2_oop.lesson11_abstract

import mod2_oop.lesson12_Object_Any.TeacherKt

fun main() {

    var harry:StudentKt = StudentKt("Harry Potter", 17, 4)
    var aslan: TeacherKt = TeacherKt("Aslan Javasky")
//    aslan = harry

    println(harry is StudentKt)


    harry.sayHello()
}