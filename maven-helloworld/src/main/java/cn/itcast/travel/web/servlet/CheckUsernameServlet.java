package cn.itcast.travel.web.servlet;

import cn.itcast.travel.service.UserService;
import cn.itcast.travel.service.impl.UserServiceImpl;
import com.alibaba.druid.support.profile.ProfileEntryReqStat;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

    @WebServlet("/checkUsernameServlet")
public class CheckUsernameServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        //对用户名进行判断,返回一个boolean类型
        UserService checkuser =new UserServiceImpl();
        boolean flag = checkuser.checkUsername(username);
        String json = "{flag:"+flag+"}";
        ObjectMapper obj = new ObjectMapper();
        String s = obj.writeValueAsString(json);
        response.getWriter().write(s);

    }
}
