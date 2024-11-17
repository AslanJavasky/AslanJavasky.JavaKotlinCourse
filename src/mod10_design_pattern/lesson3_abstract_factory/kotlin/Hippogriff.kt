package mod10_design_pattern.lesson3_abstract_factory.kotlin

class Hippogriff:AbstractMagicalCreature() {
    override fun makeSound() {
        println("Rrrrr")
    }

    override fun getDescription(): String {
        return "The Hippogriff is a proud creature with the body of a horse and the head of an eagle."
    }
}