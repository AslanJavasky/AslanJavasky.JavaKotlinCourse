package mod10_design_pattern.lesson13_observer.kotlin

class Hogwarts : Subject {

    private val observerList = mutableListOf<Observer>()
    private var event: String = ""

    override fun registerObserver(observer: Observer) {
        observerList.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observerList.remove(observer)
    }

    override fun notifyObservers() {
        observerList.forEach { it.update(event) }
    }

    fun setEvent(event:String){
        this.event=event
        notifyObservers()
    }
}