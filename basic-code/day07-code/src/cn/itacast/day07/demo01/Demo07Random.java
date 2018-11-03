package cn.itacast.day07.demo01;

import java.util.Random;

//随机生成10个数，打印
public class Demo07Random {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Random ran = new Random();
            int num = ran.nextInt(10);
            System.out.println(num);
        }

    }
}
