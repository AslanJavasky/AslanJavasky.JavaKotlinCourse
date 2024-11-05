package mod9_algorithms.lesson3_collection_framework.L3_6_stack;

//LIFO - Last In First Out
public interface IStack<E> {
    void push(E element);
    E pop();
    E peek();
    boolean isEmpty();
    int size();
    void clear();
}
