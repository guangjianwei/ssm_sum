package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * /index.jsp									具体资源路径,只能拦截这个路径,如果是 x/y/index.jsp都拦截不了
 * /x/y/z/* 拦截/x/y/z目录下的所有请求	 			拦截目录
 * /* 拦截所有访问服务器的请求	 					拦截所有资源
 * .jsp 拦截所有后缀名为jsp请求					后缀名拦截
 *
 *
 *
 * 只有这四种写法,不能配合起来使用  如:/x/y/z/*.jsp   这种配置使用后,Tomcat直接会启动不了
 *
 * 监听器:
 * ServletContextListener, 一个项目只会创建一次,声明周期的方法只会执行一次.
 */
//@WebFilter("/jsp/*.jsp")
@WebFilter("/*")
public class FilterDemo implements Filter {
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //此处获取到的request并不是http协议的request,需要强转
        HttpServletRequest request = (HttpServletRequest) req;
        HttpSession session = request.getSession();

        req.setCharacterEncoding("utf-8");
        chain.doFilter(req, resp);
    }

    public void destroy() {
    }

    public void init(FilterConfig config) throws ServletException {
    }
}
