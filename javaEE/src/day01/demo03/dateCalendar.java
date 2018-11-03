package day01.demo03;
import java.util.Calendar;
import java.util.Date;

/*
Calendar日历常用方法,是一个抽象类，可以获得单个的具体的时间，譬如，年，月，日等。
注意，这里的日期是
  月份：0-11；
  add();
  getTime();
 */
public class dateCalendar {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        //下面为取数据
        int year =cal.get(Calendar.YEAR);
        System.out.println("年："+year);
        int month  =cal.get(Calendar.MONTH);
        System.out.println("月："+month);
        int day  = cal.get(Calendar.DATE);
        System.out.println("日："+day);
        System.out.println("==========");
        //下面为设置日历
        cal.set(Calendar.YEAR,2020);
        System.out.println("年："+year);
        cal.set(Calendar.MONTH,1);
        System.out.println("月："+month);
        cal.set(Calendar.DATE,1);
        System.out.println("日："+day);
        System.out.println("==========");
        //偏移量add（）方法
        cal.add(Calendar.YEAR,-100);
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println("===========");
        //把日期转换为Date();
        Date date = cal.getTime();
        System.out.println(date);
    }
}
