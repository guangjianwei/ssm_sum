package day01.demo03;
import java.util.Calendar;

public class CalendarImpl {
    public static void main(String[] args) {
        //Calendar日期的应用,这个日期要先进行初始化，方式如下
        Calendar cal = Calendar.getInstance();
        //返回一个年
        System.out.println(cal.get(Calendar.YEAR));
        //返回一个月
        System.out.println(cal.get(Calendar.MONTH)+1);
        System.out.println(cal.get(Calendar.DATE));
        cal.set(Calendar.YEAR,2019);
        System.out.println(cal.get(Calendar.YEAR));
    }


}
