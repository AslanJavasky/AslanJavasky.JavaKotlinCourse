package mod11_gringotts_concurrency.lesson6_cyclicBarrier.java;


import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Main {
    public static void main(String[] args) {

        BankAccount ollivander = new BankAccount("Ollivander's account", 15_000);
        BankAccount hagrid = new BankAccount("Hadrid's account", 500_000);

        CyclicBarrier cyclicBarrier =
                new CyclicBarrier(2, () ->
                        System.out.println("Balances after transfers:" + hagrid.getAccountName() + ":" + hagrid.getBalance() + ";" +
                        ollivander.getAccountName() + ":" + ollivander.getBalance()));

        Thread thread1 = new Thread1(hagrid, ollivander,cyclicBarrier);
        Thread thread2 = new Thread(new RunnableForThread2(hagrid, ollivander,cyclicBarrier));

        thread1.start();
        thread2.start();

    }
}
