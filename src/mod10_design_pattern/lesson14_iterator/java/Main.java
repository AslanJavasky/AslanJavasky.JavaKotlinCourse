package mod10_design_pattern.lesson14_iterator.java;

import java.util.*;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {


//        String[] items = {"Harry Potter", "Hermione Granger", "Ron Weasley"};
//        CollectionImpl collection = new CollectionImpl(items);
//
//        Iterator<String> iterator=collection.iterator();
//
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        List<String> list = new ArrayList<>(
                List.of("Harry Potter", "Hermione Granger", "Ron Weasley"));
        Iterator<String> iterator=  list.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (String elem:list){
            System.out.println(elem);
        }

    }
}
