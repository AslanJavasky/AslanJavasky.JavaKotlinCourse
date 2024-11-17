package mod10_design_pattern.lesson3_abstract_factory.kotlin

class Unicorn:AbstractMagicalCreature() {
    override fun makeSound() {
        println("silence...")
    }

    override fun getDescription(): String {
        return "The unicorn is a beautiful creature."
    }
}