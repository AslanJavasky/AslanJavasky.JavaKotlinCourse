package mod9_algorithms.lesson3_collection_framework.L3_5_Set;

import mod9_algorithms.lesson3_collection_framework.L3_2_List.CustomList;

public class Main {
    public static void main(String[] args) {


        CustomList<String> list=new CustomList<>();
        list.add("Aslan");
        list.add("John");
        list.add("Aslan");

        CustomSet<String> set=new CustomSet<>();
        set.add("Aslan");
        set.add("John");
        set.add("Aslan");

        System.out.println(set);
    }
}
