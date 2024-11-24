package mod11_gringotts_concurrency.lesson1_transferfunds_fun.java;

public class Main {
    public static void main(String[] args) {

//        System.out.println(
//                Thread.currentThread().getName()
//        );

//        BankAccount harry = new BankAccount("HarryPotter's account", 3_000);
        BankAccount ollivander = new BankAccount("Ollivander's account", 15_000);
        BankAccount hagrid = new BankAccount("Hadrid's account", 500_000);

        Thread thread1 = new Thread1(hagrid, ollivander);
        Thread thread2 = new Thread(new RunnableForThread2(hagrid,ollivander));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Balances after transfers:" + hagrid.getAccountName() + ":" + hagrid.getBalance() + ";" +
                ollivander.getAccountName() + ":" + ollivander.getBalance());
    }
}
