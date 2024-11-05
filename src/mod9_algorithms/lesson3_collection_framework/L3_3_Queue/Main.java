package mod9_algorithms.lesson3_collection_framework.L3_3_Queue;

public class Main {
    public static void main(String[] args) {

        CustomQueue<Integer> queue=new CustomQueue<>();//FIFO

        //add elements
        queue.offer(4);
        queue.offer(8);
        queue.offer(15);
        queue.offer(16);
        queue.offer(23);
        queue.offer(42);

        //peek()
        System.out.println(queue.peek());//4


        //remove
        System.out.println(queue.poll());
        System.out.println(queue.remove());

        System.out.println(queue.contains(42));
        System.out.println(queue.contains(43));

    }
}
