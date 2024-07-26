package mod4_collections.lesson4_map;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {

        Map<String, Integer> mapOfPeople = new HashMap<>();
        mapOfPeople.put("Aslan", 33);
        mapOfPeople.put("Bob", 30);
        mapOfPeople.put("Charlie", 35);

        System.out.println("HashMap: "+ mapOfPeople);
//        System.out.println("The Bob's age is " + mapOfPeople.get("Bob") + " years old.");
//
//        mapOfPeople.put("Bob", 20);
//        System.out.println("The Bob's age is " + mapOfPeople.get("Bob") + " years old.");
//
//        for (Map.Entry<String, Integer> entry : mapOfPeople.entrySet()) {
//            String name = entry.getKey();
//            Integer age = entry.getValue();
//            System.out.println("name=" + name + ",age=" + age);
//        }

        Map<String,Integer> mapLinked=new LinkedHashMap<>();
        mapLinked.putAll(mapOfPeople);

        Map<String,Integer> sortedMapOfNames= new TreeMap<>();
        sortedMapOfNames.putAll(mapOfPeople);

        System.out.println("TreeMap:"+sortedMapOfNames);



    }
}
