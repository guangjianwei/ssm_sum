package demo01.num07;

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
public class test {
    public static void main(String[] args) {
        int count=0;
        System.out.println("请输入一个字符串：");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] charsArray = str.toCharArray();
        System.out.println("请输入一个随机字符：");
        String strOne = sc.next();
        for (int i = 0; i < charsArray.length; i++) {
            if((charsArray[i]+"").equals(strOne)){
                count++;
            }
        }
        System.out.println("随机数出现的次数是："+count);
    }
}
