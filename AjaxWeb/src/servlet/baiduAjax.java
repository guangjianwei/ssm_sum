package servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import dao.BaiduSearch;
import domain.Search;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 *主要是展示百度下拉搜索展示框
 */
@WebServlet("/baiduAjax")
public class baiduAjax extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         request.setCharacterEncoding("utf-8");
        String name = request.getParameter("name");
        BaiduSearch baiduSearch = new BaiduSearch();
        List<Search> search = baiduSearch.search(name);
        try {
            ObjectMapper obj = new ObjectMapper();
            String s = obj.writeValueAsString(search);
            response.getWriter().write(s);
        } catch (IOException e) {
            System.out.println("可能会出错！！！");
        }

    }
}
