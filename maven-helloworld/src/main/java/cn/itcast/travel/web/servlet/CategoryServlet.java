package cn.itcast.travel.web.servlet;

import cn.itcast.travel.service.CategoryService;
import cn.itcast.travel.service.impl.CategoryServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/category/*")
public class CategoryServlet extends BaseServlet {
    /**
     * 商品分类展示列表
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void categoryList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CategoryService categoryService = new CategoryServiceImpl();
        //调用函数,获得json对象
        String json = categoryService.showCategory();
        //回写
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(json);
    }

}
