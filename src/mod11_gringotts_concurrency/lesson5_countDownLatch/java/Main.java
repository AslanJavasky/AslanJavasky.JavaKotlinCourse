package mod11_gringotts_concurrency.lesson5_countDownLatch.java;


import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) {

        BankAccount ollivander = new BankAccount("Ollivander's account", 15_000);
        BankAccount hagrid = new BankAccount("Hadrid's account", 500_000);

        CountDownLatch latch=new CountDownLatch(200);

        Thread thread1 = new Thread1(hagrid, ollivander,latch);
        Thread thread2 = new Thread(new RunnableForThread2(hagrid,ollivander,latch));

        thread1.start();
        thread2.start();

//        try {
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }


        try {
            latch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Balances after transfers:" + hagrid.getAccountName() + ":" + hagrid.getBalance() + ";" +
                ollivander.getAccountName() + ":" + ollivander.getBalance());
    }
}
