package mod2_oop.lesson19_comparator

fun main() {

    val aslan = StudentKt("Aslan", 32, 5)
    val john = StudentKt("John", 32, 4)

    println(aslan.compareTo(john))//1

    val studentComparator = Comparator<StudentKt> { s1, s2 ->
        s1.compareTo(s2)
    }
    println(studentComparator.compare(aslan, john))//1


//    emptyList<StudentKt>().sortedWith(studentComparator)
}