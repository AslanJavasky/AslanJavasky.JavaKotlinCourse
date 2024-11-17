package mod10_design_pattern.lesson2_factory.kotlin

object MagicalCreatureFactory {
    fun createCteature(type: String): MagicalCreature {
        return when (type.lowercase()) {
            "griffin" -> Griffin()
            "dragon" -> Gragon()
            else -> throw IllegalArgumentException("type $type is incorrect type!")
        }
    }
}