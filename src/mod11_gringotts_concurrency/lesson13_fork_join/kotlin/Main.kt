package mod11_gringotts_concurrency.lesson13_fork_join.kotlin

import java.util.concurrent.ForkJoinPool

const val CNT_TRANSFERS = 200

fun main() {


    val hagridAccount = BankAccount("Hadrid's account", 500_000)
    val ollivanderAccount = BankAccount("Ollivander's account", 15_000)

    val forkJoinPool = ForkJoinPool()
    val transfers = Array(CNT_TRANSFERS) { Transfer(hagridAccount, ollivanderAccount, 10) }
    val recursiveAction = RecursiveActionForTransfer(transfers, 0, CNT_TRANSFERS)
    forkJoinPool.invoke(recursiveAction)

    println(
        "Balances after transfers:" + hagridAccount.accountName + ":" + hagridAccount.balance + ";" +
                ollivanderAccount.accountName + ":" + ollivanderAccount.balance
    )


}