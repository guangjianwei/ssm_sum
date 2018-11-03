package Java基础.基础模块;

import java.util.Calendar;
import java.util.Date;

/*
* Calendar c = Calendar.getInstance();
int get(int field) : 获取指定字段的 时间值(注意获取月份字段时,月份要 +1 ,因为老外的日历只有11个月,转换为我们的习惯需要+1)
Date getTime() : 获取当前日历对象中的 Date日期对象（注意：这里不是获取毫秒值）
void setTime(Date date) : 使用给定的Date对象，设置此日历对象Calendar的时间

* */
public class Test_Calendar {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("year : " + year + " month : " + (month + 1) + " day : " + day);
    }
}
