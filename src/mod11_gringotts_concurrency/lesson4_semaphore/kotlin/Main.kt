package mod11_gringotts_concurrency.lesson4_semaphore.kotlin

import kotlin.concurrent.thread

fun main() {

    val hagridAccount = BankAccount("Hadrid's account", 500_000)
    val ollivanderAccount = BankAccount("Ollivander's account", 15_000)


    val thread1 = thread {
        repeat(100) {
            hagridAccount.transferFunds(ollivanderAccount, 10)
        }
    }
    val thread2 = thread {
        repeat(100) {
            hagridAccount.transferFunds(ollivanderAccount, 10)
        }
    }
    thread1.join()
    thread2.join()

    println(
        "Balances after transfers:" + hagridAccount.accountName + ":" + hagridAccount.balance + ";" +
                ollivanderAccount.accountName + ":" + ollivanderAccount.balance
    )


}