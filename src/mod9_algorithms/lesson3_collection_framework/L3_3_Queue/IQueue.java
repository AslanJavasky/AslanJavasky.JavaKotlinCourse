package mod9_algorithms.lesson3_collection_framework.L3_3_Queue;

import mod9_algorithms.lesson3_collection_framework.L3_1_Collection.ICollection;

import java.util.function.Consumer;
import java.util.function.Predicate;

public interface IQueue<E> extends ICollection<E> {

    boolean offer(E e);
    E remove();//NoSuchElementException is queue is empty
    E poll();//null if queue is empty

    E peek();
}
