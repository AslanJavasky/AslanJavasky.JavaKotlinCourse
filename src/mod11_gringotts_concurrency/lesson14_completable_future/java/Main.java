package mod11_gringotts_concurrency.lesson14_completable_future.java;

import java.util.concurrent.*;

//ForkJoinPool fork() join()
//RecursiveTask RecursiveAction

public class Main {

    public static final int CNT_TRANSACTIONS = 200;

    public static void main(String[] args) {

        BankAccount ollivander = new BankAccount("Ollivander's account", 15_000);
        BankAccount hagrid = new BankAccount("Hadrid's account", 500_000);

        //Future
//        ExecutorService executor = Executors.newFixedThreadPool(3);
//        Future<?> future1 = executor.submit(new Thread1(hagrid, ollivander));
//        Future<?> future2 = executor.submit(new RunnableForThread2(hagrid, ollivander));
//
//        try {
//            future1.get();
//            future2.get();
//        } catch (InterruptedException|ExecutionException e) {
//            throw new RuntimeException(e);
//        }
//
//        Future<String> futureTotal = executor.submit(() -> "Balances after transfers:" + hagrid.getAccountName() + ":" + hagrid.getBalance() + ";" +
//                ollivander.getAccountName() + ":" + ollivander.getBalance());
//
//        executor.shutdown();
//        try {
//            executor.awaitTermination(60, TimeUnit.SECONDS);
//            System.out.println(futureTotal.get());
//        } catch (InterruptedException | ExecutionException e) {
//            throw new RuntimeException(e);
//        }
        
        //CompletableFuture
        ExecutorService executor = Executors.newFixedThreadPool(3);

        CompletableFuture<Void> future1 = CompletableFuture.runAsync(new Thread1(hagrid, ollivander), executor);
        CompletableFuture<Void> future2 = CompletableFuture.runAsync(new RunnableForThread2(hagrid, ollivander), executor);

        CompletableFuture<Void> allOf = CompletableFuture.allOf(future1, future2);

        CompletableFuture<String> futureTotal = allOf.thenApplyAsync(
                (v) -> "Balances after transfers:" + hagrid.getAccountName() + ":" + hagrid.getBalance() + ";" +
                        ollivander.getAccountName() + ":" + ollivander.getBalance());

        futureTotal.thenAccept(System.out::println).join();
        executor.shutdown();

    }
}
