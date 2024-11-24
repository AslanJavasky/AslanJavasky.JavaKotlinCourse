package mod11_gringotts_concurrency.lesson7_exchanger.java;


import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Exchanger;

public class Main {
    public static void main(String[] args) {

        BankAccount ollivander = new BankAccount("Ollivander's account", 15_000);
        BankAccount hagrid = new BankAccount("Hadrid's account", 500_000);

        Exchanger<String> exchanger=new Exchanger<>();


        CyclicBarrier cyclicBarrier =
                new CyclicBarrier(2, () ->
                        System.out.println("Balances after transfers:" + hagrid.getAccountName() + ":" + hagrid.getBalance() + ";" +
                        ollivander.getAccountName() + ":" + ollivander.getBalance()));

        Thread thread1 = new Thread1(hagrid, ollivander,cyclicBarrier,exchanger);
        Thread thread2 = new Thread(new RunnableForThread2(hagrid, ollivander,cyclicBarrier,exchanger));

        thread1.start();
        thread2.start();

    }
}
