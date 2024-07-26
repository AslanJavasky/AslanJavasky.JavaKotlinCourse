package mod6_concurrency.lesson4_concurrency_collections

import java.util.*
import java.util.concurrent.*

fun main() {


    val list = CopyOnWriteArrayList<String>()
    list.add("Java")
    list.add("Kotlin")
    list.add("C++")

    val set = CopyOnWriteArraySet<String>()
    set.add("Java")
    set.add("Kotlin")
    set.add("C++")

    val sortedSet: SortedSet<String> = ConcurrentSkipListSet()
    sortedSet.add("Java")
    sortedSet.add("Kotlin")
    sortedSet.add("C++")
    println(sortedSet)

    val map: MutableMap<String, Int> = ConcurrentHashMap()
    map["First"] = 1
    map.put("Second", 2)
    map["Third"] = 3
    println(map)

    val sortedMap: MutableMap<String, Int> = ConcurrentSkipListMap()
    sortedMap["First"] = 1
    sortedMap["Second"] = 2
    sortedMap["Third"] = 3
    println(sortedMap)

    val queue: Queue<String> = ConcurrentLinkedQueue()
    queue.offer("First")
    queue.offer("Second")
    queue.offer("Third")
    println(queue)

}