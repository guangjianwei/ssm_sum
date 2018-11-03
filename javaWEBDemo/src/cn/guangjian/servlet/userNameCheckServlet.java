package cn.guangjian.servlet;

import cn.guangjian.service.impl.userServiceImpl;
import cn.guangjian.service.userService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/userNameCheckServlet")
public class userNameCheckServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      //这里对用户名进行校验
        System.out.println("对用户名进行校验");
        response.setContentType("text/html,charset=utf-8");
        String username = request.getParameter("username");
        //防止出现空指针异常
        if(username==null){
            username = "";
        }
        userService usercheck = new userServiceImpl();
        Boolean flag = usercheck.userNameCheck(username);
        System.out.println("成功验证用户名:"+flag);
        if(flag){
            //代表用户名不存在,可以让用户进行注册
            //进行转发和存储
           response.getWriter().write("用户名存在");
        }else{
            //用户名存在,同样进行转发和存储
            response.getWriter().write("用户名不存在,可以使用");
        }


    }
}
