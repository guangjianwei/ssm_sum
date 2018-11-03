package num01;

import java.util.Scanner;

/*
请编写程序，键盘录入1个字符串，统计字符串中的大写字符个数，小写字符个数和数字的个数。
格式如下：
		数字个数：3
请输入：	小写字符个数：2
		大写字符个数：2
解题步骤：
1.定义输出一个字符串，把字符串装换成char类型的数组（定义一个countA，countB为小写字母计数）
2.对char数组中的每个元素进行转换成int类型
3.对int类型的数字进行判断，在65-90为大写字母则countA++，在97-122为小写字母则countB++
4.分别输出countA，和countB。
 */
public class Test {
    public static void main(String[] args) {
        int countA=0;
        int countB=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入：");
        String str = sc.next();
        char[] charAarray = str.toCharArray();
        for (int i = 0; i < charAarray.length; i++) {
            if((int)charAarray[i]>=65&&(int)charAarray[i]<=90){
                countA++;
            }else if((int)charAarray[i]>=97&&(int)charAarray[i]<=122){
                countB++;
            }
        }
        System.out.println("大写字符串有："+countA+"个");
        System.out.println("小写字符串有："+countB+"个");
    }
}
