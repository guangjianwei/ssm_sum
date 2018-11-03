package cn.itcast.test;

import cn.itcast.mode.NoSingleMode;
import cn.itcast.mode.SingletonMode1;
import cn.itcast.mode.SingletonMode2;
import cn.itcast.mode.SingletonMode3;

public class TestSingleton {

    public static void main(String[] args) {
//        noSingletonMode();
//        testSingletonMethod1();
//        testSingletonMethod2();
//        mutilTestSingletonMethod1();
//        mutilTestSingletonMethod2();
        mutilTestSingletonMethod3();
    }


    /**
     * 懒汉式多线程下存在问题
     */
    public static void mutilTestSingletonMethod1() {
        for (int i = 0; i < 50; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    SingletonMode1 instance = SingletonMode1.getInstance();
                    System.out.println("懒汉式 : " + instance.toString());
                }
            }).start();
        }
    }


    /**
     * 饿汉式多线程下存在问题
     */
    public static void mutilTestSingletonMethod2() {
        for (int i = 0; i < 50; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    SingletonMode2 instance = SingletonMode2.getInstance();
                    System.out.println("饿汉式 : " + instance.toString());
                }
            }).start();
        }
    }

    /**
     * 双重加锁解决多线程下存在问题
     */
    public static void mutilTestSingletonMethod3() {
        for (int i = 0; i < 50; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    SingletonMode3 instance = SingletonMode3.getInstance();
                    System.out.println("双重加锁 : " + instance.toString());
                }
            }).start();
        }
    }

    /**
     * 懒汉式测试
     */
    public static void testSingletonMethod1() {
        for (int i = 0; i < 100; i++) {
            SingletonMode1 instance = SingletonMode1.getInstance();
            System.out.println("懒汉式 : " + instance.toString());
        }
    }

    /**
     * 饿汉式测试
     */
    public static void testSingletonMethod2() {
        for (int i = 0; i < 100; i++) {
            SingletonMode2 instance = SingletonMode2.getInstance();
            System.out.println("饿汉式 : " + instance.toString());
        }
    }

    /**
     * 不使用单例
     */
    public static void noSingletonMode() {
        for (int i = 0; i < 100; i++) {
            NoSingleMode noSingleMode = new NoSingleMode();
            System.out.println("不使用单例 : " + noSingleMode.toString());
        }

    }
}
