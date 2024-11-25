package mod11_gringotts_concurrency.lesson15_virtual_threads.kotlin

import java.util.concurrent.RecursiveAction

class RecursiveActionForTransfer(
    private val transfers: Array<Transfer>,
    private val start: Int,
    private val end: Int
) : RecursiveAction() {

    override fun compute() {
        if (end - start <= THRESHOLD) {
            for (i in start until end) {
                transfers[i].execute()
            }
        } else {
            val mid = (start + end) / 2
//            invokeAll(
//                RecursiveActionForTransfer(transfers, start, mid),
//                RecursiveActionForTransfer(transfers, mid, end)
//            )
            val action1=RecursiveActionForTransfer(transfers, start, mid)
            val action2=RecursiveActionForTransfer(transfers, mid, end)

            action1.fork()
            action2.fork()

            action1.join()
            action2.join()
        }
    }

    companion object {
        const val THRESHOLD = 100
    }
}