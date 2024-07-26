package mod4_collections.lesson1_list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        //Array
//        String[] arr = {"Aslan", "John", "Vladimir"};
////        String[] arr2 = new String [3];
//        for (String name:arr){
//            System.out.println(name);
//        }
//        arr.add("Suzan");
//        arr[2]="Suzan";
//        for (String name:arr){
//            System.out.println(name);
//        }

        //List
        List<String> names = new ArrayList<>();
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
