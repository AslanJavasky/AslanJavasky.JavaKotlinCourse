package mod10_design_pattern.lesson14_iterator.kotlin

interface Iterator<T> {
    fun hasNext():Boolean
    fun next():T
}