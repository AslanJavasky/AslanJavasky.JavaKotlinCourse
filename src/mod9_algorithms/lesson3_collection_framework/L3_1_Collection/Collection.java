package mod9_algorithms.lesson3_collection_framework.L3_1_Collection;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Collection<E> implements ICollection<E> {

    private Object[] elements;
    private static final int INITIAL_CAPACITY = 10;
    private int size;

    public Collection() {
        this.elements = new Object[INITIAL_CAPACITY];
        this.size = 0;
    }

    @Override
    public int size() {
        //O(1)
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        //O(1)
        return this.size == 0;
    }

    @Override
    public boolean add(E element) {
        //O(n) - в худшем случае, если нужно расширять массив
        if (elements.length == size) {
            Object[] newElements = new Object[elements.length * 2];
            for (int i = 0; i < size; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
//            System.arraycopy(elements,0,newElements,0,size);
        }
        elements[size++] = element;//O(1)
        return true;
    }

    @Override
    public boolean remove(E element) {
        //O(n)
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                for (int j = i; j < size - 1; j++) {
                    elements[j] = elements[j + 1];
                }
                elements[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removeIf(Predicate<E> predicate) {
        //O(n)
        boolean removed = false;
        for (int i = size; i >= 0; i--) {
            if (elements[i] == null) continue;
            if (predicate.test((E) elements[i])) {
                remove((E) elements[i]);
                removed = true;
            }
        }
        return removed;
    }

    @Override
    public void clear() {
        //O(n)
        for (int i = size; i >= 0; i--) {
            remove((E) elements[i]);
        }
        size = 0;
    }

    @Override
    public boolean contains(E element) {
        //O(n)
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }


//    @Override
//    public void forEach(Consumer<E> consumer) {
//        //O(n)
//        for (int i = 0; i < size; i++) {
//            consumer.accept((E) elements[i]);
//        }
//    }

    @Override
    public String toString() {
        //O(n)
        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();

    }
}