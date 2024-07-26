package mod6_concurrency.lesson5_ThreadPoolExecutor

import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

fun main() {

    val executor: ExecutorService = Executors.newFixedThreadPool(5)

    executor.submit { println("Task 1 executing....") }

    executor.submit { println("Task 2 executing....") }

    executor.shutdown()
}