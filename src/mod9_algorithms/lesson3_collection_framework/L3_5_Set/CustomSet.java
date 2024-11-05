package mod9_algorithms.lesson3_collection_framework.L3_5_Set;

import mod9_algorithms.lesson3_collection_framework.L3_1_Collection.Collection;

import java.util.Arrays;

public class CustomSet<E> extends Collection<E> implements ISet<E> {

    private E[] elements;
    private static final int INITIAL_CAPACITY = 10;
    private int size;

    public CustomSet() {
        this.elements = (E[]) new Object[INITIAL_CAPACITY];
        this.size = 0;
    }

    @Override
    public boolean contains(E element) {
        //O(n)
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) return true;
        }
        return false;
    }

    @Override
    public boolean add(E element) {
        //O(n)
        if (contains(element)) {
            return false;
        }
        if (elements.length == size) elements = Arrays.copyOf(elements, size * 2);
        elements[size++] = element;
        return true;
    }

    @Override
    //O(n)
    public boolean remove(E element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)){
                elements[i]=elements[size-1];
                elements[size-1]=null;
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "CustomSet{" +
                "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                '}';
    }
}
