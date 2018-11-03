package test_Practice.day07Test;
//请在指定位置插入代码实现打印输出1-99。
public class test6 {
        public int start = 1;
        public int end = 99;
        public static void main (String[] args) {
            new test6().method();
        }
        public void method() {
//请在此处插入代码，实现功能
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 1; i < 100; i++) {
                        System.out.print(i+" ");
                    }
                }
            });
            t.start();
        }

}
