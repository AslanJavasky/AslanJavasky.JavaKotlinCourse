package mod10_design_pattern.lesson2_factory.kotlin

class Griffin : MagicalCreature {
    override fun makeSound() {
        println("Griffin's sound is :\"Rrrrrrr\"")
    }

    override fun description() =
        "The griffin is a mythical creature with body of a lion and the head of an eagle."

}