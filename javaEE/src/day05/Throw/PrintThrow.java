package day05.Throw;
/*
Throw里面提供了三种处理异常信息的方法
1.getMessage():获取异常信息描述信息，原因（就是提示用户异常错误的原因）
2.toString():获取异常的类型和异常描述信息
3.printStackTrace():打印异常的跟踪栈信息并输出到控制台。
 catch中常见的三种处理方式：
  记录日志
  打印异常信息
  继续抛出异常信息
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintThrow {
    public static void main(String[] args) {
        SimpleDateFormat spf = new SimpleDateFormat("yyyy-MM-dd");
        String time ="19900000";
        System.out.println("程序执行");
        try {
            Date date = spf.parse(time);
        } catch (ParseException e) {
//            e.printStackTrace();//这是打印异常信息
            throw new RuntimeException();//编译期异常转换成运行期异常，程序终止

        }finally {
            System.out.println("无论程序怎样异常，该finally内容都会被执行");
        }
        System.out.println("执行结束");
    }
}
