package mod2_oop.lesson8_deep_copy

import mod2_oop.lesson2_constructors.Person

fun main() {

    val harry = Person("Harry Potter")
//    harry.sayHello()

    val selena = PersonKt.getInstance("Selena Gomez")
    val madonna = PersonKt.getInstance("Madonna")
//    val thirdPerson=selena//by reference
    val thirdPerson = PersonKt.getInstance(selena)//deep copy
    thirdPerson.name = "Alexa Vega"
//    println(selena.name)

}