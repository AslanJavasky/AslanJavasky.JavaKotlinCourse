package mod6_concurrency.lesson4_concurrency_collections;

import java.util.*;
import java.util.concurrent.*;

public class ConcCollcetionsDemo {
    public static void main(String[] args) {

        List<String> list = new CopyOnWriteArrayList<>();
        list.add("Java");
        list.add("Kotlin");
        list.add("C++");
        System.out.println(list);

        Set<String> set = new CopyOnWriteArraySet<>();
        set.add("Java");
        set.add("Kotlin");
        set.add("C++");
        System.out.println(set);

        SortedSet<String> sortedSet = new ConcurrentSkipListSet<>();
        sortedSet.add("Java");
        sortedSet.add("Kotlin");
        sortedSet.add("C++");
        System.out.println(sortedSet);

        Map<String, Integer> map = new ConcurrentHashMap<>();
        map.put("First", 1);
        map.put("Second", 2);
        map.put("Third", 3);
        System.out.println(map);

        Map<String, Integer> sortedMap = new ConcurrentSkipListMap<>();
        sortedMap.put("First", 1);
        sortedMap.put("Second", 2);
        sortedMap.put("Third", 3);
        System.out.println(sortedMap);

        Queue<String> queue = new ConcurrentLinkedQueue<>();
        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");
        System.out.println(queue);

    }
}
