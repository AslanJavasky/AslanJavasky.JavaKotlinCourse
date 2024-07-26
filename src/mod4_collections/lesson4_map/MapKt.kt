package mod4_collections.lesson4_map

fun main() {

    val mapOfPeople = mutableMapOf<String, Int>()

    mapOfPeople["Aslan"] = 33
    mapOfPeople.put("Bob", 30)
    mapOfPeople.put("Charlie", 35)

//    println(mapOfPeople)
    mapOfPeople.forEach { entry ->
        println("${entry.key} = ${entry.value}")
    }

    val linkedMap= linkedMapOf<String,Int>()
    linkedMap.putAll(mapOfPeople)

    val sortedMap= sortedMapOf<String,Int>()
    sortedMap.putAll(mapOfPeople)

}