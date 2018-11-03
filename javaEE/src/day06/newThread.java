package day06;

public class newThread {
    /*
    电影院要卖票，我们模拟电影院的卖票过程。假设要播放的电影是 “葫芦娃大战奥特曼”，
本次电影的座位共100个(本场电影只能卖100张票)。
     */
    static int count = 3;
    static Object lock = new Object();

    public static void main(String[] args) {
        //声明开启三个线程
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

                synchronized (lock) {
                    while (count > 0) {
                        try {
                            System.out.println(Thread.currentThread().getName() + "卖了1一张票，" + "还剩" + (count--) + "张");
                            Thread.sleep(10);
                        } catch (RuntimeException e) {
                            e.printStackTrace();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }, "傻逼宝");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {

                synchronized (lock) {
                    while (count > 0){
                        try {
                            System.out.println(Thread.currentThread().getName() + "卖了一1张票，" + "还剩" + (count--) + "张");
                            Thread.sleep(10);
                        } catch (RuntimeException e) {
                            e.printStackTrace();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }, "臭逼宝");
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {

                synchronized (lock) {
                    while (count > 0) {
                        try {
                            System.out.println(Thread.currentThread().getName() + "卖了一张票，" + "还剩" + (count--) + "张");
                            Thread.sleep(10);
                        } catch (RuntimeException e) {
                            e.printStackTrace();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }, "傻狗宝");
        t1.start();
        t2.start();
        t3.start();
    }
}

