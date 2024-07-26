package mod4_collections.lesson2_set;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        //List
        List<String> namesList = new LinkedList<>();
        namesList.add("Aslan");
        namesList.add("Aslan");
        namesList.add("John");
        namesList.add("Bruse");
        namesList.add("Vladimir");
        System.out.println("list of names: " + namesList);


        Set<String> setOfNames = new HashSet<>();
        setOfNames.add("Helen");
        setOfNames.addAll(namesList);
        System.out.println("set of names :" + setOfNames);

        Set<String> sortedSetOfNames = new TreeSet<>();
        sortedSetOfNames.add("Zac");
        sortedSetOfNames.addAll(setOfNames);
        System.out.println("sorted set of names: " + sortedSetOfNames);

        Set<String> linkedSet = new LinkedHashSet<>();
        linkedSet.addAll(sortedSetOfNames);
        System.out.println("linked set of names :" + linkedSet);

    }
}
