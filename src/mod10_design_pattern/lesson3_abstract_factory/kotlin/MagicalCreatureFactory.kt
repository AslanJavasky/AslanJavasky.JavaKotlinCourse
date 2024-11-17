package mod10_design_pattern.lesson3_abstract_factory.kotlin

interface MagicalCreatureFactory {
    fun createBird(): AbstractMagicalCreature
    fun createBeast(): AbstractMagicalCreature
}