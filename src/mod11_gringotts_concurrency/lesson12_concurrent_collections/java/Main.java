package mod11_gringotts_concurrency.lesson12_concurrent_collections.java;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.*;

public class Main {


    public static void main(String[] args) {

        List<String> historyList = new CopyOnWriteArrayListCustom<>();
        Map<String, String> transactionStates = new ConcurrentHashMap<>();

        BankAccount ollivander = new BankAccount("Ollivander's account", 15_000);
        BankAccount hagrid = new BankAccount("Hadrid's account", 500_000);

        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(new Thread1(hagrid, ollivander, historyList, transactionStates));
        executor.submit(new RunnableForThread2(hagrid, ollivander, historyList, transactionStates));

        executor.shutdown();

        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        historyList.forEach(System.out::println);
        transactionStates.entrySet().forEach(System.out::println);
        System.out.println("Balances after transfers:" + hagrid.getAccountName() + ":" + hagrid.getBalance() + ";" +
                ollivander.getAccountName() + ":" + ollivander.getBalance());
    }
}
