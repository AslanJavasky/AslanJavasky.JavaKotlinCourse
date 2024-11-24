package mod11_gringotts_concurrency.lesson10_reentrantlock.java;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;


public class BankAccount {
    private final String accountName;
    private int balance;
    private ReentrantLock reentrantLock;
    private Condition conditionEnoughFunds;

    public BankAccount(String accountName) {
        this.balance = 1000;
        this.accountName = accountName;
        reentrantLock = new ReentrantLock();
        conditionEnoughFunds = reentrantLock.newCondition();
    }

    public BankAccount(String accountName, int initialBalance) {
        this(accountName);
        this.balance = initialBalance;
    }


    public String getAccountName() {
        return accountName;
    }

    public int getBalance() {
        return balance;
    }

    public void transferFunds(BankAccount targetAccount, int amount) {
        reentrantLock.lock();
        try {
            while (amount > this.balance) {
                System.err.println("Unsufficient funds");
                conditionEnoughFunds.await();//Ждем пока счёт не пополнится
            }
            Thread.sleep(50);
            this.balance -= amount;
            targetAccount.balance += amount;
            System.out.println(
                    amount + " galleons transferred from " + this.accountName + " to " + targetAccount.accountName +
                            "! balance src:" + this.balance + ";balance target:" + targetAccount.getBalance()
            );
            conditionEnoughFunds.signalAll();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            reentrantLock.unlock();
        }
    }
}
