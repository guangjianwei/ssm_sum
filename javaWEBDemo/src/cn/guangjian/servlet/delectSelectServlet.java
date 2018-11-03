package cn.guangjian.servlet;

import cn.guangjian.dao.impl.userDaoImpl;
import cn.guangjian.dao.selectDelDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.invoke.VarHandle;

@WebServlet("/delectSelectServlet")
public class delectSelectServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取id数组
        request.setCharacterEncoding("utf-8");
        String[] ids = request.getParameterValues("check");
        selectDelDao sedd = new userDaoImpl();
        sedd.selectDel(ids);
        //请求转发
        request.getRequestDispatcher("/listAllServlet").forward(request,response);
    }
}
