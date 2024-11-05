package mod9_algorithms.lesson3_collection_framework.L3_7_Map;

public class Main {
    public static void main(String[] args) {

        CustomMap<String,Integer> map=new CustomMap<>();
        map.put("Aslan",32);
        map.put("John",31);
        map.put("Helen",27);
        map.put("Bob",19);

        System.out.println(map.containsKey("John"));
        System.out.println(map.containsKey("Barak"));

        System.out.println(map.get("Helen"));

    }
}
