package cn.itcast.day08.dmeo01.demo01;
/*
定义String getStr()方法
		功能描述：
			获取长度为5的随机字符串
			字符串由随机的4个大写英文字母和1个0-9之间(包含0和9)的整数组成
			英文字母和数字的顺序是随机的

 */
import java.util.Scanner;

public class demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入长字符串：");
        String bigString = sc.next();//
        System.out.println("请输入短字符串：");
        String smallString = sc.next();
        String[] bigArray = bigString.split(smallString);
        System.out.println("短字符串在长字符串出现的次数：");
        System.out.println(bigArray.length-1);
    }
}
