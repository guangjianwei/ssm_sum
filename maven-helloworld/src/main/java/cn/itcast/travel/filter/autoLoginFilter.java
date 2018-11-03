package cn.itcast.travel.filter;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.service.LoginService;
import cn.itcast.travel.service.impl.LoginServiceImpl;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/*")
public class autoLoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //先判断session中是否有值
        HttpServletRequest request = (HttpServletRequest) req;
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        if(user==null){
            Cookie[] cookies = request.getCookies();
            for (Cookie cookie : cookies) {
                if("autoLogin".equals(cookie.getName())){
                    //获取cookie中的用户名
                    String username= cookie.getValue().split("-")[0];
                    String password = cookie.getValue().split("-")[1];
                    //再次查询数据库进行验证
                    LoginService loginService = new LoginServiceImpl();
                    User newuser = loginService.checkUnamePass(username, password);
                    if(newuser!=null){
                        //存入session中
                        session.setAttribute("user",newuser);
                    }
                break;
                }
            }

        }
        chain.doFilter(request, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
