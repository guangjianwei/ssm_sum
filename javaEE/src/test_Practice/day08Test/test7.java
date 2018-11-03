package test_Practice.day08Test;


import java.time.temporal.TemporalAmount;

/*
练习二:递归的使用(一)
描述:
用递归实现不死神兔
故事得从西元1202年说起，话说有一位意大利青年，名叫斐波那契。
在他的一部著作中提出了一个有趣的问题：假设一对刚出生的小兔一个月后就能长成大兔，
再过一个月就能生下一对小兔，并且此后每个月都生一对小兔，没有发生死亡，
问：现有一对刚出生的兔子2年后(24个月)会有多少对兔子?
分析：
1. int month = 24；int count
月份 0   兔子个数：2
         用m代表老兔子（可产兔子的）  y代表新兔子  n代表仅是长大的兔子   总的
    1      0                       0            2               2
    2      2                       2            0               4
    3      2                       2            2               6
    4      4                       4            2               10
    5      6                       6            4               16
    6      10                      10           6               26
    7      16                      16           10              42
    8      26                      26           16              68

 */
public class test7 {
    public static void main(String[] args) {
        int n = 23;
//        int[] arrM = new int[24];
//        arrM[0]=2;
//        arrM[1]=4;
        System.out.println(getM(n));
    }

    private static int getM(int n) {
        if(n==0){
            return 2;
        }
        if(n==1){
            return 4;
        }
        else {
            return getM(n-1)+getM(n-2);
        }
    }
}
