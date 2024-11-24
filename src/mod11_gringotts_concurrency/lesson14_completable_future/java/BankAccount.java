package mod11_gringotts_concurrency.lesson14_completable_future.java;

import mod11_gringotts_concurrency.lesson4_semaphore.java.UnsufficientFundsException;

public class BankAccount {
    private final String accountName;
    private int balance;

    public BankAccount(String accountName, int initialBalance) {
        this.accountName = accountName;
        this.balance = initialBalance;
    }

    public BankAccount(String accountName) {
        this.accountName = accountName;
        this.balance = 1000;
    }

    public String getAccountName() {
        return accountName;
    }

    public int getBalance() {
        return balance;
    }

    public synchronized void transferFunds(BankAccount targetAccount, int amount) {

        if (amount <= this.balance) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.balance -= amount;
            targetAccount.balance += amount;
            System.out.println(
                    amount + " galleons transferred from " + this.accountName + " to " + targetAccount.accountName +
                            "! balance src:" + this.balance + ";balance target:" + targetAccount.getBalance()
            );

        } else {
            System.err.println("Unsufficient funds");
            throw new UnsufficientFundsException();
        }
    }
}

