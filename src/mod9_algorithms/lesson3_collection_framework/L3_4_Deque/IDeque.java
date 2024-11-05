package mod9_algorithms.lesson3_collection_framework.L3_4_Deque;

import mod9_algorithms.lesson3_collection_framework.L3_3_Queue.IQueue;

public interface IDeque<E> extends IQueue<E> {

    void addFirst(E element);
    void addLast(E element);
    E removeFirst();
    E removeLast();
    E peekFirst();
    E peekLast();
}
