package mod10_design_pattern.lesson6_decorator.kotlin

class LumosWand(private val decoratedWand: Wand) : WandDecorator(decoratedWand) {
    override fun castSpell(): String {
        return "${super.castSpell()} Lumos!"
    }
}