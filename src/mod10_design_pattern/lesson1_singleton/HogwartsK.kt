package mod10_design_pattern.lesson1_singleton

class HogwartsK private constructor() {

    fun enrollStudent(name: String) {
        println("Student $name enrolled in Hogwarts!")
    }

    companion object {

        private var INSTANCE: HogwartsK? = null

        @JvmStatic
        fun getInstance(): HogwartsK {
            if (INSTANCE == null) INSTANCE = HogwartsK()
            return INSTANCE!!
        }

    }
}

fun main() {
    val one = HogwartsK.getInstance()//.enrollStudent("Hermione Granger")
    val two = HogwartsK.getInstance()
    println(one == two)
}