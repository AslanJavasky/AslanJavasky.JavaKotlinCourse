package mod4_collections.lesson2_set

fun main() {

    val names = mutableListOf("Aslan", "Aslan", "Aslan", "Bruse", "Helen", "John", "Vladimir", "Zac")

    println("list of names: $names")

//    val setOfNames=names.toSet()
    val setOfNames = mutableSetOf("Aslan", "Aslan", "Aslan", "Bruse", "Helen", "John", "Vladimir", "Zac")
//    setOfNames += ("Severus")
    setOfNames.add("Severus")
    println("set of names $setOfNames")

    val sortedSetOfNames = setOfNames.toSortedSet()
    println("sorted set of names: $sortedSetOfNames")


}