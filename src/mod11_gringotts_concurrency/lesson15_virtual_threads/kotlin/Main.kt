package mod11_gringotts_concurrency.lesson15_virtual_threads.kotlin

import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executors
import java.util.concurrent.ForkJoinPool
import java.util.concurrent.Future

const val CNT_TRANSFERS = 200

fun main() {


    val hagridAccount = BankAccount("Hadrid's account", 500_000)
    val ollivanderAccount = BankAccount("Ollivander's account", 15_000)

    //Future
//    val executor = Executors.newFixedThreadPool(2)
//    val future1= executor.submit {
//        repeat(100) {
//            hagridAccount.transferFunds(ollivanderAccount, 10)
////            Transfer(hagridAccount,ollivanderAccount,10).execute()
//        }
//    }
//    val future2= executor.submit {
//        repeat(100) {
//            Transfer(hagridAccount,ollivanderAccount,10).execute()
//        }
//    }
//    future1.get()
//    future2.get()
//
//    executor.shutdown()
//
//    println(
//        "Balances after transfers:" + hagridAccount.accountName + ":" + hagridAccount.balance + ";" +
//                ollivanderAccount.accountName + ":" + ollivanderAccount.balance
//    )

    //CompletableFuture
    val executor = Executors.newFixedThreadPool(2)
    val future1= CompletableFuture.runAsync {
        repeat(100) {
            hagridAccount.transferFunds(ollivanderAccount, 10)
//            Transfer(hagridAccount,ollivanderAccount,10).execute()
        }
    }
    val future2= CompletableFuture.runAsync {
        repeat(100) {
            Transfer(hagridAccount,ollivanderAccount,10).execute()
        }
    }

    val allOf=CompletableFuture.allOf(future1,future2)

    val totalFuture=allOf.thenRunAsync {
        println(
            "Balances after transfers:" + hagridAccount.accountName + ":" + hagridAccount.balance + ";" +
                    ollivanderAccount.accountName + ":" + ollivanderAccount.balance
        )
    }.join()

    executor.shutdown()



}