package mod9_algorithms.lesson3_collection_framework.L3_2_List;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CustomList<E> implements IList<E> {

    private E[] elements;
    private static final int INITIAL_CAPACITY = 10;
    private int size;

    public CustomList() {
        this.elements = (E[]) new Object[INITIAL_CAPACITY];
        this.size = 0;
    }

    @Override
    public int size() {
        //O(1)
        return this.size;
    }

    @Override
    public E get(int index) {
        //O(1)
        validationIndex(index);
        return elements[index];
    }

    @Override
    public void add(int index, E element) {
        //O(n)+O(n)+O(1)+O(1)=O(n)
        Arrays.copyOf(elements, size + 1);
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }

    @Override
    public void addAll(IList<E> list) {
        //O(n)
        for (int i = 0; i < list.size(); i++) {
            this.add(size, list.get(i));
        }
    }

    @Override
    public E remove(int index) {
        //O(n)
        validationIndex(index);
        E removedElement = elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return removedElement;
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
    public boolean removeAll(IList<E> list) {
        //O(n)
        for (int i = 0; i < list.size(); i++) {
            remove(list.get(i));
        }
        return true;
    }

    @Override
    public int indexOf(E element) {
        //O(n)
        for (int i = 0; i < size; i++) {
            if ((elements[i].equals(element) && element != null) ||
                    (elements[i] == null && element == null)
            ) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(E element) {
        //O(n)
        for (int i = size; i >= 0; i--) {
            if ((elements[i].equals(element) && element != null) ||
                    (elements[i] == null && element == null)
            ) {
                return i;
            }
        }
        return -1;
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
            E[] newElements = (E[]) new Object[elements.length * 2];
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
        return "CustomList{" +
                "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                '}';
    }

    private void validationIndex(int index) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException("incorrect index:" + index);
    }
}
