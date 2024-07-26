package mod2_oop.lesson20_generics

import java.text.SimpleDateFormat
import java.util.Date

data class PersonKt<T>(
    var name: String,
    var age: Int,
    var id: T?
) where T : Number {

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
    constructor() : this("", 0, null)

    //конструктор с параметром name
    constructor(name: String) : this(name, 0, null)

    fun sayHello() {
        println("Hello, my name is $name.")
    }

    companion object {
        const val KIND = "Human"

//        fun getInstance() = PersonKt()
//        fun getInstance(name: String) = PersonKt(name)
//        fun getInstance(name: String, age: Int) = PersonKt(name, age)
//        fun getInstance(other: PersonKt) = PersonKt(other.name, other.age)

    }
}