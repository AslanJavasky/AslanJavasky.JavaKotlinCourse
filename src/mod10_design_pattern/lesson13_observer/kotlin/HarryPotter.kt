package mod10_design_pattern.lesson13_observer.kotlin

class HarryPotter:Observer {
    override fun update(event: String) {
        println("Harry Potter found out about:$event")
    }
}