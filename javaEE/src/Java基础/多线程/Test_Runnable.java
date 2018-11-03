package Java基础.多线程;

import javax.swing.plaf.multi.MultiMenuItemUI;

/*
*
* run() 和 start() 的区别:
* 线程对象调用run（）方法不开启线程，仅是对象调用方法。
* 线程对象调用start（）方法开启线程，并让jvm调用run（）方法在开启的线程中执行
*
* 多线程的生命周期
* 1.NEW(新建)
*       线程刚被创建，但是并未启动。还没调用start方法.
* 2.Runnable(可运行)
*       线程可以在java虚拟机中运行的状态，可能正在执行run方法中的方法,也可能在等待执行代码.根据代码决定.
* 3.Blocked(锁阻塞)
*       在多线程同步时出现,如过两条线程争抢一个锁对象,一条线程拿到所对象执行,另一条线程则处于锁阻塞的状态下.
* 4.Waiting(无线等等)
*       多线程同步的情况下,一条线程调用wait()方法,进入无限等待的状态,需要等待其他同步线程调用notify()或notifyAll()方法唤醒.
* 5.Time Waiting(计时等待)
*       多线程同步的情况下,一条线程调用wait(1000)方法,进入计时等待的状态,如果没有其他同步线程唤醒它,则在计时结束后自动结束等待状态.
* 6.Teminated(被终止)
*       run()方法执行结束而正常销毁,或者在运行的状态下出现异常,虚拟机异常终止.
*
*
* 同步:synchronized
* 同步代码块: 锁对象为任意对象,只要是同一个对象即可
*       注意: 匿名对象是无法作为锁对象的,因为匿名对象无法再次调用,所以无法再次找到它,把它当成锁.
*
*
* 同步方法:分为静态方法和非静态方法;
*
*       而所有的静态同步方法用的也是同一把锁——类对象本身(因为此时还没有实例化对象,所以无法用实例对象)
*
*       所有的非静态同步方法用的都是同一把锁——实例对象本身
*
*       所以两把锁并不是同一把锁,所以两个方法之间不存在多线程同步关系.
* */
public class Test_Runnable {
    public static void main(String[] args) {
//                * 1.NEW(新建)
//                *       线程刚被创建，但是并未启动。还没调用start方法.
//                * 2.Runnable(可运行)
//                *       线程可以在java虚拟机中运行的状态，可能正在执行run方法中的方法,也可能在等待执行代码.根据代码决定.
//                * 3.Blocked(锁阻塞)
//                *       在多线程同步时出现,如过两条线程争抢一个锁对象,一条线程拿到所对象执行,另一条线程则处于锁阻塞的状态下.
//                * 4.Waiting(无线等等)
//                *       多线程同步的情况下,一条线程调用wait()方法,进入无限等待的状态,需要等待其他同步线程调用notify()或notifyAll()方法唤醒.
//                * 5.Time Waiting(计时等待)
//                *       多线程同步的情况下,一条线程调用wait(1000)方法,进入计时等待的状态,如果没有其他同步线程唤醒它,则在计时结束后自动结束等待状态.
//                * 6.Teminated(被终止)
//                *       run()方法执行结束而正常销毁,或者在运行的状态下出现异常,虚拟机异常终止.

        multiThread multiThread = new multiThread();
        //有没有启动线程?
        multiThread.run();


        multiThread.start();                        //线程一

        new Thread(multiThread).start();            //线程二

    }

    static class multiThread extends Thread{

        @Override
        public void run() {
            //线程一   线程二(multiThread.class)
            synchronized (multiThread.class){
//                new Object().wait();

//                new Object().wait(1000);
                System.out.println();
                System.out.println("Thread.name : " + Thread.currentThread().getName());
                System.out.println("run() : " +  345678);
                System.out.println();
            }
        }

        @Override
        public synchronized void start() {
            super.start();
            System.out.println("start() : " + 123456);
        }
    }
}
