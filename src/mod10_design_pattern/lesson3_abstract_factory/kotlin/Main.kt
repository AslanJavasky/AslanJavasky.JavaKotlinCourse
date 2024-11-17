package mod10_design_pattern.lesson3_abstract_factory.kotlin

fun main() {

    val kluvokryl = LegalCreationsFactory().createBeast()
    kluvokryl.makeSound()
    println(kluvokryl.getDescription())

    val enicorn = IllegalCreationsFactory().createBeast()
    enicorn.makeSound()
    println(enicorn.getDescription())

    val phoenix = IllegalCreationsFactory().createBird()
    println(phoenix.getDescription())


}