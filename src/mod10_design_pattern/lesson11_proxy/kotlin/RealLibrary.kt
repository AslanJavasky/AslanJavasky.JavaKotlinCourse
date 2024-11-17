package mod10_design_pattern.lesson11_proxy.kotlin

class RealLibrary : Library {
    override fun accessBook(bookName: String) {
        println("Acessing the book:$bookName")
    }
}