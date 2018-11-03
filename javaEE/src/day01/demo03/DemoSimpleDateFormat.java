package day01.demo03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DemoSimpleDateFormat {

    public static void main(String[] args) throws ParseException {
        //计算当前的时间毫秒值
        SimpleDateFormat spf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        long nowTime = date.getTime();
        System.out.println("请输入生日时间(格式：yyyy-MM-dd)");
        Scanner sc = new Scanner(System.in);
        String strSC= sc.nextLine();
        long birthdayTime = spf.parse(strSC).getTime();
        System.out.println("时间差是："+(nowTime-birthdayTime)/1000/60/60/24+"天");
    }
}
