package day07;

public class TestThread {
  static   Object lock = new Object();
    public static void main(String[] args) {
     Thread t2 =   new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 26; i++) {
                    synchronized (lock){

                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.print((char)('A'+i));
                    }
                }

            }
        },"臭逼宝");
         t2.start();
        Thread t1 =   new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 47; i++) {
                    if(i%3==0){
                        synchronized (lock){
                            lock.notify();
                        }
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {

                        }
                    }else{
                        System.out.print(i);
                    }
                }
            }
        },"傻逼宝");
        t1.start();
    }
}
