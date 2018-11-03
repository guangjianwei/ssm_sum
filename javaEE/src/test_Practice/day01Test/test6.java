package test_Practice.day01Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test6 {
    public static void main(String[] args) throws ParseException {
        //题目：时间格式的转换
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date date = sdf.parse("2018-03-04");
        DateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        String str = sdf2.format(date);
        System.out.println(str);
    }
}
