package mod11_gringotts_concurrency.lesson8_phaser.java;

import java.util.concurrent.Phaser;

public class Main {
    public static void main(String[] args) {

        BankAccount ollivander = new BankAccount("Ollivander's account", 15_000);
        BankAccount hagrid = new BankAccount("Hadrid's account", 500_000);

        Phaser phaser = new Phaser();

        Thread1 thread1 = new Thread1(hagrid, ollivander, phaser);
        var runnable = new RunnableForThread2(hagrid, ollivander, phaser);
        int ph2 = runnable.registerThreadInPhaser();
        Thread thread2 = new Thread(runnable);
        int ph1 = thread1.registerThreadInPhaser();

        thread1.start();
        thread2.start();

        phaser.awaitAdvance(ph1);//join()
        phaser.awaitAdvance(ph2);//join()

        System.out.println("Balances after transfers:" + hagrid.getAccountName() + ":" + hagrid.getBalance() + ";" +
                ollivander.getAccountName() + ":" + ollivander.getBalance());

    }
}
