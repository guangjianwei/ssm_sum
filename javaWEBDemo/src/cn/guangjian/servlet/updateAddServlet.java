package cn.guangjian.servlet;

import cn.guangjian.dao.impl.userDaoImpl;
import cn.guangjian.dao.updateAddIdDao;
import cn.guangjian.domain.user;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/updateAddServlet")
public class updateAddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String sex = request.getParameter("sex");
        String age = request.getParameter("age");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        String datetime = request.getParameter("datetime");
        user user =new user();
        user.setId(id);
        user.setUsername(name);
        user.setPassword(Integer.parseInt(password));
        user.setGender(sex);
        user.setAge(Integer.parseInt(age));
        user.setAddress(address);
        user.setPhoneNumber(phone);
        user.setDate(datetime);
         updateAddIdDao uaid = new userDaoImpl();
         uaid.updateAdd(user);
        //请求转发到listAllServlet
        request.getRequestDispatcher("/listAllServlet").forward(request,response);
    }
}
