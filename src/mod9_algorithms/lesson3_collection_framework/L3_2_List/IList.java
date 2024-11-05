package mod9_algorithms.lesson3_collection_framework.L3_2_List;

import mod9_algorithms.lesson3_collection_framework.L3_1_Collection.ICollection;

public interface IList<E> extends ICollection<E> {

    E get(int index);
    void add(int index, E element);
    void addAll(IList<E> list);
    E remove(int index);
    boolean removeAll(IList<E> list);
    int indexOf(E element);
    int lastIndexOf(E element);

}
