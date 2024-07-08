package syntax.lesson14_scanner

import java.util.*

fun main() {

    val scanner: Scanner = Scanner(System.`in`)

    print("Enter your name: ")
    val name = scanner.nextLine()

    print("Enter your age: ")
    val age = scanner.nextInt()

    println("Hello, my name is $name! I'm a $age years old.")
    scanner.close()
}