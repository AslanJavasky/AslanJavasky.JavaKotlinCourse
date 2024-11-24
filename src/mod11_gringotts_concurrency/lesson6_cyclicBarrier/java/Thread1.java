package mod11_gringotts_concurrency.lesson6_cyclicBarrier.java;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Thread1 extends Thread {

    private final BankAccount srcAccount;
    private final BankAccount targetAccount;
    private final CyclicBarrier cyclicBarrier;

    public Thread1(BankAccount srcAccount, BankAccount targetAccount, CyclicBarrier cyclicBarrier) {
        this.srcAccount = srcAccount;
        this.targetAccount = targetAccount;
        this.cyclicBarrier=cyclicBarrier;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            srcAccount.transferFunds(targetAccount, 10);
        }
        try {
            cyclicBarrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
    }
}
