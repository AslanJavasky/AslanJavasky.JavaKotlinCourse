package mod10_design_pattern.lesson8_bridge.kotlin

//classification:
//1 type: savingAccount, debitAccount
//2 currency: galleon, sickles, knuts

//classes without Bridge: SavingAccountGalleon,SavingAccountSickles,SavingAccountKnuts,
//                DebitAccountGalleon, DebitAccountSickles , DebitAccountKnuts

abstract class Account(
    private val currency: Currency
) {
    abstract fun getAccountType():String

    fun getBalanceConvertedToGalleons(amount: Double) = amount * currency.getExchangeRate()


}