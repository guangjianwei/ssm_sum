package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
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
 */
//@WebFilter("/jsp/*.jsp")
@WebFilter("/*")
public class FilterDemo implements Filter {
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        chain.doFilter(req, resp);
    }

    public void destroy() {
    }

    public void init(FilterConfig config) throws ServletException {
    }

}
