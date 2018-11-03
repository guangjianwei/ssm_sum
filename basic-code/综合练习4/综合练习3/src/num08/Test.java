package num08;

import java.util.Arrays;

/*
(1)定义数组,存储如下数据:"hElLo1","wOrLd002","jAVA3","bEst!","loVe","enJoy#"
(2)定义方法,统计数组中大写,小写,数字字符的个数并进行打印,打印格式如下:
大写字符: 个
小写字符: 个
数字字符: 个
(3)定义方法,将字符串中包含数字的字符串替换成"*",并打印结果,打印格式如下:
替换前:["hElLo1","wOrLd002","jAVA3","bEst!","loVe","enJoy#"]
替换后:["*","*","*","bEst!","loVe","enJoy#"]
(4)定义方法,将字符串的小写转换成大写,大写转换成小写(用码表值转换,大写转小写+32,小写转大写-32),其他字符不变并打印结果,打印格式如下:
转换前:["*","*","*","bEst!","loVe","enJoy#"]
转换后:[*, *, *, BeST!, LOvE, ENjOY#]
 */
public class Test {
    public static void main(String[] args) {
        String[] arrStu = {"hElLo1", "wOrLd002", "jAVA3", "bEst!", "loVe", "enJoy#"};
        getCount(arrStu);
        change(arrStu);
        changeA(arrStu);
    }

    public static void getCount(String[] arrStu) {
        int count1 = 0;//大写字母的个数
        int count2 = 0;//小写字母的个数
        int count3 = 0;//数字的个数
//        char[] charArr = arrStu.toCharArray();
        for (int j = 0; j < arrStu.length; j++) {
            char[] charArr = arrStu[j].toCharArray();
            for (int i = 0; i < charArr.length; i++) {
                if ((int) charArr[i] >= 97 && (int) charArr[i] <= 122) {
//                    charArr[i] = (char) ((int) charArr[i] - 32);//这里是char类型转成int类型，进行计算后，再转成char类型
                    count1++;
                } else if ((int) charArr[i] >= 65 && (int) charArr[i] <= 90) {
//                    charArr[i] = (char) ((int) charArr[i] + 32);
                    count2++;
                } else if ((int) charArr[i] >= 48 && (int) charArr[i] <= 57) {
//                    charArr[i] = (char) ((int) charArr[i] + 32);
                    count3++;
                }
            }
        }
        System.out.println("大写字母个数：" + count1 + "个");
        System.out.println("小写字母个数：" + count2 + "个");
        System.out.println("数字个数：" + count3 + "个");

    }

    public static void change(String[] stuArr) {
        System.out.print("转换前：");
        System.out.println(Arrays.toString(stuArr));
        for (int j = 0; j < stuArr.length; j++) {
            char[] charArr = stuArr[j].toCharArray();
            for (int i = 0; i < charArr.length; i++) {
                if ((int) charArr[i] >= 48 && (int) charArr[i] <= 57) {
                    stuArr[j] = "*";
                    continue;
                }
            }
        }
        System.out.print("转换后：");
        System.out.println(Arrays.toString(stuArr));
    }

    public static void changeA(String[] arrStu) {
        System.out.print("转换前：");
        System.out.println(Arrays.toString(arrStu));
        for (int j = 0; j < arrStu.length; j++) {
            char[] charArr = arrStu[j].toCharArray();
            for (int i = 0; i < charArr.length; i++) {
                if ((int) charArr[i] >= 97 && (int) charArr[i] <= 122) {
                    charArr[i] = (char) ((int) charArr[i] - 32);//这里是char类型转成int类型，进行计算后，再转成char类型

                } else if ((int) charArr[i] >= 65 && (int) charArr[i] <= 90) {
                    charArr[i] = (char) ((int) charArr[i] + 32);

                }
            }
           arrStu[j]=new String(charArr);
        }
        System.out.print("转换后：");
        System.out.println(Arrays.toString(arrStu));
    }
}
