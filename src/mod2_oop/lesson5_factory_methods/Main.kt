package mod2_oop.lesson5_factory_methods

import mod2_oop.lesson2_constructors.Person

fun main() {

    val harry = Person("Harry Potter")
    harry.sayHello()

    val selena = PersonKt.getInstance("Selena Gomez")

}