package mod11_gringotts_concurrency.lesson8_phaser.kotlin

import java.util.concurrent.CyclicBarrier
import java.util.concurrent.Exchanger
import java.util.concurrent.Phaser
import kotlin.concurrent.thread

fun main() {

    val hagridAccount = BankAccount("Hadrid's account", 500_000)
    val ollivanderAccount = BankAccount("Ollivander's account", 15_000)

    val phaser=Phaser()
    phaser.register()

    val thread1 = thread {
        phaser.register()
        repeat(100) {
            hagridAccount.transferFunds(ollivanderAccount, 10)
        }
        phaser.arriveAndAwaitAdvance()
    }
    val thread2 = thread {
        phaser.register()
        repeat(100) {
            hagridAccount.transferFunds(ollivanderAccount, 10)
        }
        phaser.arriveAndAwaitAdvance()
    }

    phaser.arriveAndAwaitAdvance()

    println(
        "Balances after transfers:" + hagridAccount.accountName + ":" + hagridAccount.balance + ";" +
                ollivanderAccount.accountName + ":" + ollivanderAccount.balance
    )


}