package day01.demo02;
//如果Date()里面没有
import java.util.Date;

public class date {
    public static void main(String[] args) {
        Date date =new Date();//Date(long time) 这里
        // 面是有参数的，代表时间的偏移量，单位是毫秒
        System.out.println(date);
        Date date1 = new Date(0);
        Date date2 = new Date(10000);
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date.getTime());//这里面获取的时间毫秒是以基准时间为时间轴
    }
}
