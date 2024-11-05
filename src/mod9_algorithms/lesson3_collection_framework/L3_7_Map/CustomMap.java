package mod9_algorithms.lesson3_collection_framework.L3_7_Map;

import mod9_algorithms.lesson3_collection_framework.L3_4_Deque.CustomDeque;

import java.util.Iterator;

public class CustomMap<K, V> implements IMap<K, V> {

    private static class Entry<K, V> {
        K key;
        V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private CustomDeque<Entry<K, V>>[] table;
    private int size;

    public CustomMap() {
        this(5);
    }

    public CustomMap(int capacity) {
        //O(n)
        table = new CustomDeque[capacity];
        for (int i = 0; i < capacity; i++) {
            table[i] = new CustomDeque<>();
        }
        size = 0;
    }


    @Override
    public void put(K key, V value) {
//        key->hash
        //O(1)..O(n)
        CustomDeque<Entry<K, V>> deque = getBucketByKey(key);
        for (Entry<K, V> entry : deque) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
        deque.addLast(new Entry<>(key, value));
    }

    @Override
    public V get(K key) {
        //O(1)..O(n)
        CustomDeque<Entry<K, V>> deque = getBucketByKey(key);

        for (Entry<K, V> entry : deque) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    @Override
    public void remove(K key) {
        //O(1)..O(n)
        CustomDeque<Entry<K, V>> deque = getBucketByKey(key);

        Iterator<Entry<K, V>> it = deque.iterator();
        while (it.hasNext()) {
            Entry<K, V> entry = it.next();
            if (entry.key.equals(key)) {
                it.remove();
                size--;
                break;
            }
        }

    }

    @Override
    public boolean containsKey(K key) {
        //O(1)..O(n)
        CustomDeque<Entry<K, V>> deque = getBucketByKey(key);
        for (Entry<K, V> entry : deque) {
            if (entry.key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        //O(1)
        return size;
    }

    @Override
    public void clear() {
        //O(n)
        for (int i = 0; i < table.length; i++) {
            table[i].clear();
        }
    }

    private int hash(K key) {
        //O(1)
        return Math.abs(key.hashCode() % table.length);
    }

    private CustomDeque<Entry<K, V>> getBucketByKey(K key) {
        //O(1)
        return table[hash(key)];
    }
}
