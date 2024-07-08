package syntax.lesson14_scanner

import java.util.*

fun main() {

    print("Enter your name: ")
    val name = readLine()

    print("Enter your age: ")
    val age:Int =readLine()?.toIntOrNull() ?: 0

    println("Hello, my name is $name! I'm a $age years old.")





}