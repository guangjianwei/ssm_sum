package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servletAjax")
public class ServletAjax extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String mimeType = this.getServletContext().getMimeType(".json");
        response.setContentType(mimeType);
        String username = request.getParameter("username");
        String password = request.getParameter("password");
   //     String json = "{\"username\":"+username+",\"password\":"+password+"}";
        String json = "{\"username\": \"" + username + "\"}";
        response.getWriter().write(json);
        System.out.println(username);
        System.out.println(password);
        System.out.println("123");
    }
}
