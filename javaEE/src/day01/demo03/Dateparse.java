package day01.demo03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
计算从出生到现在一共经历的多少天。
 */
public class Dateparse {
    public static void main(String[] args) throws ParseException {
        //1.首先获取出生和现在的时间对象
        Date dateNow = new Date();
        long dataNowTime = dateNow.getTime();//获取当前的时间
        System.out.println("请输入出生的时间（按照YYYY-MM--dd格式）：");
        Scanner sc = new Scanner(System.in);
        String strBirthday = sc.nextLine();
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
        Date dataBirthday = sdf.parse(strBirthday);
        long dataBirthdayTime = dataBirthday.getTime();//获取出生的时间
        System.out.println("经历了"+(dataNowTime-dataBirthdayTime)/(1000*60*60*24)+"天");

    }
}
