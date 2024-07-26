package mod4_collections.lesson5_queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
    public static void main(String[] args) {

        //FIFO-First Input First Output
        Queue<String> queueNames = new PriorityQueue<>();
//        Queue<String> queueNames = new ArrayBlockingQueue<>(2);
        queueNames.offer("Alice");
        queueNames.offer("Bob");
//        queueNames.add("Charlie");IllegalStateException
        System.out.println(queueNames);


        String firstElement = queueNames.poll();
        String secondElement = queueNames.poll();
//        String thirdElement = queueNames.remove();//NoSuchElementException
        System.out.println("First element : " + firstElement);
        System.out.println("Second element : " + secondElement);

        System.out.println(queueNames);

    }
}
