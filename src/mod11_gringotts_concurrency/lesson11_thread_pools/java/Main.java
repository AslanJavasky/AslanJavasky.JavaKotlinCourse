package mod11_gringotts_concurrency.lesson11_thread_pools.java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        BankAccount ollivander = new BankAccount("Ollivander's account", 15_000);
        BankAccount hagrid = new BankAccount("Hadrid's account", 500_000);

        //newFixedThreadPool()
//        ExecutorService executor = Executors.newFixedThreadPool(2);
//        executor.submit(new Thread1(hagrid, ollivander));
//        executor.submit(new RunnableForThread2(hagrid, ollivander));
//        executor.shutdown();

        //newCachedThreadPool()
//        ExecutorService executor = Executors.newCachedThreadPool();
//        executor.submit(() -> hagrid.transferFunds(ollivander, 5_000));
//        executor.submit(() -> ollivander.transferFunds(hagrid, 3_000));
//        executor.shutdown();

        //newScheduledThreadPool()
//        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
//        executor.schedule(new Thread1(hagrid, ollivander),10, TimeUnit.SECONDS);
//        executor.schedule(new RunnableForThread2(hagrid, ollivander),15, TimeUnit.SECONDS);
//        executor.shutdown();

        //newScheduledThreadPool()
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(new Thread1(hagrid, ollivander));
        executor.submit(new RunnableForThread2(hagrid, ollivander));
        executor.shutdown();

        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Balances after transfers:" + hagrid.getAccountName() + ":" + hagrid.getBalance() + ";" +
                ollivander.getAccountName() + ":" + ollivander.getBalance());
    }
}
