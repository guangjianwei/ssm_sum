package day01.demo02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class simple {
    public static void main(String[] args) throws ParseException {
        //把时间的文本格式转换成是Date格式
        String date = "2018-08-09";
        SimpleDateFormat spf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = spf.parse(date);
        System.out.println(date1);
        //把Date格式转换成是文本格式
        Date date2 = new Date();
        System.out.println(spf.format(date2));
    }
}
