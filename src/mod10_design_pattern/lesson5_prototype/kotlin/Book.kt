package mod10_design_pattern.lesson5_prototype.kotlin

data class Book(
    val title: String,
    val author: String
) : Prototype {
    override fun clone(): Prototype {
        return Book(this.title, this.author)
    }
}
