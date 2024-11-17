package mod10_design_pattern.lesson8_bridge.java;

public class DebitAccount extends Account {

    private double balance;

    public DebitAccount(Currency currency) {
        super(currency);
    }

    @Override
    public String getAccountType() {
        return "Debit account with " + currency.getCurrencyName();
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw: " + amount + " " + currency.getCurrencyName());
        } else {
            System.out.println("Not enough funds for withdrawal!");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit: " + amount + " " + currency.getCurrencyName());
    }

    public void displayBalance(){
        System.out.println("Balance: "+ getBalanceConvertedToGalleons(balance)+ " Galleons.");
    }

}
