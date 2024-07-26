package mod6_concurrency.lesson6_callable_future_completableFuture;

import java.util.concurrent.*;

public class ThreadPoolExecutorDemo {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(5);

        Callable<String> callable = () -> {
            //some instructions
            return "The result of operation!";

        };
        executor.submit(() -> {
            System.out.println("Task 1 executing....");
        });
        executor.submit(() -> {
            System.out.println("Task 2 executing ...");
        });
        Future<String> future = executor.submit(callable);
        try {
            String result = future.get();
            System.out.println("The result of callable is:" + result);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        executor.shutdown();

        //CompletableFuture
        CompletableFuture<String> complFuture = CompletableFuture.supplyAsync(() -> {
            //some instructors
            return "Result string";
        });

        CompletableFuture<Integer> integerFuture = complFuture.thenApply(string -> string.length());

        try {
            Integer resultOfCompletableFuture = integerFuture.get();
            System.out.println("resultOfCompletableFuture="+resultOfCompletableFuture);
        } catch (InterruptedException|ExecutionException e) {
            throw new RuntimeException(e);
        }

    }
}
