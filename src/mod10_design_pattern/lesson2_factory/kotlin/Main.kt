package mod10_design_pattern.lesson2_factory.kotlin

fun main() {

    val drakosha = MagicalCreatureFactory.createCteature("dragon")
    val gr = MagicalCreatureFactory.createCteature("griffin")

    drakosha.makeSound()
    gr.makeSound()
}