package mod9_algorithms.lesson3_collection_framework.L3_2_List;

public class Main {
    public static void main(String[] args) {

        var list=new CustomList<Integer>();
        System.out.println(list.isEmpty());
        list.add(4);
        list.add(15);//index=1
        System.out.println(list.indexOf(15));//1
        list.add(1,23);
        System.out.println(list.indexOf(15));//2
        System.out.println(list.isEmpty());
        System.out.println(list );

        System.out.println(list.contains(42));
        System.out.println(list.contains(23));

    }
}
