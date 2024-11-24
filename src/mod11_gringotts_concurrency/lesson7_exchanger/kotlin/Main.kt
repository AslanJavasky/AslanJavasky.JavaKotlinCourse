package mod11_gringotts_concurrency.lesson7_exchanger.kotlin

import java.util.concurrent.CyclicBarrier
import java.util.concurrent.Exchanger
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

    val exchanger = Exchanger<String>()
    val thread1 = thread {
        for (i in 0 until 100) {
            hagridAccount.transferFunds(ollivanderAccount, 10)
            if (i == 60) {
                val response = exchanger.exchange("Good job! Now you can continue to work without haste.");
                println("Hadrid received a msg: $response")
            }
        }
        cyclicBarrier.await()
    }
    val thread2 = thread {
        for (i in 0 until 100) {
            hagridAccount.transferFunds(ollivanderAccount, 10)
            if (i == 60) {
                val response = exchanger.exchange("I have completed the ${i}th transaction.")
                println("Student received msg:$response")
            }
        }
        cyclicBarrier.await()
    }


}