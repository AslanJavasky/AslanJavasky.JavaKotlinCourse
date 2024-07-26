package mod2_oop.lesson5_factory_methods

import mod2_oop.lesson4_static_fields_method.Person
import java.text.SimpleDateFormat
import java.util.Date

class PersonKt constructor(
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


    //пустой конструктор
    constructor() : this("", 0)

    //конструктор с параметром name
    constructor(name: String) : this(name, 0)

    fun sayHello() {
        println("Hello, my name is ${name}.")
    }

    companion object {
        const val KIND = "Human"

        fun getInstance() = PersonKt()
        fun getInstance(name: String) = PersonKt(name)
        fun getInstance(name: String, age: Int) = PersonKt(name, age)

    }
}