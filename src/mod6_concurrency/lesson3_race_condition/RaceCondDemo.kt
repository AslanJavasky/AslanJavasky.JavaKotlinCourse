package mod6_concurrency.lesson3_race_condition

import kotlin.concurrent.thread

class AslanBankKt {

    var account1 = 100_000
    var account2 = 100_000

    @Synchronized
    fun transferMoney(amount: Int) {
        account1 -= amount
        account2 += amount
    }

    fun printBalance() {
        println("Balance: account1=$account1, account2=$account2")
    }
}

fun main() {
    val ourBank = AslanBankKt()
    val thread1 = thread {
        for (i in 1..1000) {
            ourBank.transferMoney(10)
        }
    }
    val thread2 = thread {
        for (i in 1..1000) {
            ourBank.transferMoney(10)
        }
    }

    thread1.join()
    thread2.join()

    ourBank.printBalance()

}