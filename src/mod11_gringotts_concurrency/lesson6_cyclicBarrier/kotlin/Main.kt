package mod11_gringotts_concurrency.lesson6_cyclicBarrier.kotlin

import java.util.concurrent.CountDownLatch
import java.util.concurrent.CyclicBarrier
import kotlin.concurrent.thread

fun main() {

    val hagridAccount = BankAccount("Hadrid's account", 500_000)
    val ollivanderAccount = BankAccount("Ollivander's account", 15_000)
    val cyclicBarrier = CyclicBarrier(2) {
        println(
            "Balances after transfers:" + hagridAccount.accountName + ":" + hagridAccount.balance + ";" +
                    ollivanderAccount.accountName + ":" + ollivanderAccount.balance
        )
    }

    val thread1 = thread {
        repeat(100) {
            hagridAccount.transferFunds(ollivanderAccount, 10)
        }
        cyclicBarrier.await()
    }
    val thread2 = thread {
        repeat(100) {
            hagridAccount.transferFunds(ollivanderAccount, 10)
        }
        cyclicBarrier.await()
    }




}