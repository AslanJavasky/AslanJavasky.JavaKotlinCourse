package mod10_design_pattern.lesson10_flyweight.kotlin

class CreatureFactory {
    private val cratures = mutableMapOf<String, MagicalCreature>()

    fun getCreature(type: String, color: String): MagicalCreature {
        val key = "$type:$color"
        return cratures.getOrPut(key) {
            when (type) {
                "owl" -> Owl(type, color)
                "cat" -> Cat(type, color)
                else -> throw IllegalArgumentException("Unknown creature type")
            }
        }
    }
}