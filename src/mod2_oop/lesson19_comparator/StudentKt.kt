package mod2_oop.lesson19_comparator

import java.util.*

class StudentKt : PersonKt, Comparable<StudentKt> {

    var course: Int = 0

    constructor() : super()
    constructor(name: String) : super(name)
    constructor(name: String, age: Int) : super(name, age)
    constructor(name: String, age: Int, course: Int) : super(name, age) {
        this.course = course
    }

    override fun sayHello() {
        println("Hello, my name is $name. I'm a student.")
    }

    override fun compareTo(other: StudentKt): Int {
        return if (this.age > other.age) {
            1
        } else if (this.age < other.age) {
            -1
        } else {
            0
        }
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if (other !is StudentKt) {
            return false
        }
        return name == other.name && age == other.age
                && course == other.course

    }

    override fun hashCode(): Int {
        return Objects.hash(name, age, course)
    }

    override fun toString(): String {
        return "Student[name=" + name + ",age=" + age + ",course=" + course + "]"
    }

    companion object {
        const val KIND = PersonKt.KIND
        fun getInstance() = StudentKt()
        fun getInstance(name: String) = StudentKt(name)
        fun getInstance(name: String, age: Int) = StudentKt(name, age)
        fun getInstance(other: StudentKt) = StudentKt(other.name, other.age)
    }
}