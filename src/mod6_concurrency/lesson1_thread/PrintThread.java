package mod6_concurrency.lesson1_thread;

public class PrintThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 33; i++) {
            try {
                Thread.sleep(4_000);
                System.out.println(Thread.currentThread().getName()+",i="+ i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
