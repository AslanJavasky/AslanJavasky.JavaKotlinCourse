package mod10_design_pattern.lesson6_decorator.kotlin

abstract class WandDecorator(
    private val decoratedWand: Wand
) : Wand {
    override fun castSpell(): String {
        return decoratedWand.castSpell()
    }
}