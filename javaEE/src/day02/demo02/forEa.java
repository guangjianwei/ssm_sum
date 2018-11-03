package day02.demo02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class forEa {
    //遍历数组的两种方法
    //1.直接用for进行遍历
    //2.利用增强for进行遍历
    public static void main(String[] args) {
        System.out.println("==========数组的两种遍历============");
        int[] arr = {1, 3, 4, 5, 6, 7};
        //第一种方法
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //第二种方法
        System.out.println();
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("==========Collection的两种遍历============");
        Collection<String> cool = new ArrayList<>();
        cool.add("风清扬");
        cool.add("傻逼宝");
        cool.add("帅见见");
        System.out.println("迭代器方法：");
        Iterator<String> it = cool.iterator();//这里的Iterator一定不能忘记<String>
        while (it.hasNext()) {
            System.out.print(it.next() + " "); //这里遍历一定不要忘接了it.next()
        }
        System.out.println();
        System.out.println("增强for的方法：");
        for (String is : cool) {
            System.out.print(is + " ");
        }
    }
}

