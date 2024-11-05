package mod9_algorithms.lesson3_collection_framework.L3_1_Collection;

import java.util.function.Consumer;
import java.util.function.Predicate;

public interface ICollection<E> {
    int size();
    boolean isEmpty();
    boolean add(E element);
    boolean remove(E element);
    boolean removeIf(Predicate<E> predicate);
    void clear();
    boolean contains(E element);
//    void forEach(Consumer<E> consumer);
}
