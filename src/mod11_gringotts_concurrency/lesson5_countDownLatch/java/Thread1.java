package mod11_gringotts_concurrency.lesson5_countDownLatch.java;

import java.util.concurrent.CountDownLatch;

public class Thread1 extends Thread {

    private final BankAccount srcAccount;
    private final BankAccount targetAccount;
    private final CountDownLatch latch;


    public Thread1(BankAccount srcAccount, BankAccount targetAccount, CountDownLatch latch) {
        this.srcAccount = srcAccount;
        this.targetAccount = targetAccount;
        this.latch = latch;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            srcAccount.transferFunds(targetAccount, 10);
            latch.countDown();
        }

    }
}
