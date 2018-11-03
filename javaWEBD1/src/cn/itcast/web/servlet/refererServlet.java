package cn.itcast.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/refererServlet")
public class refererServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        System.out.println(123);
        String referer = request.getHeader("referer");
        System.out.println(referer);
        Cookie cook = new Cookie("msg","我是你的全世界");
        cook.setMaxAge(60*60);
        cook.setPath("/");
        response.addCookie(cook);
        response.sendRedirect(request.getContextPath()+"/refererServlet1");
    }
}
