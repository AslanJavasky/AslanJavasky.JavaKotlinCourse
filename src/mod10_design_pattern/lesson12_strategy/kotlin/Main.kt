package mod10_design_pattern.lesson12_strategy.kotlin

fun main() {

    val bookStrategy: StudyStrategy = BookStudyStrategy()
    val hermione = Student("Hermione Granger", bookStrategy)
    hermione.learnSpell("Vingardium Levioza")

    hermione.setStudyStrategy(VideoStudyStrategy())
    hermione.learnSpell("Expelliarmus")

    val harry = Student("Harry Potter", PracticalStudyStrategy())
    harry.learnSpell("Riktumsempra")
}