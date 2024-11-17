package mod10_design_pattern.lesson10_flyweight.kotlin


class Cat(
    private val type: String,
    private val color: String
) : MagicalCreature {

    override fun display(name: String, owner: String) {
        println("Cat's name is $name, owner is $owner")
    }
}