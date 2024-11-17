package mod10_design_pattern.lesson13_observer.kotlin


fun main() {

    val hogwarts = Hogwarts()
    hogwarts.registerObserver(HarryPotter())
    hogwarts.setEvent("Exam is begin!")

    hogwarts.registerObserver(HermioneGranger())
    hogwarts.notifyObservers()


}