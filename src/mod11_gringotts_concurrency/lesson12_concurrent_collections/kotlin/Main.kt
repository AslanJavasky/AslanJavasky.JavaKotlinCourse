package mod11_gringotts_concurrency.lesson12_concurrent_collections.kotlin

import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

fun main() {

    val hagridAccount = BankAccount("Hadrid's account", 500_000)
    val ollivanderAccount = BankAccount("Ollivander's account", 15_000)
    val executorService = Executors.newFixedThreadPool(2)
    executorService.submit {
        repeat(100) {
            hagridAccount.transferFunds(ollivanderAccount, 10)
        }
    }
    executorService.submit {
        repeat(100) {
            hagridAccount.transferFunds(ollivanderAccount, 10)
        }
    }

    executorService.shutdown()
    executorService.awaitTermination(1, TimeUnit.MINUTES)

    println(
        "Balances after transfers:" + hagridAccount.accountName + ":" + hagridAccount.balance + ";" +
                ollivanderAccount.accountName + ":" + ollivanderAccount.balance
    )


}