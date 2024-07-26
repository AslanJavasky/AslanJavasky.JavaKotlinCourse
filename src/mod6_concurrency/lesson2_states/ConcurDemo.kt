package mod6_concurrency.lesson2_states

fun main() {

    //Состояния:NEW, RUNNABLE, BLOCKED, WAITING,TIMED_WAITING,TERMINATED
    val thread1 = PrintThread()
    println("The new Thread is created, its state is ${thread1.state}")
    thread1.start()

    thread1.join()
    println("The thread has complited its work, state=${thread1.state}") //TERMINATED

    synchronized(Any()){
        //some intructions
    }
    PrintThreadKt.staticMethodName()

}

class PrintThreadKt : Thread() {
    override fun run() {
        for (i in 1..33) {
            println("${Thread.currentThread().name} , i=$i")
        }
    }
    companion object{
        @JvmStatic
        @Synchronized
        fun staticMethodName(){
            //some inctructions
        }
    }
}

