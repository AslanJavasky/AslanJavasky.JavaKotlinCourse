package mod10_design_pattern.lesson7_adapter.kotlin

class MuggleAdapter(private val muggle: Muggle) : Spell {
    override fun cast() {
        muggle.useMuggleSkills()
    }
}