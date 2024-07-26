package mod6_concurrency.lesson3_race_condition;

public class RaceConditionDemo {
    public static void main(String[] args) {

        var outBank=new AslanBank();
        outBank.printBalance();

        Thread thread1=new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                outBank.transferMoney(10);
            }
        });

        Thread thread2=new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                outBank.transferMoney(10);
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //было account1=100_000; account2=100_000
        //стало account1=80_000; account2=120_000
        outBank.printBalance();







    }
}
