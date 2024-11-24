package mod11_gringotts_concurrency.lesson13_fork_join.java;

import java.util.concurrent.*;

//ForkJoinPool fork() join()
//RecursiveTask RecursiveAction

public class Main {

    public static final int CNT_TRANSACTIONS = 200;

    public static void main(String[] args) {

        BankAccount ollivander = new BankAccount("Ollivander's account", 15_000);
        BankAccount hagrid = new BankAccount("Hadrid's account", 500_000);


        //without RecursiveTask/RecursiveAction
//        ForkJoinPool forkJoinPool=new ForkJoinPool();
//        forkJoinPool.submit(new Thread1(hagrid,ollivander));
//        forkJoinPool.submit(new RunnableForThread2(hagrid,ollivander));
//        forkJoinPool.shutdown();
//        try {
//            forkJoinPool.awaitTermination(60, TimeUnit.SECONDS);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        //with RecursiveAction
        Transfer[] transfers = new Transfer[CNT_TRANSACTIONS];
        for (int i = 0; i < CNT_TRANSACTIONS; i++) {
            transfers[i] = new Transfer(hagrid, ollivander, 10);
        }

        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ResursiveActionForTransfer task = new ResursiveActionForTransfer(transfers, 0, CNT_TRANSACTIONS);
        forkJoinPool.invoke(task);

        System.out.println("Balances after transfers:" + hagrid.getAccountName() + ":" + hagrid.getBalance() + ";" +
                ollivander.getAccountName() + ":" + ollivander.getBalance());


    }
}
