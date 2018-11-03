package cn.itacast.day07.demo01;

import java.util.Random;
import java.util.Scanner;

public class Demo07RandomGame {
    public static void main(String[] args) {
        System.out.println("游戏开始（请猜100以内的随机数，您有10次机会）：");
        System.out.println("请输入您猜想的数字：");
        Random random = new Random();
        int b = random.nextInt(100);
        System.out.println(b);
        for (int i = 0; i < 10; i++) {
            int a = new Scanner(System.in).nextInt();
            if (a > b) {
                System.out.println("对不起，您猜大了！");
                if (i == 9) {
                    System.out.println("对不起，您已经失去了所有机会！");
                    break;
                }
            } else if (a < b) {
                System.out.println("对不起，您猜小了！");
                if (i == 9) {
                    System.out.println("对不起，您已经失去了所有机会！");
                    break;
                }
            } else if (a == b) {
                System.out.println("恭喜您，答对了！");
                break;
            }
        }

    }
}
