package mod9_algorithms.lesson3_collection_framework.L3_6_stack;

import java.util.NoSuchElementException;

public class Stack<E> implements IStack<E> {

    private Node<E> top;
    private int size;

    //nested class (static)
    private static class Node<E> {
        E element;
        Node<E> next;

        public Node(E element) {
            this.element = element;
        }
    }

    public Stack() {
        top = null;
        size = 0;
    }

    @Override
    public void push(E element) {
        //O(1)
        Node<E> newElement = new Node<>(element);
        newElement.next = top;
        top = newElement;
        size++;
    }

    @Override
    public E pop() {
        //O(1)
        if (isEmpty()) throw new NoSuchElementException("Stack is empty!");
        E element = top.element;
        top = top.next;
        size--;
        return element;
    }

    @Override
    public E peek() {
        //O(1)
        if (isEmpty()) return null;
        return top.element;
    }

    @Override
    public boolean isEmpty() {
        //O(1)
        return size == 0;
    }

    @Override
    public int size() {
        //O(1)
        return size;
    }

    @Override
    public void clear() {
        //O(1)
        top = null;
        size=0;
    }
}
