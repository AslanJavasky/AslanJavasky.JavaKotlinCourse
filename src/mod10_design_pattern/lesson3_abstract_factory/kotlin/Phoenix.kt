package mod10_design_pattern.lesson3_abstract_factory.kotlin

class Phoenix: AbstractMagicalCreature() {
    override fun makeSound() {
        println("Kaaarrrr and cries.")
    }

    override fun getDescription(): String {
        return "Phoenix is a mythical bird that rises from their ashes."
    }
}