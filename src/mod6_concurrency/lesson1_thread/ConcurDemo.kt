package mod6_concurrency.lesson1_thread

import kotlin.concurrent.thread

fun main() {

    val thread1 = PrintThreadKt()
    val thread2 = PrintThreadKt()

    thread1.start()
    thread2.start()

    thread {
        for (i in 1..33) {
            println("${Thread.currentThread().name} , i=$i")
        }
    }


}


class PrintThreadKt : Thread() {
    override fun run() {
        for (i in 1..33) {
            println("${Thread.currentThread().name} , i=$i")
        }
    }

}