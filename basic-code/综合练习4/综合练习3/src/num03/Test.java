package num03;
/*
编写一个Java程序，定义一个String字符串"   ab123cd  "，
首先去除字符串两端的空白，然后截取出字符串中的最后3个字符并在控制台输出。

解题分析：
1.定义一个字符串，
2.去除两端的空白trim();
3.截取subSting(index),index从length-3的位置开始截取
 */
public class Test {
    public static void main(String[] args) {
        String str = "   ab123cd  ";
        String strNew = str.trim();
        System.out.print("截取前：");
        System.out.println(strNew);
        System.out.print("截取后：");
        System.out.println(strNew.substring(strNew.length()-3));
    }


}
