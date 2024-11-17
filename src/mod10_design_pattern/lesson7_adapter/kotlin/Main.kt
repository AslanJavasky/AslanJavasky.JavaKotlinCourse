package mod10_design_pattern.lesson7_adapter.kotlin

fun main() {

    val harry = Wizard()
    harry.cast()

    val dudley = Muggle()
    val adapter=MuggleAdapter(dudley)
    dudley.useMuggleSkills()

    val spell: Spell = harry
    val spell2: Spell = adapter

    adapter.cast()

}