package test_Practice.day13Test;

import java.util.Map;
import java.util.function.Predicate;

/*
练习一：Pedicate接口使用
1.请在测试类main方法中完成以下需求
已知有Integer[] arr = {-12345, 9999, 520, 0,-38,-7758520,941213}
a)使用lambda表达式创建Predicate对象p1,p1能判断整数是否是自然数(大于等于0)
b)使用lambda表达式创建Predicate对象p2,p2能判断整数的绝对值是否大于100
c)使用lambda表达式创建Predicate对象p3,p3能判断整数是否是偶数

	遍历arr，仅利用已创建的Predicate对象(不使用任何逻辑运算符)，完成以下需求
i.打印自然数的个数
ii.打印负整数的个数
iii.打印绝对值大于100的偶数的个数
iv.打印是负整数或偶数的数的个数
 */
public class test1 {
    public static void main(String[] args) {
        Integer[] arr = {-12345, 9999, 520, 0, -38, -7758520, 941213};
        Predicate<Integer> p1 = s->s>=0;
        Predicate<Integer> p2 = s->Math.abs(s)>100;
        Predicate<Integer> p3 = s->s%2==0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        for (Integer s : arr) {
            if(p1.test(s)){
                count1++;
            }
            if(p1.negate().test(s)){
                count2++;
            }
            if(p2.test(s)){
                count3++;
                }
            if(p1.negate().or(p2).test(s)){
                count4++;
                }
        }
        System.out.println("自然数的个数为："+count1);
        System.out.println("负整数的个数为："+count2);
        System.out.println("绝对值大于100的偶数的个数为："+count3);
        System.out.println("是负整数或偶数的数的个数为："+count4);
    }

//    private static void getNum(Integer[] arr, Predicate<Integer> p1) {
//        int count = 0;
//        for (Integer integer : arr) {
//           if(p1.test(integer)){
//               count++;
//           }
//
//        }
//        System.out.println("一共"+count+"个");
//    }

}
