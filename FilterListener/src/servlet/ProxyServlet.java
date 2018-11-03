package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ProxyServlet")
public class ProxyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          //获取参数
        response.setContentType("text/html;charset=utf-8");
        String name = request.getParameter("name");
        String like = request.getParameter("like");
        response.getWriter().write("name为:"+name);
        response.getWriter().write("<br>");
        response.getWriter().write("like为:"+like);


    }
}
