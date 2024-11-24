package mod11_gringotts_concurrency.lesson2_interrupt.java;

import mod11_gringotts_concurrency.lesson2_interrupt.java.BankAccount;

public class RunnableForThread2 implements Runnable {

    private final BankAccount srcAccount;
    private final BankAccount targetAccount;

    public RunnableForThread2(BankAccount srcAccount, BankAccount targetAccount) {
        this.srcAccount = srcAccount;
        this.targetAccount = targetAccount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i==80) {
                System.out.println(Thread.currentThread().getName() +"is interrupted? "+ Thread.currentThread().isInterrupted());
                Thread.currentThread().interrupt();
                System.out.println(Thread.currentThread().getName() +"is interrupted? "+ Thread.currentThread().isInterrupted());
            }
            srcAccount.transferFunds(targetAccount,10);
            System.out.println("State of "+Thread.currentThread().getName()+": "+Thread.currentThread().getState());
        }

    }
}
