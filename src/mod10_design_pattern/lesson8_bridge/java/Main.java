package mod10_design_pattern.lesson8_bridge.java;

//classification:
//1 type: savingAccount, debitAccount
//2 currency: galleon, sickles, knuts

//classes without Bridge: SavingAccountGalleon,SavingAccountSickles,SavingAccountKnuts,
//                DebitAccountGalleon, DebitAccountSickles , DebitAccountKnuts

public class Main {
    public static void main(String[] args) {

        DebitAccount debitAccountInKnuts = new DebitAccount(new Knuts());
        Account debitAccountInSickles = new DebitAccount(new Sickles());

        System.out.println(debitAccountInKnuts.getAccountType());
        System.out.println(debitAccountInSickles.getAccountType());

        SavingAccount savingAccountWithGalleons = new SavingAccount(new Galleon());
        System.out.println(savingAccountWithGalleons.getAccountType());

        savingAccountWithGalleons.deposit(100);
        savingAccountWithGalleons.displayBalance();

        debitAccountInKnuts.deposit(400);
        debitAccountInKnuts.withdraw(50);
        debitAccountInKnuts.displayBalance();
    }
}
