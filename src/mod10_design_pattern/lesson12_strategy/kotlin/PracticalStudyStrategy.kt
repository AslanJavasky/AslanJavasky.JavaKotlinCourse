package mod10_design_pattern.lesson12_strategy.kotlin

class PracticalStudyStrategy:StudyStrategy {
    override fun study(spell: String) {
        println("Practicing the spell \"$spell\" in the dueling club.")
    }
}