package mod6_concurrency.lesson2_states;

public class PrintThread extends Thread {

    @Override
    public synchronized void run() {

        System.out.println("The " + Thread.currentThread().getName() + " starts its work, state=" + Thread.currentThread().getState());

//        synchronized (this){
            for (int i = 1; i <= 4; i++) {
                try {
                    Thread.sleep(2_000);
                    System.out.println(Thread.currentThread().getName() + ",i=" + i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
//        }


        System.out.println("The " + Thread.currentThread().getName() + " has exit from \"for\" cycle, state=" + Thread.currentThread().getState());
    }

    public static synchronized void staticMethodName(){
        //some inctructions
    }

}
