package num06;

import java.util.Scanner;

/*
1、编写一个无返回值，参数为String类型的方法，实现以下功能：
a.将传入的字符串中的大写字母变成小写字母，小写字母变成大写字母，其余字符不变。并且统计转换了多少次（大小写转换总和）
b.在控制台打印输出转换后的字符串以及转换总次数
2、在main方法中键盘录入一个字符串，并将该字符串传入上述方法中，调用测试。
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result =change(sc.next());
        System.out.println(result);

    }

    public static String change(String str) {
        int count = 0;
        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if ((int) charArr[i] >= 97 && (int) charArr[i] <= 122) {
                charArr[i] = (char) ((int) charArr[i] - 32);//这里是char类型转成int类型，进行计算后，再转成char类型
                count++;
            } else if ((int) charArr[i] >= 65 && (int) charArr[i] <= 90) {
                charArr[i] = (char) ((int) charArr[i] + 32);
                count++;
            }
        }
        System.out.println("一共转换了：" + count + "次");
        return new String(charArr);
    }
}
