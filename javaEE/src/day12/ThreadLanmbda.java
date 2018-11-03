package day12;

public class ThreadLanmbda {
    public static void main(String[] args) {
        startThread(()->{
            System.out.println("开启一个线程。");
        });
    }
//Runnable函数式接口作为参数来开启一个线程，语义更加简介，减少了.class的创建
    private static void startThread(Runnable runnable) {
        new Thread(runnable).start();
    }
}
