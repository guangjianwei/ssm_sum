package day06;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable {
    int count = 100;//这是一共的票数
    Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true) {
            lock.lock();
//            if (count > 0) {
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName()
//                        + "卖了一张票,还剩 " + count-- + " 张");
//            }
            sell(count);
            count--;
            lock.unlock();
        }
        }

public static  void sell(int count) {
            if (count > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()
                        + "卖了一张票,还剩 " + (count-1) + " 张");
            }

    }
}
