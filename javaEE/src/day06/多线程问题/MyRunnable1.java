package day06.多线程问题;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyRunnable1 implements Runnable {
    int count=12;
    Lock lock = new ReentrantLock();
        @Override
        public void run() {
                   lock.lock();
                   doShell(count);
                   count--;
                   lock.unlock();
        }
        public void doShell(int count){
            if(count>0){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //       int[] box = {10,5,20,50,100,200,500,800,2,80,300,700};
                List<Integer> list = new ArrayList<>(List.of(10,5,20,50,100,200,500,800,2,80,300,700));
                Random ran = new Random();
                int n = ran.nextInt(list.size());
                System.out.println(Thread.currentThread().getName()+"又产生了一个"+list.get(n)+"元大奖!");
                list.remove(list.get(n));
            }

        }
}
