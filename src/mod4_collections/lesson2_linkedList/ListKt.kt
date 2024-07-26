package mod4_collections.lesson2_linkedList

fun main() {

    val names = mutableListOf("Aslan", "John")

    names.add(0, "Suzan")
    names[2] = "Bruse"//set()
    println("The first element is ${names[0]}")//get()
    names.removeIf { str -> str.startsWith("A") }
    println(names)


//    val arr= arrayListOf("")


}


