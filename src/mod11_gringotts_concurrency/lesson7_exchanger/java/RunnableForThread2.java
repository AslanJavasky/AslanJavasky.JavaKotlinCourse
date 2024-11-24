package mod11_gringotts_concurrency.lesson7_exchanger.java;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Exchanger;

public class RunnableForThread2 implements Runnable {

    private final BankAccount srcAccount;
    private final BankAccount targetAccount;
    private final CyclicBarrier cyclicBarrier;
    private final Exchanger<String> exchanger;

    public RunnableForThread2(
            BankAccount srcAccount, BankAccount targetAccount, CyclicBarrier cyclicBarrier, Exchanger<String> exchanger) {
        this.srcAccount = srcAccount;
        this.targetAccount = targetAccount;
        this.cyclicBarrier = cyclicBarrier;
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            srcAccount.transferFunds(targetAccount, 10);
            System.out.print(i+" / ");
            if (i == 60) {
                try {
                    String msg = exchanger.exchange("I have completed the " + i + "th transaction.");
                    System.out.println("Student received msg:"+msg);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        try {
            cyclicBarrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
    }
}
