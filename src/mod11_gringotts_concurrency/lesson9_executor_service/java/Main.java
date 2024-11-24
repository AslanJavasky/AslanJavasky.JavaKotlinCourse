package mod11_gringotts_concurrency.lesson9_executor_service.java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        BankAccount ollivander = new BankAccount("Ollivander's account", 15_000);
        BankAccount hagrid = new BankAccount("Hadrid's account", 500_000);

        ExecutorService executor = Executors.newFixedThreadPool(2);
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
