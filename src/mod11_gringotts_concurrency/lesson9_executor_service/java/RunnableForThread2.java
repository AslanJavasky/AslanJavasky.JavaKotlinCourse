package mod11_gringotts_concurrency.lesson9_executor_service.java;

import java.util.concurrent.Phaser;

public class RunnableForThread2 implements Runnable {

    private final BankAccount srcAccount;
    private final BankAccount targetAccount;

    public RunnableForThread2(
            BankAccount srcAccount, BankAccount targetAccount) {
        this.srcAccount = srcAccount;
        this.targetAccount = targetAccount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            srcAccount.transferFunds(targetAccount, 10);
        }
    }
}