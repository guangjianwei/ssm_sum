package demo01;

import java.util.Random;
import java.util.Scanner;

/*
1.键盘录入一个长度大于10的字符串
2.定义方法String getStr(String str),方法内实现,
(1)从字符串中随机获取5次字符,
(2)将获取的字符中的大写字符转换成小写字符,
(3)将转换后的字符组合成新的字符串,并将该字符串返回
3.main方法中进行测试

 */
public class num2 {
    public static void main(String[] args) {
        System.out.println("请输入长度大于10的字符串");
        Scanner sc = new Scanner(System.in);
        String str2=sc.next();
        while(str2.length()<=10){
            System.out.println("对不起，长度不够，请重新输入！");
            str2=sc.next();
        }
        String newResult = getStr(str2);
        System.out.println(newResult);
    }
    public static String getStr(String str){
        char[] strNew =new char[5];
        char[] chars = str.toCharArray();
        Random ran = new Random();
        for (int i = 0; i < 5; i++) {
            strNew[i] =chars[ran.nextInt(10)];
        }
        String newStr = new String(strNew);
        return newStr;
    }
}
