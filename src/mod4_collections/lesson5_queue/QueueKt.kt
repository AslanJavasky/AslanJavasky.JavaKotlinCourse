package mod4_collections.lesson5_queue

import java.util.*

fun main() {

    val queueName = PriorityQueue<String>()
    queueName.offer("Aslan")
    queueName.offer("Alice")
    queueName.offer("Bob")
    queueName.offer("John")
    println(queueName)
    queueName.poll()
    println(queueName)


    val deque: Deque<String> = ArrayDeque()
    deque.addFirst("Alice")
    deque.addLast("Bob")
    deque.addLast("Charlie")
    println("deque=$deque")

    val firstPerson = deque.removeFirst()
    val lastPerson = deque.removeLast()
    println("First element=$firstPerson")
    println("Last element=$lastPerson")
    println(deque)


}