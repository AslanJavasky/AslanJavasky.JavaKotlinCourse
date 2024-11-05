package mod9_algorithms.lesson3_collection_framework.L3_3_Queue;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CustomQueue<E> implements IQueue<E> {

    private Node<E> head;
    private Node<E> tail;
    protected int size;

    //nested(static)
    private static class Node<E> {
        E element;
        Node<E> next;

        public Node(E element) {
            this.element = element;
        }
    }

    public CustomQueue() {
        this.head = null;
        this.tail = null;
        size = 0;
    }

    @Override
    public boolean offer(E element) {
        //O(1)
        Node<E> newNode = new Node<>(element);
        if (tail != null) tail.next = newNode;
        tail = newNode;
        if (head == null) head = tail;
        size++;
        return true;
    }


    @Override
    public E poll() {
        //O(1)
        if (head == null) return null;
        E element = head.element;
        head = head.next;
        if (head == null) tail = null;
        size--;
        return element;
    }

    @Override
    public E peek() {
        //O(1)
        if (head == null) return null;
        return head.element;
    }

    @Override
    public int size() {
        //O(1)
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        //O(1)
        return size == 0;
    }

    @Override
    public E remove() {
        if (head == null) throw new NoSuchElementException();
        E element = head.element;
        head = head.next;
        if (head == null) tail = null;
        size--;
        return element;
    }


    @Override
    public boolean add(E element) {
        return offer(element);
    }

    @Override
    public boolean remove(E element) {
        //O(n)
        Node<E> current = head;
        Node<E> prev = null;

        while (current != null) {
            if (current.element.equals(element)) {
                if (prev == null) {
                    head = current.next;
                } else {
                    prev.next = current.next;
                }
                if (current.next == null) {
                    tail = prev;
                }
                size--;
                return true;
            }
            prev = current;
            current = current.next;
        }
        return false;
    }

    @Override
    public boolean removeIf(Predicate<E> predicate) {
        //O(n)
        Node<E> current = head;
        Node<E> prev = null;
        boolean removed = false;

        while (current != null) {
            if (predicate.test(current.element)) {
                if (prev == null) {
                    head = current.next;
                } else {
                    prev.next = current.next;
                }
                if (current.next == null) {
                    tail = prev;
                }
                size--;
                removed = true;
            } else {
                prev = current;
            }
            current = current.next;
        }
        return removed;
    }

    @Override
    public void clear() {
        //O(1)
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public boolean contains(E element) {
        //O(n)
        Node<E> current = head;
        while (current != null) {
            if (current.element.equals(element)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

//    @Override
//    public void forEach(Consumer<E> consumer) {
//        //O(n)
//        Node<E> current = head;
//        while (current != null) {
//            consumer.accept(current.element);
//            current=current.next;
//        }
//    }

    @Override
    public String toString() {
        return "CustomQueue{" +
                "head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                '}';
    }
}
