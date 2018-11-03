package guangjian.web.servlet;

import guangjian.service.ProviceService;
import guangjian.service.serviceImpl.ProviceServiceImpl;

import java.io.IOException;

@javax.servlet.annotation.WebServlet("/proviceServlet")
public class ProviceServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
         //设置字符集
        response.setContentType("text/html;charset=utf-8");
        //获取查询json数据
        ProviceService proviceService = new ProviceServiceImpl();
        String proviceJson = proviceService.getProviceJson();
        System.out.println(proviceJson);
        //回写数据
        response.getWriter().write(proviceJson);
    }
}
