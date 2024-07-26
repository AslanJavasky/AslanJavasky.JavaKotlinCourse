package mod2_oop.lesson13_interface

class TeacherKt:PersonKt {

    var subject:String=""

    constructor() : super()
    constructor(name: String) : super(name)
    constructor(name: String, age: Int) : super(name, age)
    constructor(name: String, age: Int, subject: String) : super(name, age) {
        this.subject = subject
    }

    override fun sayHello() {
        println("Hello, my name is $name. I'm a teacher.")
    }

    companion object {
        const val KIND = PersonKt.KIND
        fun getInstance() = TeacherKt()
        fun getInstance(name: String) = TeacherKt(name)
        fun getInstance(name: String, age: Int) = TeacherKt(name, age)
        fun getInstance(other: TeacherKt) = TeacherKt(other.name, other.age)
    }
}