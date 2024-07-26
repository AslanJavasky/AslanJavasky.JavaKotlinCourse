package mod2_oop.lesson10_polymorphism

import java.text.SimpleDateFormat
import java.util.Date

open class PersonKt(
    var name: String,
    var age: Int
) {

    var birth: Date = Date()
        get() = SimpleDateFormat("yyyy.MM.dd").parse(
            (SimpleDateFormat("yyyy.MM.dd").format(field))
        )
        set(value) {
            field = value
        }

//    init {
//        println("The new object of kotlin class PersonKt is created!")
//    }

    //пустой конструктор
    constructor() : this("", 0)

    //конструктор с параметром name
    constructor(name: String) : this(name, 0)

    open fun sayHello() {
        println("Hello, my name is ${name}.")
    }

    companion object {
        const val KIND = "Human"

        fun getInstance() = PersonKt()
        fun getInstance(name: String) = PersonKt(name)
        fun getInstance(name: String, age: Int) = PersonKt(name, age)
        fun getInstance(other: PersonKt) = PersonKt(other.name, other.age)

    }
}