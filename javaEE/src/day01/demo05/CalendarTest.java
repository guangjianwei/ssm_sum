package day01.demo05;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Date time = cal.getTime();
        System.out.println(time);
        int year = cal.get(Calendar.YEAR);
        System.out.println(year);
        cal.add(Calendar.YEAR,-3);
        int year1 = cal.get(Calendar.YEAR);
        System.out.println(year1);
        int i = get();
        System.out.println(i);

    }
    public static  int get(){
       return 3;
    }
}
