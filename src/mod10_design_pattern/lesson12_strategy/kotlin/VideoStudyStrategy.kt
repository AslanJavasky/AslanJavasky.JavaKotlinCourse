package mod10_design_pattern.lesson12_strategy.kotlin

class VideoStudyStrategy:StudyStrategy {

    override fun study(spell: String) {
        println("Watching a video tutorial on the spell \"$spell\".")
    }
}