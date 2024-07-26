package mod6_concurrency.lesson1_thread;

public class ConcurrencyDemo {
    public static void main(String[] args) {

        var thread1 = new PrintThread();
        var thread2 = new PrintThread();
//     thread1.run();//синхронно
        thread1.start();//асинхронно(в отдельном потоке)
        thread2.start();

        var thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 33; i++) {
                    try {
                        Thread.sleep(2_000);
                        System.out.println(Thread.currentThread().getName() + ",i=" + i);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
            }
        });

        thread3.start();

    }
}
