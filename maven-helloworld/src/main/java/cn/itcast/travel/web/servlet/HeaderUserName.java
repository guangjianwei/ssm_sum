package cn.itcast.travel.web.servlet;

import cn.itcast.travel.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/headerUserName")
public class HeaderUserName extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取session中的user数据
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        //排除空指针异常的可能
        try {
            User user = (User)request.getSession().getAttribute("user");
            String username = user.getUsername();
            response.getWriter().write(user.getUsername());
        } catch (Exception e) {
            System.out.println("空指针异常！");
        }
    }
}
