package mod10_design_pattern.lesson13_observer.kotlin

class HermioneGranger:Observer {
    override fun update(event: String) {
        println("Hermione Granger found out about:$event")
    }
}