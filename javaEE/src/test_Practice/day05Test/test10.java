package test_Practice.day05Test;
/*

 */
public class test10 {
    public static void main(String[] args) {
//创建自定义线程对象
        MyThread mt = new MyThread();
//开启线程
        mt.start();
//在主方法中执行for循环
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.println("主线程打印输出奇数：" + i);
            }
        }

    }
}
