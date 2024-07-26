package mod2_oop.lesson2_constructors

class PersonKt(
    var name: String, var age: Int
) {

    //пустой конструктор
    constructor() : this("", 0)

    //конструктор с параметром name
    constructor(name: String) : this(name, 0)

    fun sayHello() {
        println("Hello, my name is ${name}.")
    }


}