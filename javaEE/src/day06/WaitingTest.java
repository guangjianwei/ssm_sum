package day06;
//创建两个线程，一个waiting，一个唤醒waiting
public class WaitingTest {
   static Object lock = new Object();
    public static void main(String[] args) {

      Thread t1 =  new Thread(new Runnable() {
          @Override
          public void run() {
              System.out.println("-----1-----");
              synchronized (lock){
                  try {
                      lock.wait();
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              }

          }
      }, "无线等待线程");
        t1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("----2-----");
                System.out.println("唤醒前t1的状态："+t1.getState());
                synchronized (lock){
                    lock.notify();
                }
                System.out.println("唤醒后t1的状态："+t1.getState());

            }
        });
        t2.start();
        System.out.println("唤醒后t1的状态："+t1.getState());
    }
}
