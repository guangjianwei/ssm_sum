package day01.demo03;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class deteFormate {
    //按照指定的格式打印时间，以时间格式和文本格式之间的转换
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        //第一，Date时间格式转成指定String类型输出
        Date date =new Date();
        String strDate = sdf.format(date);
        System.out.println(strDate);

        String strLeft ="2000-01-02";
        Date strRight =sdf.parse(strLeft);
        System.out.println(strRight);

    }
}
