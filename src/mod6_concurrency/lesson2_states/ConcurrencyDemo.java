package mod6_concurrency.lesson2_states;

import mod6_concurrency.lesson2_states.PrintThread;

public class ConcurrencyDemo {
    public static void main(String[] args) throws InterruptedException {

        //Состояния:NEW, RUNNABLE, BLOCKED, WAITING,TIMED_WAITING,TERMINATED

        var thread1 = new PrintThread();
        var thread2 = new PrintThread();
        thread1.start();
        thread2.start();

        Thread.sleep(5_000);
        synchronized (thread1) {
//            thread1.wait();//WAITING
            thread1.wait(5000);//TIMED_WAITING
        }
        System.out.println("The state of thread1 is " + thread1.getState());//TERMINATED

        var LOCK = new Object();
        synchronized (LOCK) {
            System.out.println("There is only one thread here!");
        }

        PrintThread.staticMethodName();
        PrintThreadKt.staticMethodName();

    }
}
