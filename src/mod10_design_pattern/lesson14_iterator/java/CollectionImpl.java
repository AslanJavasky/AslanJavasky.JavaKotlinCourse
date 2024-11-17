package mod10_design_pattern.lesson14_iterator.java;

public class CollectionImpl<T> implements ICollection<T> {

    private T[] items;
    private int size;

    public CollectionImpl(T[] items) {
        this.items = items;
        this.size = items.length;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public T next() {
                return items[index++];
            }
        };
    }
}
