package cn.itcast.day08.dmeo01;
import java.util.ArrayList;
import java.util.Arrays;
public class SortArray {
    public static void main(String[] args) {
        String str = "234ewrwrwd325rtru68";//生成一个字符串
        char[] charArray = str.toCharArray();//转换成char数组
        Arrays.sort(charArray);           //对数组进行升序
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i] + ",");
        }
        System.out.println();
        System.out.println(Arrays.toString(charArray));
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(1);
        arr1.add(3);
        arr1.add(6);
        arr1.add(7);
        arr1.add(2);
        System.out.println(arr1);

    }
}
