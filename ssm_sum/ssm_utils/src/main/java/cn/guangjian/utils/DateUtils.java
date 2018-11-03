package cn.guangjian.utils;
import org.springframework.stereotype.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
@Component("dataUtils")
public class DateUtils {

    public static String getStr(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return sdf.format(date);
    }
    public static Date getDate(String date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try {
            return sdf.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException("时间格式转换错误异常...");
        }
    }
}
