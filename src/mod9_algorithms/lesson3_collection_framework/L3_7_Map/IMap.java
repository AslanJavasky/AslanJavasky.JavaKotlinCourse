package mod9_algorithms.lesson3_collection_framework.L3_7_Map;

public interface IMap<K, V> {
    void put(K key, V value);
    V get(K key);
    void remove(K key);
    boolean containsKey(K key);
    int size();
    void clear();
}
