package cn.guangjian.servlet;

import cn.guangjian.dao.impl.userDaoImpl;
import cn.guangjian.dao.selectIdDao;
import cn.guangjian.domain.user;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/showUpdateServlet")
public class showUpdateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取id
        request.setCharacterEncoding("utf-8");
        int id = Integer.parseInt(request.getParameter("id"));
        selectIdDao selId = new userDaoImpl();
        List<user> list = selId.selectId(id);
        //存储到request域中
        System.out.println(list.toString());
        request.setAttribute("list",list);
        request.getRequestDispatcher("/update.jsp").forward(request,response);
        }
}
