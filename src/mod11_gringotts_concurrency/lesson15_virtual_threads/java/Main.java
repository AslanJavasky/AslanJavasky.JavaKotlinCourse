package mod11_gringotts_concurrency.lesson15_virtual_threads.java;


import java.util.concurrent.*;

//ForkJoinPool fork() join()
//RecursiveTask RecursiveAction

public class Main {

    public static final int CNT_TRANSACTIONS = 200;

    public static void main(String[] args) {

        //since java 17
//        try {
//            Thread.ofVirtual().name("test1").start(() -> {
//                for (int i = 0; i < 10; i++) {
//                   System.out.println(i+" : "+Thread.currentThread().getName());
//                }
//            }).join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

//        for (int i = 0; i < 10; i++) {
//            int finalI = i;
//            try {
//                Thread.ofVirtual()
//                        .name("test"+finalI)
//                        .start(() -> System.out.println(finalI+" : "+Thread.currentThread().getName()))
//                        .join();
//            } catch (InterruptedException e) {
//                Thread.currentThread().interrupt();
//            }
//        }

        //without executorService
//        BankAccount ollivander = new BankAccount("Ollivander's account", 15_000);
//        BankAccount hagrid = new BankAccount("Hadrid's account", 500_000);
//
//        Thread thread1 = Thread.ofVirtual().name("Hadrid's work").start(new Thread1(hagrid, ollivander));
//        Thread thread2 = Thread.ofVirtual().name("Assistant's work").start(new RunnableForThread2(hagrid, ollivander));
//
//        try {
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException e) {
//            Thread.currentThread().interrupt();
//        }
//
//        System.out.println("Balances after transfers:" + hagrid.getAccountName() + ":" + hagrid.getBalance() + ";" +
//                ollivander.getAccountName() + ":" + ollivander.getBalance());


        //with executor
        BankAccount ollivander = new BankAccount("Ollivander's account", 15_000);
        BankAccount hagrid = new BankAccount("Hadrid's account", 500_000);

        ExecutorService executor=Executors.newVirtualThreadPerTaskExecutor();
//        for (int i = 0; i < CNT_TRANSACTIONS; i++) {
//            executor.submit(() ->  hagrid.transferFunds(ollivander,10));
//        }
        executor.submit(new Thread1(hagrid, ollivander));
        executor.submit(new RunnableForThread2(hagrid, ollivander));

        executor.shutdown();

        try {
            if (!executor.awaitTermination(1,TimeUnit.MINUTES)){
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Balances after transfers:" + hagrid.getAccountName() + ":" + hagrid.getBalance() + ";" +
                ollivander.getAccountName() + ":" + ollivander.getBalance());

    }
}
