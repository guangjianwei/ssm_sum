package test_Practice.day01Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//格式化日期对象的使用  把2017:08：08转换成2017-08-08
public class test5 {
    public static void main(String[] args) throws ParseException {
        String str1 = "2017:08:08";
        SimpleDateFormat sdf1= new SimpleDateFormat("yyyy:MM:dd");
        SimpleDateFormat sdf2= new SimpleDateFormat("yyyy-MM-dd");
        str1 = sdf2.format(sdf1.parse(str1));
        System.out.println(str1);
    }
}
