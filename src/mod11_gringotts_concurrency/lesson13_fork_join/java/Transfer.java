package mod11_gringotts_concurrency.lesson13_fork_join.java;

public class Transfer {

    private final BankAccount srcAccount;
    private final BankAccount targetAccount;
    private final int amount;

    public Transfer(BankAccount srcAccount, BankAccount targetAccount, int amount) {
        this.srcAccount = srcAccount;
        this.targetAccount = targetAccount;
        this.amount = amount;
    }
    public void execute(){
        srcAccount.transferFunds(targetAccount,amount);
    }
}
