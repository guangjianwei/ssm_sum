package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add/*")
public class AddServlet extends BaseServlet {
    protected void addOne(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("addOne...");
    }

    protected void addAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("addAll...");
    }
}
