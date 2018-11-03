package com.product;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.List;

@WebServlet("/fileAllproductServlet")
public class fileAllproductServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
         response.setContentType("text/type;charset=utf-8");
          productList proList = new productList();
          //这里获取到数据库中所有的商品数据封装成list
         List<pruduct> list = proList.getList();
         //转发给pro_list.jsp,利用域共享数据
        request.setAttribute("list",list);
        request.getRequestDispatcher("/product/pro_list.jsp").forward(request,response);
    }
}
