package cn.guangjian.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("/*")
public class IfLoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //进行强转
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        //获取请求的虚拟路径
        String uri = request.getRequestURI();
        if (uri.contains("/login.jsp")||uri.contains("/loginServlet")||uri.contains("/js/")||uri.contains("/css/")||uri.contains("/fonts/")||uri.contains("/checkCodeServlet")){
            //直接放行
            chain.doFilter(req, resp);
        }else{
            //对session中的值进行判断
            String username = (String)request.getSession().getAttribute("username");
            if(username!=null){
                //直接放行
           chain.doFilter(req, resp);

            }else{
                //转发到登录页面并提示
                request.setAttribute("error","对不起,你尚未登录");
                request.getRequestDispatcher("/login.jsp").forward(request,response);
            }

        }

    }

    public void init(FilterConfig config) throws ServletException {

    }

}
