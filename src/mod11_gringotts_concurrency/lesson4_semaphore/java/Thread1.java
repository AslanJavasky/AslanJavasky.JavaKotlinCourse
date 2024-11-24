package mod11_gringotts_concurrency.lesson4_semaphore.java;

public class Thread1 extends Thread{

    private final BankAccount srcAccount;
    private final BankAccount targetAccount;

    public Thread1(BankAccount srcAccount, BankAccount targetAccount) {
        this.srcAccount = srcAccount;
        this.targetAccount = targetAccount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            srcAccount.transferFunds(targetAccount,10);
        }
    }
}
