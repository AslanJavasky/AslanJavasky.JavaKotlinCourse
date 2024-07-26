package mod1_syntax.lesson24_array

fun main() {

    val arrNums: Array<Int> = arrayOf(4, 8, 15, 16, 23, 42)
    val arrNumbers = IntArray(6);
    arrNumbers[0] = 4
    arrNumbers[1] = 8
    arrNumbers[2] = 15
    arrNumbers[3] = 16
    arrNumbers[4] = 23
    arrNumbers[5] = 42

    println("The size of arNumbers is ${arrNumbers.size}.")

    for (num in arrNumbers){
        println(num)
    }
}