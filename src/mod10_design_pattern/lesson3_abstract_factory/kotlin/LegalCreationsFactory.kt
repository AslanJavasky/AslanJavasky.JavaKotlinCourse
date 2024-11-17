package mod10_design_pattern.lesson3_abstract_factory.kotlin

class LegalCreationsFactory : MagicalCreatureFactory {
    override fun createBird() = Owl()
    override fun createBeast() = Hippogriff()
}