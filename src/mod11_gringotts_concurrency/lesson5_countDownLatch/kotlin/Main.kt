package mod11_gringotts_concurrency.lesson5_countDownLatch.kotlin

import java.util.concurrent.CountDownLatch
import kotlin.concurrent.thread

fun main() {

    val hagridAccount = BankAccount("Hadrid's account", 500_000)
    val ollivanderAccount = BankAccount("Ollivander's account", 15_000)
    val countDownLatch=CountDownLatch(2)

    val thread1 = thread {
        repeat(100) {
            hagridAccount.transferFunds(ollivanderAccount, 10)
        }
        countDownLatch.countDown()
    }
    val thread2 = thread {
        repeat(100) {
            hagridAccount.transferFunds(ollivanderAccount, 10)
        }
        countDownLatch.countDown()
    }
//    thread1.join()
//    thread2.join()

    countDownLatch.await()

    println(
        "Balances after transfers:" + hagridAccount.accountName + ":" + hagridAccount.balance + ";" +
                ollivanderAccount.accountName + ":" + ollivanderAccount.balance
    )


}