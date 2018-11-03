package cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cookieDemo1")
public class cookieDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          //创建Cookie对象绑定数据
        String cook1 = request.getParameter("username");
        String cook2 = request.getParameter("password");
        Cookie cookie1 = new Cookie("name", cook1);
        Cookie cookie2 = new Cookie("pass", cook2);
        cookie1.setMaxAge(30);//设置cookie的存活时间为30秒
        cookie2.setMaxAge(30);//设置cookie的存活时间为30秒
        //发送cookie
        response.addCookie(cookie1);
        response.addCookie(cookie2);
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie3 : cookies) {
            System.out.println(cookie3.getName());
        }
    }
}
