package cn.itcast.travel.web.servlet;

import cn.itcast.travel.domain.ResultInfo;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.service.LoginService;
import cn.itcast.travel.service.UserService;
import cn.itcast.travel.service.impl.LoginServiceImpl;
import cn.itcast.travel.service.impl.UserServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/user/*")
public class UserServlet extends BaseServlet {
    protected void addUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取所有内容
        request.setCharacterEncoding("utf-8");
        //封装user
        Map<String, String[]> map = request.getParameterMap();
        User user = new  User();
        try {
            BeanUtils.populate(user,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        //把数据加载
        UserService userService = new UserServiceImpl();
        userService.addUserService(user);
        System.out.println("恭喜您已经成功注册!");
    }

    protected void checkUnamePas(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取用户名和密码
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //获取用户是否选择了自动登录
        String autoLogin = request.getParameter("autoLogin");
        LoginService loginService = new LoginServiceImpl();
        User user = loginService.checkUnamePass(username, password);
        //调用方法，看用户的激活状态
        UserService userService = new UserServiceImpl();
        Boolean status = userService.checkUserStatus(username);
        //对异常类型进行赋值判断
        ResultInfo info = new ResultInfo();
        if(user==null){
            info.setFlag(false);
            info.setErrorMsg("对不起,您输入的用户名或密码错误");
        }else {
            //登录成功标记
            if (!status) {
                //用户密码都正确的情况下，验证用户的激活状态为"N"
                info.setFlag(false);
                info.setErrorMsg("对不起,用户尚未激活");
            } else{
                info.setErrorMsg("恭喜你,登录成功!");
            info.setFlag(true);
            info.setData(user);
            HttpSession session = request.getSession();
            //把用户的一些信息存入session中
            session.setAttribute("user", user);
            //判断用户是否选择了自动登录
            if ("true".equals(autoLogin)) {
                //如果选择了,则把user信息存入Cookie中
                Cookie cookies = new Cookie("autoLogin", user.getUsername() + "-" + user.getPassword());
                cookies.setMaxAge(60 * 60 * 60 * 7);//设置保存时间为一个星期
                cookies.setPath("/");
                response.addCookie(cookies);
            }
        }
        }
        //响应数据
        ObjectMapper mapper = new ObjectMapper();

        response.setContentType("application/json;charset=utf-8");
        mapper.writeValue(response.getOutputStream(),info);
    }
    protected void checkUname(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        //对用户名进行判断,返回一个boolean类型
        UserService checkuser =new UserServiceImpl();
        boolean flag = checkuser.checkUsername(username);
        String json = "{\"flag\":"+flag+"}";
        response.getWriter().write(json);
    }
    protected void showHeaderUname(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取session中的user数据
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        //排除空指针异常的可能
        try {
            User user = (User)request.getSession().getAttribute("user");
            String username = user.getUsername();
            response.getWriter().write(user.getUsername());
        } catch (Exception e) {
            System.out.println("空指针异常！");
        }
    }
    protected void exitLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取session，把存入的用户信息删除
        HttpSession session = request.getSession();
        session.removeAttribute("user");
        //再把cookie中信息删除
        Cookie cookie = new Cookie("autoLogin","");
        cookie.setMaxAge(0);
        cookie.setPath("/");
        response.addCookie(cookie);
//        Cookie[] cookies = request.getCookies();
//        for (Cookie cookie : cookies) {
//            if("autoLogin".equals(cookie.getName())){
//                cookie.setMaxAge(0);//删除cookie中的信息
//                response.addCookie(cookie);
//            break;
//            }
//        }

        response.sendRedirect(request.getContextPath()+"/login.html");
    }
    protected void checkUserIsStatus(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uname = request.getParameter("uname");
        UserService userService = new UserServiceImpl();
        Boolean flag =  userService.checkUserStatus(uname);
        String json = "{\"flag\":\""+flag+"\"}";
        response.getWriter().write(json);
    }
    protected void activeUserServlet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取激活码
        UserService userService = new UserServiceImpl();
        request.setCharacterEncoding("utf-8");
        String code = request.getParameter("code");
        //判断
        if(code!=null){
            //用户已经激活
           Boolean flag =  userService.activeUser(code);
           String msg = null;
           if(flag){
               //激活成功
               msg = "恭喜您，激活成功！<a href='http://localhost:9090/mgr/login.html'>登陆<a/>";
           }else{
               //激活失败
               msg = "激活失败，请联系管理员！";
           }
           response.setContentType("text/html;charset=utf-8");
           response.getWriter().write(msg);
        }
    }
    protected void demo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String json = "{\"name\":\"zhangsan\"}";
        response.getWriter().write(json);
    }
    }
