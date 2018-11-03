package cn.itcast.day08.dmeo01.demo05;
import java.util.Random;

/*
题目：随机生成生成四个随机的字母，加上一个字符串汉字，进行拼接，拼接的顺序随意
 */
public class StringReplace {
    public static void main(String[] args) {
        String strs = "";
        char[] chars = new char[26];
        char[] charNew = new char[5];
        for (int i = 0; i < 26; i++) {
            chars[i] = (char) ('A' + i);
        }
        Random ran = new Random();
        for (int i = 0; i < 5; i++) {
            charNew[i] = chars[ran.nextInt(26)];
        }
        String strNew = new String(charNew);
        System.out.println(new String(charNew));
        System.out.println("替换后：");
        String newA = ("" + charNew[ran.nextInt(5)]);//单个char类型的字母转换成字符串只需要+""就可以了
        String newB = strNew.replace(newA, "小宝吃屎");
        System.out.println(newB);

    }
}
