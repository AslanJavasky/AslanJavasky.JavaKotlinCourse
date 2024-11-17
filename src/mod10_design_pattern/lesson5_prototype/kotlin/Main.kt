package mod10_design_pattern.lesson5_prototype.kotlin

fun main() {

    val firstBook = Book(
        "Harry Potter and the Philosopher's Stone",
        "J.K.Rowling"
    )

    val secondBook=firstBook.clone()

    println(firstBook === secondBook)

}