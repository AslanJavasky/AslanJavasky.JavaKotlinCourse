package mod10_design_pattern.lesson12_strategy.kotlin

class BookStudyStrategy : StudyStrategy {
    override fun study(spell: String) {
        println("Studying the spell \"$spell\" using books.")
    }

}