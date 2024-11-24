package mod11_gringotts_concurrency.lesson7_exchanger.java;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Exchanger;

public class Thread1 extends Thread {

    private final BankAccount srcAccount;
    private final BankAccount targetAccount;
    private final CyclicBarrier cyclicBarrier;
    private final Exchanger<String> exchanger;

    public Thread1(BankAccount srcAccount, BankAccount targetAccount, CyclicBarrier cyclicBarrier, Exchanger<String> exchanger) {
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
                    String msg = exchanger.exchange("Good job! Now you can continue to work without haste.");
                    System.out.println("Hadrid received a msg: " + msg);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
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
