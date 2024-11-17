package mod10_design_pattern.lesson7_adapter.kotlin

class Wizard : Spell {
    override fun cast() {
        println("Expecto Patronum!")
    }
}