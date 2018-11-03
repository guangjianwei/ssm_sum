package cn.guangjian.servlet;

import cn.guangjian.dao.findAllDao;
import cn.guangjian.dao.impl.userDaoImpl;
import cn.guangjian.domain.Page;
import cn.guangjian.domain.user;
import cn.guangjian.service.getPageClassService;
import cn.guangjian.service.impl.getPageClassServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/listAllServlet")
public class listAllServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //这里要做的功能是向前端展示所查询数据库中所有内容
        //在这里进行一个分页的查询
        //获取currentPage
        request.setCharacterEncoding("utf-8");
        //获取搜索的三个参数
        String name = (request.getParameter("name1")==null?"":request.getParameter("name1"));
        String age = (request.getParameter("age1")==null?"":request.getParameter("age1"));
        String address = (request.getParameter("address1")==null?"":request.getParameter("address1"));

        //获得选中删除delectSelectServlet传来的域currentPage
        int currentPage=1;
        String current = request.getParameter("currentPage");
        if(current!=null&&current!=""&&current.length()>0){
        currentPage = Integer.parseInt(current);//页码
        }
        getPageClassService gpcs = new getPageClassServiceImpl();
        Page pageClass = gpcs.getPageClass(currentPage,name,age,address);
//        findAllDao fad = new userDaoImpl();
//          List<user> listAll = fad.findAll();
          //把pageClass存入request域中
         request.setAttribute("pageClass",pageClass);
         request.getRequestDispatcher("/list.jsp").forward(request,response);
    }
}
