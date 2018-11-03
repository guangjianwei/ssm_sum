package cn.guangjian.servlet;

import cn.guangjian.domain.user;
import cn.guangjian.service.impl.userServiceImpl;
import cn.guangjian.service.userService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //这里进行登录的验证
        //首先对验证码进行验证
        request.setCharacterEncoding("utf-8");
        //获取前端验证码,用户名,密码
        String checkCode = request.getParameter("verifycode");
        //这里防止用户提交的verifycode为null而使得今后出现空指针异常
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if(checkCode==null){
            checkCode="";
        }
        if (username==null){
            username="";
        }
        if(password==null){
            password="";

        }
        //获取真正的验证码
        HttpSession session = request.getSession();
        String checkcode_server = (String) session.getAttribute("CHECKCODE_SERVER");
        session.removeAttribute("CHECKCODE_SERVER");

        //进行验证码的匹配

            if(checkcode_server!=null&&checkcode_server.equalsIgnoreCase(checkCode)){
            //这里面是继续对姓名和密码进行验证
                //对获取的姓名和密码进行封装
                System.out.println("验证码正确");
                //对用户名和密码为空的校验
                if(username==""||password==""){
                    String error2 = "用户名和密码不能为空!";
                    request.setAttribute("error_checkUserNull",error2);
                    //在这里进行一次转发响应
                    request.getRequestDispatcher("/login.jsp").forward(request,response);
                }
                user user = new user();
                user.setUsername(username);
                user.setPassword(Integer.parseInt(password));
                userService usi = new userServiceImpl();
                Boolean flag = usi.checkUser(user);
                if(flag){
                    System.out.println("成功验证用户名和密码");
                    //这里利用请求转发
                    //把名字保存到session域中
                    request.getSession().setAttribute("username",user.getUsername());
                    request.setAttribute("username",user.getUsername());
                    request.getRequestDispatcher("/index.jsp").forward(request,response);
                }else{
                    String error3= "用户名和密码输入错误!";
                    request.setAttribute("error_userOrpassword",error3);
                    //在这里进行一次转发响应
                    request.getRequestDispatcher("/login.jsp").forward(request,response);
                }

            }else{
                if(checkCode.isEmpty()){
                    String error1 = "请输入验证码!";
                    request.setAttribute("error_checkCodeNull",error1);
                    //在这里进行一次转发响应
                    request.getRequestDispatcher("/login.jsp").forward(request,response);
                }else{
                    String error2 = "验证码输入错误!";
                    request.setAttribute("error_checkCode",error2);
                    //在这里进行一次转发响应
                    request.getRequestDispatcher("/login.jsp").forward(request,response);
                }
            }

    }
}
