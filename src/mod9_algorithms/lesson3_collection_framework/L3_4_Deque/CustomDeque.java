package mod9_algorithms.lesson3_collection_framework.L3_4_Deque;

import mod9_algorithms.lesson3_collection_framework.L3_3_Queue.CustomQueue;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.function.Consumer;

public class CustomDeque<E> extends CustomQueue<E> implements IDeque<E>, Iterable<E> {

    private Node<E> head;
    private Node<E> tail;

    private static class Node<E> {
        E element;
        Node<E> next;
        Node<E> prev;

        public Node(E element) {
            this.element = element;
        }
    }

    public CustomDeque() {
        super();
        head = null;
        tail = null;
    }

    @Override
    public void addFirst(E element) {
        //O(1)
        Node<E> newNode = new Node<>(element);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    @Override
    public void addLast(E element) {
        //O(1)
        Node<E> newNode = new Node<>(element);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    @Override
    public E removeFirst() {
        //O(1)
        if (head == null) throw new NoSuchElementException();
        E element = head.element;
        head = head.next;
        if (head == null) {
            tail = null;
        } else {
            head.prev = null;
        }
        size--;
        return element;
    }

    @Override
    public E removeLast() {
        //O(1)
        if (tail == null) throw new NoSuchElementException();
        E element = tail.element;
        tail = tail.prev;
        if (tail == null) {
            head = null;
        } else {
            tail.next = null;
        }
        size--;
        return element;
    }

    @Override
    public E peekFirst() {
        //O(1)
        if (head == null) return null;
        return head.element;
    }

    @Override
    public E peekLast() {
        //O(1)
        if (tail == null) return null;
        return tail.element;
    }

    @NotNull
    @Override
    public Iterator<E> iterator() {

        return new Iterator<E>() {
            private Node<E> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                if (!hasNext()) throw new NoSuchElementException();
                E element = current.element;
                current = current.next;
                return element;
            }
        };
    }

    @Override
    public void forEach(Consumer<? super E> action) {
        for (Node<E> node = head; node != null; node = node.next) {
            action.accept(node.element);
        }
    }

    @Override
    public Spliterator<E> spliterator() {
        return Iterable.super.spliterator();
    }
}
