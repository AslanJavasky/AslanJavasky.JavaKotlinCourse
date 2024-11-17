package mod10_design_pattern.lesson13_observer.kotlin

interface Subject {
    fun registerObserver(observer: Observer)
    fun removeObserver(observer: Observer)
    fun notifyObservers()
}