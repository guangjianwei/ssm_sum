package day06;

public class Demo03MyRunable {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("ccc----->"+i+Thread.currentThread().getName());
                }
            }
        }).start();
        Runnable runnable = new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("bbb----->"+i+Thread.currentThread().getName());
                }
            }
        };
        Thread t1 = new Thread(runnable,"傻逼宝");
        t1.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("aaa----->"+i+Thread.currentThread().getName());
        }
    }
}
