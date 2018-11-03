package cn.guangjian.test;
import java.util.*;

public class Test {
    //斗牛牌型输出
    public static void main(String[] args) {
        //定义一个总的牌集合
        StringBuilder sb = new StringBuilder();
        a:
        for (int i = 0; i < 4; i++) {
            if (i == 3) {
                for (int j = 1; j < 11; j++) {
                    if (j == 10) {
                        sb.append(j);
                        break a;
                    }
                    sb.append(j + ",");
                }
            }
            for (int j = 1; j < 11; j++) {
                sb.append(j + ",");
            }
        }
        String s = sb.toString();
        //所有牌数组
        String[] arr = s.split(",");
        //洗牌
        //定义一个手牌五张的数组
        String[] arr1 = new String[5];
        Random ran = new Random();
        for (int i = 0; i < 5; i++) {
            int index = ran.nextInt(40);
            arr1[i] = arr[index];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(getNiu(arr1));
    }

    public static String getNiu(String[] arrs) {
        //设置一个Map集合用来存储所有3+2的可能
        Map<Integer, Integer> map = new HashMap<>();
        //计算牌的总和

        int total = 0;
        for (int i = 0; i < 5; i++) {
            total += Integer.parseInt(arrs[i]);
        }
        List<String> list = new ArrayList<String>();

        //定义任意三张牌的总和
        int threeTotal = 0;
        //定义任意两张牌的总和
        int twoTotal = 0;
        for (int i = 0; i < 5; i++) {
            //出示换list
            Collections.addAll(list, arrs);
            //提取一张牌
            twoTotal = Integer.parseInt(list.get(i));
            //删除这张牌
            list.remove(i);
            //对剩余的牌进行遍历
            for (int j = 0; j < 4; j++) {
                //再提取一张牌
                twoTotal = twoTotal+Integer.parseInt(list.get(j));
                //计算threeTotal
                threeTotal = total - twoTotal;
                //存入map集合中
                map.put(threeTotal, twoTotal);
            }
        }
        if (map.get(10) == null) {
            return "没牛";
        } else {
            return "有牛";


        }
    }
}
