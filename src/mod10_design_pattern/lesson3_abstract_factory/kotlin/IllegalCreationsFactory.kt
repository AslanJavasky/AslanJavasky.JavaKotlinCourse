package mod10_design_pattern.lesson3_abstract_factory.kotlin

class IllegalCreationsFactory : MagicalCreatureFactory {
    override fun createBird() = Phoenix()
    override fun createBeast() = Unicorn()
}