package mod11_gringotts_concurrency.lesson12_concurrent_collections.java;

import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class CopyOnWriteArrayListCustom<T> implements List<T> {

    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private volatile T[] array;

    public CopyOnWriteArrayListCustom() {
        this.array = (T[]) new Object[0];
    }

    @Override
    public int size() {
        lock.readLock().lock();
        try {
            return array.length;
        } finally {
            lock.readLock().unlock();
        }
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        lock.readLock().lock();
        try {
            for (Object obj : array) {
                if (Objects.equals(obj, o)) return true;
            }
            return false;
        } finally {
            lock.readLock().unlock();
        }
    }

    @NotNull
    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<>(array);
    }

    @NotNull
    @Override
    public Object[] toArray() {
        lock.readLock().lock();
        try {
            return Arrays.copyOf(array, array.length);
        } finally {
            lock.readLock().unlock();
        }
    }

    @NotNull
    @Override
    public <T1> T1[] toArray(@NotNull T1[] a) {
        lock.readLock().lock();
        try {
            return (T1[]) Arrays.copyOf(array, array.length, a.getClass());
        } finally {
            lock.readLock().unlock();
        }
    }

    @Override
    public boolean add(T t) {
        lock.writeLock().lock();
        try {
            T[] newArray = Arrays.copyOf(array, array.length + 1);
            newArray[array.length] = t;
            array = newArray;
            return true;
        } finally {
            lock.writeLock().unlock();
        }
    }

    @Override
    public boolean remove(Object o) {
        lock.writeLock().lock();
        try {
            for (int i = 0; i < array.length; i++) {
                if (Objects.equals(o, array[i])) {
                    T[] newArray = (T[]) new Object[array.length - 1];
                    System.arraycopy(array, 0, newArray, 0, i);
                    System.arraycopy(array, i + 1, newArray, i, array.length - i - 1);
                    array = newArray;
                    return true;
                }
            }
            return false;
        } finally {
            lock.writeLock().unlock();
        }
    }

    @Override
    public boolean containsAll(@NotNull Collection<?> c) {
        lock.readLock().lock();
        try {
            for (Object item : c) {
                if (!contains(item)) {
                    return false;
                }
            }
            return true;
        } finally {
            lock.readLock().unlock();
        }
    }

    @Override
    public boolean addAll(@NotNull Collection<? extends T> c) {
        lock.writeLock().lock();
        try {
            T[] newArray = Arrays.copyOf(array, array.length + c.size());
            int index = array.length;
            for (T item : c) {
                newArray[index++] = item;
            }
            array = newArray;
            return true;
        } finally {
            lock.writeLock().unlock();
        }
    }

    @Override
    public boolean addAll(int index, @NotNull Collection<? extends T> c) {
        lock.writeLock().lock();
        try {
            if (index < 0 || index > array.length) {
                new IndexOutOfBoundsException("Index:" + index + ",Size:" + array.length);
            }

            T[] newArray = Arrays.copyOf(array, array.length + c.size());
            System.arraycopy(array, 0, newArray, 0, index);

            int currentIndex = index;
            for (T item : c) {
                newArray[currentIndex++] = item;
            }
            System.arraycopy(array, index, newArray, currentIndex, array.length - index);
            array = newArray;
            return true;
        } finally {
            lock.writeLock().unlock();
        }
    }

    @Override
    public boolean removeAll(@NotNull Collection<?> c) {
        lock.writeLock().lock();
        try {
            T[] newArray = (T[]) Arrays.stream(array)
                    .filter(item -> !c.contains(item))
                    .toArray();
            boolean changed = newArray.length != array.length;
            array = newArray;
            return changed;
        } finally {
            lock.writeLock().unlock();
        }
    }

    @Override
    public boolean retainAll(@NotNull Collection<?> c) {
        lock.writeLock().lock();
        try {
            T[] newArray = (T[]) Arrays.stream(array)
                    .filter(c::contains)
                    .toArray();
            boolean changed = newArray.length != array.length;
            array = newArray;
            return changed;
        } finally {
            lock.writeLock().unlock();
        }
    }

    @Override
    public void clear() {
        lock.writeLock().lock();
        try {
            array = (T[]) new Object[0];
        } finally {
            lock.writeLock().unlock();
        }
    }

    @Override
    public T get(int index) {
        lock.readLock().lock();
        try {
            return array[index];
        } finally {
            lock.readLock().unlock();
        }
    }

    @Override
    public T set(int index, T element) {
        lock.writeLock().lock();
        try {
            T[] newArray = Arrays.copyOf(array, array.length);
            newArray[index] = element;
            array = newArray;
            return array[index];
        } finally {
            lock.writeLock().unlock();
        }
    }


    @Override
    public void add(int index, T element) {
        lock.writeLock().lock();
        try {
            T[] newArray = (T[]) new Object[array.length + 1];
            System.arraycopy(array, 0, newArray, 0, index);
            newArray[index] = element;
            System.arraycopy(array, index, newArray, index + 1, array.length - index);
            array = newArray;
        } finally {
            lock.writeLock().unlock();
        }
    }

    @Override
    public T remove(int index) {
        lock.writeLock().lock();
        try {
            T[] newArray = (T[]) new Object[array.length - 1];
            System.arraycopy(array, 0, newArray, 0, index);
            System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
            T removedElement = array[index];
            array = newArray;
            return removedElement;
        } finally {
            lock.writeLock().unlock();
        }
    }

    @Override
    public int indexOf(Object o) {
        lock.readLock().lock();
        try {
            for (int i = 0; i < array.length; i++) {
                if (Objects.equals(o, array[i])) {
                    return i;
                }
            }
            return -1;
        } finally {
            lock.readLock().unlock();
        }
    }

    @Override
    public int lastIndexOf(Object o) {
        lock.readLock().lock();
        try {
            for (int i = array.length - 1; i >= 0; i--) {
                if (Objects.equals(o, array[i])) {
                    return i;
                }
            }
            return -1;
        } finally {
            lock.readLock().unlock();
        }
    }

    @NotNull
    @Override
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @NotNull
    @Override
    public ListIterator<T> listIterator(int index) {
        return new ArrayListIterator<>(index);
    }

    @NotNull
    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        lock.readLock().lock();
        try {
            return Arrays.asList(Arrays.copyOfRange(array, fromIndex, toIndex));
        } finally {
            lock.readLock().unlock();
        }
    }


    private class ArrayIterator<T> implements Iterator<T> {

        private final T[] array;
        private int index = 0;

        public ArrayIterator(T[] array) {
            this.array = Arrays.copyOf(array, array.length);
        }

        @Override
        public boolean hasNext() {
            return index < array.length;
        }

        @Override
        public T next() {
            if (!hasNext()) throw new NoSuchElementException();
            return array[index++];
        }
    }

    private class ArrayListIterator<E> implements ListIterator<T> {

        private int index;

        public ArrayListIterator(int index) {
            this.index = index;
        }

        @Override
        public boolean hasNext() {
            return index < array.length;
        }

        @Override
        public T next() {
            if (!hasNext()) throw new NoSuchElementException();
            return (T) array[index++];
        }

        @Override
        public boolean hasPrevious() {
            return index > 0;
        }

        @Override
        public T previous() {
            if (!hasPrevious()) throw new NoSuchElementException();
            return (T) array[--index];
        }

        @Override
        public int nextIndex() {
            return index;
        }

        @Override
        public int previousIndex() {
            return index - 1;
        }

        @Override
        public void remove() {
            CopyOnWriteArrayListCustom.this.remove(index - 1);
        }

        @Override
        public void set(T t) {
            CopyOnWriteArrayListCustom.this.set(index - 1, t);
        }

        @Override
        public void add(T t) {
            CopyOnWriteArrayListCustom.this.add(index++,t);
        }
    }



}
