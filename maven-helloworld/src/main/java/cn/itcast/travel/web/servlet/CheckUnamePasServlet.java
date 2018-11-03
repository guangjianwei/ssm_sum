package cn.itcast.travel.web.servlet;

import cn.itcast.travel.domain.ResultInfo;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.service.LoginService;
import cn.itcast.travel.service.impl.LoginServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/loginServlet")
public class CheckUnamePasServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取用户名和密码
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        LoginService loginService = new LoginServiceImpl();
        User user = loginService.checkUnamePass(username, password);
        //对异常类型进行赋值判断
        ResultInfo info = new ResultInfo();
        if(user==null){
         info.setFlag(false);
         info.setErrorMsg("对不起,您输入的用户名或密码错误");
         }else{
            //登录成功标记
            info.setErrorMsg("恭喜你,登录成功!");
            info.setFlag(true);
            info.setData(user);
            HttpSession session = request.getSession();
            //把用户的一些信息存入session中
            session.setAttribute("user",user);
        }
        //响应数据
        ObjectMapper mapper = new ObjectMapper();

        response.setContentType("application/json;charset=utf-8");
        mapper.writeValue(response.getOutputStream(),info);
    }
}
