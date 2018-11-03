package cn.itcast.day08.dmeo01.demo02;


import java.util.Arrays;
import java.util.Random;

/*
定义String getStr()方法
		功能描述：
			获取长度为5的随机字符串
			字符串由随机的4个大写英文字母和1个0-9之间(包含0和9)的整数组成
			英文字母和数字的顺序是随机的

 */
public class getString {
    public static void main(String[] args) {
        int[] arr= new int[26];
        char[] charNew = new char[5];
        for(int i = 0; i < arr.length; i++){
            arr[i]=i+65;
    }
        Random ran = new Random();
        for (int i = 0; i < 5; i++) {
            charNew[i]=(char)(arr[ran.nextInt(27)]);
        }
        for (int i = 0; i < charNew.length; i++) {
            System.out.println(charNew[i]);
        }
        charNew[ran.nextInt(5)]=(char)(ran.nextInt(10)+48);
        String str1 = new String(charNew);
        System.out.println(str1);

    }
    public static void getStr(){
        Random ran =new Random();
    }
}
