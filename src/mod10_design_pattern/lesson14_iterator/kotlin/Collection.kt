package mod10_design_pattern.lesson14_iterator.kotlin

interface Collection<T> {
    fun iterator():Iterator<T>
}