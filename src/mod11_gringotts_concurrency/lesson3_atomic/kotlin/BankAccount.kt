package mod11_gringotts_concurrency.lesson3_atomic.kotlin;

import java.util.concurrent.atomic.AtomicInteger

class BankAccount(
    val accountName: String,
    var balance: AtomicInteger = AtomicInteger(1000)

) {
    @Synchronized
    fun transferFunds(targetAccount: BankAccount, amount: Int) {
        if (amount <= this.balance.get()) {
            try {
                Thread.sleep(50)
            } catch (e: InterruptedException) {
                throw RuntimeException(e)
            }
            this.balance.addAndGet(-amount)
            targetAccount.balance.addAndGet(amount)
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