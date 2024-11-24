package mod11_gringotts_concurrency.lesson12_concurrent_collections.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Thread1 extends Thread {

    private final BankAccount srcAccount;
    private final BankAccount targetAccount;
    List<String> historyList = new ArrayList<>();
    Map<String,String> transactionStates=new HashMap();

    public Thread1(
            BankAccount srcAccount, BankAccount targetAccount,
            List<String> historyList, Map<String, String> transactionStates) {
        this.srcAccount = srcAccount;
        this.targetAccount = targetAccount;
        this.historyList = historyList;
        this.transactionStates=transactionStates;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            String transactionId = "Transaction by Hadrid: " + i;
            transactionStates.put(transactionId,"state: in pocessing...");
            historyList.add(transactionId);
            srcAccount.transferFunds(targetAccount, 10);
            transactionStates.put(transactionId,"state: done");
        }
    }
}
