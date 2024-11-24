package mod11_gringotts_concurrency.lesson8_phaser.java;

import java.util.concurrent.Phaser;

public class RunnableForThread2 implements Runnable {

    private final BankAccount srcAccount;
    private final BankAccount targetAccount;
    private final Phaser phaser;

    public RunnableForThread2(
            BankAccount srcAccount, BankAccount targetAccount, Phaser phaser) {
        this.srcAccount = srcAccount;
        this.targetAccount = targetAccount;
        this.phaser = phaser;
    }

    public int registerThreadInPhaser() {
        return this.phaser.register();
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            srcAccount.transferFunds(targetAccount, 10);
        }
        phaser.arriveAndAwaitAdvance();
    }
}
