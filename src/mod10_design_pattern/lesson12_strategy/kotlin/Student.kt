package mod10_design_pattern.lesson12_strategy.kotlin

import mod10_design_pattern.lesson7_adapter.kotlin.Spell

class Student(
    private val name:String,
    private var strategy: StudyStrategy
) {

    fun setStudyStrategy(studyStrategy: StudyStrategy){
        this.strategy=studyStrategy
    }

    fun learnSpell(spell: String){
        println("$name is learning:")
        strategy.study(spell)
    }
}