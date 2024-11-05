package mod9_algorithms.lesson3_collection_framework.L3_4_Deque;

public class Main {
    public static void main(String[] args) {

        CustomDeque<Integer> deque = new CustomDeque<>();

        deque.addLast(4);
        deque.addLast(8);
        deque.addLast(15);
        deque.addLast(16);
        deque.addLast(23);
        deque.addLast(42);//42 23 16 15 8 4

        deque.addFirst(108);//42 23 16 15 8 4 108

        System.out.println(deque.removeFirst());//42 23 16 15 8 4
        System.out.println(deque.removeFirst());//42 23 16 15 8
        System.out.println(deque.removeLast());//23 16 15 8
    }
}
