package mod4_collections.lesson2_linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        //List
        List<String> names = new LinkedList<>();
        names.add("Aslan");
        names.add("John");
        names.add("Bruse");
        System.out.println(names);
        names.add("Vladimir");
        System.out.println(names);
        System.out.println("The first element is " + names.get(0));
        System.out.println("The second element is " + names.get(1));
        System.out.println("The last element is " + names.get(names.size() - 1));

        names.set(2, "Suzan");
        System.out.println(names);

//        names.remove("Vladimir");
//        names.remove(3);
        names.removeLast();
        System.out.println(names);

        System.out.println("The list contains \"Suzan\" : " + names.contains("Suzan"));
        System.out.println("The list contains \"Andrey\" : " + names.contains("Andrey"));

    }
}
