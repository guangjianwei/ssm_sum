package test_Practice.day01Test;

import java.util.Calendar;

public class test7 {
    public static void main(String[] args) {
        //创建Calendar对象
        Calendar c = Calendar.getInstance();
        //设置属性
        c.set(Calendar.YEAR, 2018);
        c.set(Calendar.MONTH, 1);
        c.set(Calendar.DATE, 14);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;//这里月份是0-11，所以要+1；
        int date = c.get(Calendar.DATE);
        char week = getWeek(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(year+"年"+month+"月"+date+"日是星期"+week);
    }
    //定义方法，获取星期汉字
    public static char getWeek(int a){
        char[] chars = {' ','日','一','二','三','四','五','六'};//因为传递过来的参数没有0，所以我们要在0索引赋值一个空值
        return chars[a];
    }
}
