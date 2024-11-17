package mod10_design_pattern.lesson4_builder

data class MagicalCreatureK(
    val name: String,
    val type: String,
    val age: Int,
    val habitat: String
) {

    class Builder {
        private var name: String = ""
        private var type: String = ""
        private var age: Int = 0
        private var habitat: String = ""

        fun setName(name: String) = apply { this.name = name }
        fun setType(type: String) = apply { this.type = type }
        fun setAge(age: Int) = apply { this.age = age }
        fun setHabitat(habitat: String) = apply { this.habitat = habitat }
        fun build() = MagicalCreatureK(name, type, age, habitat)
    }

    companion object {
        fun builder() = Builder()
    }
}

fun main() {
    val hippogriff = MagicalCreatureK.builder()
        .setName("Klybokryl")
        .setAge(5)
        .setType("Hippogriff")
        .setHabitat("Forest")
        .build()

    println(hippogriff)
}