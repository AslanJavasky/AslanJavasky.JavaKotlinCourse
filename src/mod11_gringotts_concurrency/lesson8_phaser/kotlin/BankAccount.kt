package mod11_gringotts_concurrency.lesson8_phaser.kotlin

import java.util.concurrent.Semaphore

class BankAccount(
    val accountName: String,
    var balance: Int = 1000

) {
    val semaphore = Semaphore(1)

    //        @Synchronized
    fun transferFunds(targetAccount: BankAccount, amount: Int) {
        semaphore.acquire()
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
        semaphore.release()
    }
}