package mod6_concurrency.lesson3_race_condition;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AslanBank {

    private int account1 = 100_000;
    private int account2 = 100_000;


    //old
//    Lock lock = new ReentrantLock();
//    public void transferMoney(int amount) {
//        lock.lock();
//        try {
//            if (amount <= account1) {
//                account1 -= amount;
//                account2 += amount;
//            }
//        }finally {
//            lock.unlock();
//        }
//    }

    public synchronized void transferMoney(int amount) {
        if (amount <= account1) {
            account1 -= amount;
            account2 += amount;
        }

    }

    public void printBalance() {
        System.out.println("Balance: account1=" + account1 + ", account2=" + account2);
    }
}
