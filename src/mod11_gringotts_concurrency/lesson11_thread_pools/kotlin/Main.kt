package mod11_gringotts_concurrency.lesson11_thread_pools.kotlin

import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

fun main() {

    val hagridAccount = BankAccount("Hadrid's account", 500_000)
    val ollivanderAccount = BankAccount("Ollivander's account", 15_000)
//    val executorService = Executors.newFixedThreadPool(2)
//    val executorService = Executors.newCachedThreadPool()
//    val executorService = Executors.newScheduledThreadPool(2)
//    executorService.schedule({
//        repeat(100) {
//            hagridAccount.transferFunds(ollivanderAccount, 10)
//        }
//    }, 5, TimeUnit.SECONDS)
//    executorService.schedule({
//        repeat(100) {
//            hagridAccount.transferFunds(ollivanderAccount, 10)
//        }
//    },10, TimeUnit.SECONDS)

    val executorService = Executors.newSingleThreadExecutor()

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