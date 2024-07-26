package mod2_oop.lesson20_generics

fun main() {

    val person: PersonKt<in Number> = PersonKt("Aslan", 33, 1)//super
    val person2: PersonKt<out Number> = PersonKt("Aslan", 33, 1)//extends
    val person3 = PersonKt("Aslan", 33, 1)
    println(person3)


}