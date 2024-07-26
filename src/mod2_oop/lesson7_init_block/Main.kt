package mod2_oop.lesson7_init_block

import mod2_oop.lesson2_constructors.Person

fun main() {

    val harry = Person("Harry Potter")
    harry.sayHello()

    val selena = PersonKt.getInstance("Selena Gomez")

}