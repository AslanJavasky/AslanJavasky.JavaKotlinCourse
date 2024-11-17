package mod10_design_pattern.lesson3_abstract_factory.kotlin

class Owl:AbstractMagicalCreature() {
    override fun makeSound() {
        println("Uuuuu")
    }

    override fun getDescription(): String {
        return "The owl is a wise creature that serves as a messenger."
    }
}