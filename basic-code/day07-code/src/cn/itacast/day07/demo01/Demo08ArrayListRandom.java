package cn.itacast.day07.demo01;

import java.util.ArrayList;
import java.util.Random;

/*
随机存储1-33之间的6和整数然后进行遍历
 */
public class Demo08ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> randomArray = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
//            System.out.println(random.nextInt(33));
            randomArray.add(random.nextInt(33));

        }
        //遍历数组
        for (int i = 0; i < randomArray.size(); i++) {
            System.out.print(randomArray.get(i)+",");
        }

    }
}
