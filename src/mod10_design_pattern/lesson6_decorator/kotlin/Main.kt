package mod10_design_pattern.lesson6_decorator.kotlin

fun main() {

    val basicWand = PatronusWand()//1
    val fireWand = FireWand(basicWand)//2
    val lumosWand = LumosWand(fireWand)//3

    println(basicWand.castSpell())//Expecto Patronum!
    println(fireWand.castSpell())//Expecto Patronum! Expelliarmus!
    println(lumosWand.castSpell())//Expecto Patronum! Expelliarmus! Lumos!
}