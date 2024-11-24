package mod11_gringotts_concurrency.lesson3_atomic.java;

import java.util.concurrent.atomic.AtomicInteger;

public class BankAccount {
    private String accountName;
    private AtomicInteger balance;

    public BankAccount(String accountName, int initialBalance) {
        this.accountName = accountName;
        this.balance = new AtomicInteger(initialBalance);
    }

    public BankAccount(String accountName) {
        this.accountName = accountName;
        this.balance = new AtomicInteger(1000);
    }

    public String getAccountName() {
        return accountName;
    }

    public int getBalance() {
        return balance.get();
    }

    public void transferFunds(BankAccount targetAccount, int amount) {
        if (amount <= this.balance.get()) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.balance.addAndGet(-amount);
            targetAccount.balance.addAndGet(amount);
            System.out.println(
                    amount + " galleons transferred from " + this.accountName + " to " + targetAccount.accountName +
                            "! balance src:" + this.balance + ";balance target:" + targetAccount.getBalance());

        } else {
            System.err.println("Unsufficient funds");
            throw new UnsufficientFundsException();
        }

    }

}
