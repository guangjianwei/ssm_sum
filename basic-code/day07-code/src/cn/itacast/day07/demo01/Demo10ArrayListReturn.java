package cn.itacast.day07.demo01;

import java.util.ArrayList;
//大集合中筛选小集合然后进行返回
public class Demo10ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> Arraylist = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Arraylist.add(i + 1);
        }
        System.out.println("原数组：");
        System.out.println(Arraylist);
        ArrayList<Integer> smallArraylist =getSmallArray(Arraylist);
        System.out.println("small数组：");
        System.out.println(smallArraylist);

    }
//筛选的函数
    public static ArrayList<Integer> getSmallArray(ArrayList<Integer> Arraylist) {
        ArrayList<Integer> smalllist = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            if (Arraylist.get(i) % 2 == 0) {
                smalllist.add(Arraylist.get(i));
            }
        }
        return smalllist;
    }
}
