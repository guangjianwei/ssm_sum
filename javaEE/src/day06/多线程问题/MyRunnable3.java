package day06.多线程问题;

import java.util.Random;

public class MyRunnable3 implements Runnable {
        @Override
        public void run() {
            int[] box = {10,5,20,50,100,200,500,800,2,80,300,700};
            Random ran = new Random();
            int n = ran.nextInt(box.length);
            System.out.println(Thread.currentThread().getName()+"又产生了一个"+box[n]+"大奖!");
        }
}
