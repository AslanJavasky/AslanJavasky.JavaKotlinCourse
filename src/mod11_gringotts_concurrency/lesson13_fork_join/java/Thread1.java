package mod11_gringotts_concurrency.lesson13_fork_join.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Thread1 extends Thread {

    private final BankAccount srcAccount;
    private final BankAccount targetAccount;

    public Thread1(
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
