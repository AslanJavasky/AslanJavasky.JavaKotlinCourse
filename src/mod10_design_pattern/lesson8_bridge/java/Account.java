package mod10_design_pattern.lesson8_bridge.java;

//classification:
//1 type: savingAccount, debitAccount
//2 currency: galleon, sickles, knuts

//classes without Bridge: SavingAccountGalleon,SavingAccountSickles,SavingAccountKnuts,
//                DebitAccountGalleon, DebitAccountSickles , DebitAccountKnuts

public abstract class Account {
    protected Currency currency;

    public Account(Currency currency) {
        this.currency = currency;
    }

    public abstract String getAccountType();

    public double getBalanceConvertedToGalleons(double amount) {
        return amount * currency.getExchangeRate();
    }
}

