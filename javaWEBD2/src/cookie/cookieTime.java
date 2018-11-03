package cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/cookieTime")
public class cookieTime extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
          //获取名为cookie中名字为lastTime的值
        Boolean flag = false;
        Cookie[] cookies = request.getCookies();
        if(cookies!=null&&cookies.length>0){
            for (Cookie cookie : cookies) {
                String name = cookie.getName();
                if ("lastTime".equals(name)) {
                    //这次访问的时间重新赋值
                    flag=true;
                    Date newdate = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String str_newdate = sdf.format(newdate);
                    String  str_newdate1 = URLEncoder.encode(str_newdate, "utf-8");
                    cookie.setValue(str_newdate1);
                    //获取值
                    String value = cookie.getValue();
                    //对获取的value进行解码
                    String decode = URLDecoder.decode(value, "utf-8");
                    System.out.println("您上次访问的时间是:" + decode);
                    break;
                }
            }
        }
        if(cookies==null||cookies.length==0||flag==false){
            System.out.println("欢迎首次访问!");
            Date date = new Date();
            SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String str_date = sdf.format(date);
            //重新创建一个名字为lastTime的cookie
            //为防止其中的空格字符影响cookie的存储,所以要对存储的数据进行编码
            String str_date1 = URLEncoder.encode(str_date, "utf-8");
            Cookie lastTime = new Cookie("lastTime", str_date1);
            //发布
            response.addCookie(lastTime);
        }
        }
    }
