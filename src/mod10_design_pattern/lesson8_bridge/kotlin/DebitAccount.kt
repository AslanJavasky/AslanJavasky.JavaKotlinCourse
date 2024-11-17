package mod10_design_pattern.lesson8_bridge.kotlin

class DebitAccount(
    private val currency: Currency
) : Account(currency) {

    private var balance = 0.0

    override fun getAccountType() = "Debit account in ${currency.getCurrencyName()}"

    fun deposit(amount: Double) {
        balance += amount
        println("Deposit: $amount ${currency.getCurrencyName()}")
    }

    fun withdraw(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Withdraw: $amount ${currency.getCurrencyName()}")
        } else {
            println("Not enough fund for withdraw!")
        }
    }

    fun dislayBalance(){
        println("Balance: ${getBalanceConvertedToGalleons(balance)} Galleons.")
    }
}