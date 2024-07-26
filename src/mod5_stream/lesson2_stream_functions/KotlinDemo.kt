package mod5_stream.lesson2_stream_functions

fun main() {
    val students = listOf(
        Student("Alice", 20, 3),
        Student("Bob", 22, 4),
        Student("Charlie", 21, 3),
        Student("Katherine", 21, 3),
        Student("Liam", 19, 2),
        Student("Mia", 20, 3),
        Student("Noah", 22, 4),
        Student("Olivia", 21, 3),
        Student("David", 19, 2),
        Student("Emma", 20, 3),
        Student("Frank", 22, 4),
        Student("Grace", 21, 3),
        Student("Helena", 19, 2),
        Student("Isabella", 20, 3),
        Student("Jack", 22, 4)
    )

    //Кол-во третьекурсников
    val cnt3 = students.count { it.course == 3 }

    //Студенты старше 20 лет
    val studentsOlder20 = students.filter { it.age > 20 }

    //Массив с именами студентов
    val studentNames = students.map { it.name }

    //Отсортируйте по именам
    val sortedbyName = students.sortedBy { it.name }

    //Отсортируйте по возрасту
    val sortedStudentsByAge = students.sortedBy { it.age }

    //Отсортируйте по курсам
    val sortedByCourse=students.sortedBy { it.course }

    //Достать первого студента из 4го курса
    val firstStudentFrom4=students.find { it.course == 4 }

    //Суммарное кол-во лет всех студентов
    val totalAge= students.sumOf { it.age }

    //Вычислить средний возраст всех студентов
    val avgAge=students.map { it.age }.average()

}