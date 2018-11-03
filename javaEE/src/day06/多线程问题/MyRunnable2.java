package day06.多线程问题;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyRunnable2 implements Runnable {
    int count=12;
    int count1=0;
    int count2=0;
    Lock lock = new ReentrantLock();
    List<Integer> list = new ArrayList<>(List.of(10,5,20,50,100,200,500,800,2,80,300,700));
    List<Integer> result1= new ArrayList<>();
    List<Integer> result2= new ArrayList<>();
    @Override
    public void run() {
        lock.lock();
        doShell();
        count--;
        print(result1,result2);
        lock.unlock();
    }
    public void doShell(){
        if(Thread.currentThread().getName().equals("抽奖箱1") && result1.size()<6){
            do1(count,list,result1);
        }
        if (Thread.currentThread().getName().equals("抽奖箱2") && result2.size()<6){
            do2(count,list,result2);
        }

    }
    public void do1(int count,List<Integer> list,List<Integer> result){
        if(count>0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Random ran = new Random();
            int n = ran.nextInt(list.size());
            result1.add(list.get(n));
            list.remove(list.get(n));
        }
         count1++;
    }
    public void do2(int count ,List<Integer> list,List<Integer> result){
        if(count>0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Random ran = new Random();
            int n = ran.nextInt(list.size());
            result2.add(list.get(n));
            list.remove(list.get(n));
        }
        count2++;
    }
    public void print(List<Integer> result1,List<Integer> result2){
        if(result1.size()==6&& count1==6){
            System.out.print("在此次抽奖过程中，抽奖箱1总共产生了6个奖项，分别为：");
            for (Integer in1 : result1) {
                System.out.print(in1+",");
            }
            System.out.print("元.");
            count1++;
            System.out.println();
        }
        if(result2.size()==6 && count2==6){
            System.out.print("在此次抽奖过程中，抽奖箱2总共产生了6个奖项，分别为：");
            for (Integer in2 : result2) {
                System.out.print(in2+",");
            }
            System.out.print("元.");
            count2++;
            System.out.println();
        }
    }
}
