package day07;

import day06.MyRunable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo01ThreadPool {
    public static void main(String[] args) {
        //创建一个线程池对象
        ExecutorService execu = Executors.newFixedThreadPool(2);
        //创建一个任务
        MyRunnable myRunnable = new MyRunnable();
        //把任务提交
        execu.submit(myRunnable);
        execu.submit(myRunnable);
        execu.submit(myRunnable);

    }
}
