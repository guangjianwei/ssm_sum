package num05;

import java.util.Random;
import java.util.Scanner;

/*
 获取键盘录入的字符串str ，随机从字符串str中获取5次字符 ，
1次获取1个字符 ，将获取的5个字符拼接成新字符串 ，如新字符串中有小写字符，
将小写字符转换成大写字符 ，在控制台打印输出最终的新字符串
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Random ran = new Random();
        String str = sc.next();
        char[] charArr = str.toCharArray();
        char[] charArrNew =new char[5];
        for (int i = 0; i < charArrNew.length; i++) {
            charArrNew[i] = charArr[ran.nextInt(charArr.length)];
        }
        for (int i = 0; i < charArrNew.length; i++) {
            if((int)charArrNew[i]>=97&&(int)charArrNew[i]<=122){
                charArrNew[i]=(char)((int)charArrNew[i]-32);//这里是char类型转成int类型，进行计算后，再转成char类型
            }
        }
        System.out.println(new String(charArrNew));
//        char[] arr =new char[]{'4','y'};
//        System.out.println(new String(arr));
    }
}
