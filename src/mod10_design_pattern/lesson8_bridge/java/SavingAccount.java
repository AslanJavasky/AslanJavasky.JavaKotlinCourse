package mod10_design_pattern.lesson8_bridge.java;

public class SavingAccount extends Account {

    private double balance;

    public SavingAccount(Currency currency) {
        super(currency);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String getAccountType() {
        return "Saving account with " + currency.getCurrencyName();
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit: " + amount + " " + currency.getCurrencyName());
    }

    public void displayBalance(){
        System.out.println("Balance: "+ getBalanceConvertedToGalleons(balance)+ " Galleons.");
    }

}
