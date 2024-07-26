package mod2_oop.lesson6_this_for_calling_other_constructor

import mod2_oop.lesson2_constructors.Person

fun main() {

    val harry = Person("Harry Potter")
    harry.sayHello()

    val selena = PersonKt.getInstance("Selena Gomez")

}