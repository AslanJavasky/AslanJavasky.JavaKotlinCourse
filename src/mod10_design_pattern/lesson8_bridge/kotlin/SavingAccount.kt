package mod10_design_pattern.lesson8_bridge.kotlin

class SavingAccount(
    private val currency: Currency
):Account(currency) {

    private var balance = 0.0

    override fun getAccountType()="Saving account in ${currency.getCurrencyName()}"

    fun deposit(amount:Double){
        balance += amount
        println("Deposit: $amount ${currency.getCurrencyName()}")
    }

    fun dislayBalance(){
        println("Balance: ${getBalanceConvertedToGalleons(balance)}")
    }

}