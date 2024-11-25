package mod11_gringotts_concurrency.lesson14_completable_future.kotlin

import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executors
import java.util.concurrent.ForkJoinPool
import java.util.concurrent.Future
import java.util.concurrent.TimeUnit

const val CNT_TRANSFERS = 200

fun main() {


    val hagridAccount = BankAccount("Hadrid's account", 500_000)
    val ollivanderAccount = BankAccount("Ollivander's account", 15_000)

    val executor=Executors.newVirtualThreadPerTaskExecutor()

    executor.submit {
        doTransactions(hagridAccount, ollivanderAccount)
    }

    executor.submit {
        doTransactions(hagridAccount, ollivanderAccount)
    }

    executor.shutdown()

    executor.awaitTermination(60, TimeUnit.SECONDS)
    
    println(
        "Balances after transfers:" + hagridAccount.accountName + ":" + hagridAccount.balance + ";" +
                ollivanderAccount.accountName + ":" + ollivanderAccount.balance
    )






}

private fun doTransactions(
    hagridAccount: BankAccount,
    ollivanderAccount: BankAccount
) {
    repeat(100) {
        hagridAccount.transferFunds(ollivanderAccount, 10)
    }
}