package mod1_syntax.lesson19_functions

fun main() {

    println("The sum of first 10 numbers is ${getSumOfNumbers(10)}")
    println("The sum of first 999 numbers is ${getSumOfNumbers(999)}")
    println("The sum of first 25 numbers is ${getSumOfNumbers(25)}")
    println("The sum of first 999999999 numbers is ${getSumOfNumbers(999999999)}")

    println("The sum of numbers 15 and 35 is ${getSumOfTwoNumbers(15, 35)}")
    println("The sum of numbers 37 and 23 is ${getSumOfTwoNumbers(37, 23)}")

}


fun getSumOfNumbers(number: Int): Long {

    var cnt = 0
    var sum = 0L
    while (cnt <= number) {
        sum += cnt
        cnt++
    }

    return sum
}

fun getSumOfTwoNumbers(a: Int, b: Int) = (a + b).toLong()