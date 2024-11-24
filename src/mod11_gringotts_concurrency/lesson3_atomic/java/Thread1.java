package mod11_gringotts_concurrency.lesson3_atomic.java;

public class Thread1 extends Thread{

    private final BankAccount srcAccount;
    private final BankAccount targetAccount;

    public Thread1(BankAccount srcAccount, BankAccount targetAccount) {
        this.srcAccount = srcAccount;
        this.targetAccount = targetAccount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            srcAccount.transferFunds(targetAccount,10);
        }
    }
}
