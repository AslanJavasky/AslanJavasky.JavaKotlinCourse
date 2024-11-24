package mod11_gringotts_concurrency.lesson10_reentrantlock.kotlin

import java.util.concurrent.locks.Condition
import java.util.concurrent.locks.ReentrantLock

class BankAccount(
    val accountName: String,
    var balance: Int = 1000

) {

    val reentrantLock = ReentrantLock()
    val conditionEnoughFunds = reentrantLock.newCondition()

    fun transferFunds(targetAccount: BankAccount, amount: Int) {
        reentrantLock.lock()
        try {
            while (amount > this.balance) {
                System.err.println("Unsufficient funds")
                conditionEnoughFunds.await()
            }
            Thread.sleep(50)
            this.balance -= amount
            targetAccount.balance += amount
            println(
                amount.toString() + " galleons transferred from " + this.accountName + " to " + targetAccount.accountName +
                        "! balance src:" + this.balance + ";balance target:" + targetAccount.balance
            )
            conditionEnoughFunds.signalAll()

        } catch (e: InterruptedException) {
            Thread.currentThread().interrupt()
        }finally {
            reentrantLock.unlock()
        }


    }

}