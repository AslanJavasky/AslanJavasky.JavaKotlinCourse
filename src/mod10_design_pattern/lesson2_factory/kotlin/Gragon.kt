package mod10_design_pattern.lesson2_factory.kotlin

class Gragon : MagicalCreature {
    override fun makeSound() {
        println("Dragon breathes fire...")
    }

    override fun description() = "The dragon is a large creature that can breathe fire."
}