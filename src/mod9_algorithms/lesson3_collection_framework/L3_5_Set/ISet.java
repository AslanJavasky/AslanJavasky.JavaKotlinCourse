package mod9_algorithms.lesson3_collection_framework.L3_5_Set;

import mod9_algorithms.lesson3_collection_framework.L3_1_Collection.ICollection;

public interface ISet<E> extends ICollection<E> {
    boolean add(E element);
    boolean remove(E element);
    boolean contains(E elements);
}
