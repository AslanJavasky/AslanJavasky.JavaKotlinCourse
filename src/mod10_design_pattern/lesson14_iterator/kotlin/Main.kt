package mod10_design_pattern.lesson14_iterator.kotlin

fun main() {

    var arr = arrayOf<String>("Harry Potter", "Hermione Granger", "Ronald Weasley")
    val collection = CollectionImpl(arr)

    val iterator=collection.iterator()

    while (iterator.hasNext()){
        println(iterator.next())
    }
}