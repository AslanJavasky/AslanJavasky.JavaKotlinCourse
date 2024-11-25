package mod11_gringotts_concurrency.lesson15_virtual_threads.kotlin


class BankAccount(
    val accountName: String,
    @Volatile
    var balance: Int = 1000

) {

    @Synchronized
    fun transferFunds(targetAccount: BankAccount, amount: Int) {
        if (amount <= this.balance) {
            try {
                Thread.sleep(50)
            } catch (e: InterruptedException) {
                throw RuntimeException(e)
            }
            this.balance -= amount
            targetAccount.balance += amount
            println(
                amount.toString() + " galleons transferred from " + this.accountName + " to " + targetAccount.accountName +
                        "! balance src:" + this.balance + ";balance target:" + targetAccount.balance
            )
        } else {
            System.err.println("Unsufficient funds")
            throw UnsufficientFundsException()
        }
    }
}