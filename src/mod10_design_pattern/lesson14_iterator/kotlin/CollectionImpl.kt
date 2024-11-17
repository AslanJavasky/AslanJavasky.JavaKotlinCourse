package mod10_design_pattern.lesson14_iterator.kotlin

class CollectionImpl<T>(
    private val items: Array<T>
) : Collection<T> {

    private var size = items.size

    override fun iterator(): Iterator<T> {
        return object : Iterator<T> {

            var index = 0

            override fun hasNext() = index < size

            override fun next(): T {
                if (!hasNext()) throw NoSuchElementException()
                return items[index++]
            }
        }
    }
}