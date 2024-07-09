package mod1_syntax.lesson14_scanner

fun main() {

    print("Enter your name: ")
    val name = readLine()

    print("Enter your age: ")
    val age:Int =readLine()?.toIntOrNull() ?: 0

    println("Hello, my name is $name! I'm a $age years old.")





}