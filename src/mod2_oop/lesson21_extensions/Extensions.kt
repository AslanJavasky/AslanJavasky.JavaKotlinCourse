package mod2_oop.lesson21_extensions

fun main() {

    val name = "Aslan"
    println(name.razvernyt())//nalsA

    println("The number 10 is Even? answer : ${10.isEven()}")//true
    println("The number 23 is Even? answer : ${23.isEven()}")//false

    val town = "Cherkessk"
    println(town.povtori(5))

}

//extensions
fun String.razvernyt() = this.reversed()
fun Int.isEven() = this % 2 == 0
fun String.povtori(cnt:Int)=this.repeat(cnt)

