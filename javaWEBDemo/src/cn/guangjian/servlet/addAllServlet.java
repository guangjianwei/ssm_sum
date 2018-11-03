package cn.guangjian.servlet;

import cn.guangjian.dao.addAllDao;
import cn.guangjian.dao.impl.userDaoImpl;
import cn.guangjian.dao.userDao;
import cn.guangjian.domain.user;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addAllServlet")
public class addAllServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //获取所有提交的数据
        //逐个获取到所有数据
        request.setCharacterEncoding("utf-8");
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String sex = request.getParameter("sex");
        String age = request.getParameter("age");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        String datetime = request.getParameter("datetime");
        user user =new user();
        user.setUsername(name);
        user.setPassword(Integer.parseInt(password));
        user.setGender(sex);
        user.setAge(Integer.parseInt(age));
        user.setAddress(address);
        user.setPhoneNumber(phone);
        user.setDate(datetime);
        System.out.println(user.toString());
        addAllDao aad = new userDaoImpl();
        aad.add(user);
        //请求转发到listAllServlet
        request.getRequestDispatcher("/listAllServlet").forward(request,response);
    }
}
