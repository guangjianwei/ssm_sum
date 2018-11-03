package num09;

import java.util.Random;
import java.util.Scanner;

/*
定义方法 found(String str)
要求如下:
形参: String str
返回值类型 int
实现:从str中随机获取一个字符，将该字符打印在控制台，并且统计该字符在str中出现的次数
在main方法中完成以下要求，从控制台键盘录入一个字符串,调用found(String str)方法，在控制台输出返回的次数
格式如下:
示例1
请输入一个字符串:
abcdefac
随机字符是:f
随机字符出现的次数:1
示例2
请输入一个字符串:
abcdefac
随机字符是:a
随机字符出现的次数:2
 */
public class Test {
    public static void main(String[] args) {
        System.out.print("请输入一个字符串：");
        Scanner sc =new Scanner(System.in);
        String str =sc.next();
        System.out.print("随机字符是：");
        Random ran =new Random();
        char[] charStr = str.toCharArray();
        char one = charStr[ran.nextInt(charStr.length)];
        System.out.println(one);
        int count = found(str,one);
        System.out.println("出现次数："+count);
    }
    public static int found(String str,char one){
        int count=0;
        char[] chars =str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]==one){
                count++;
            }
        }
        return count;
    }
}
