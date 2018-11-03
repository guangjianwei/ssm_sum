package servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * 1.servlet的概述
 *      servlet是一个接口,定义了规范
 *      GenercServlet是一个类,简化了servlet的开发
 *      HttpServlet将请求分发给不同的方法,如 get   post
 *
 * 2.servlet生命周期的方法
 * init(ServletConfig servletConfig)		创建时执行,只会执行一次  注意,init方法是有参数的
 * service(ServletRequest servletRequest, ServletResponse servletResponse)	每次访问时都执行
 * destory()	销毁时执行,只会执行一次    注意,没有参数
 */
public class ServletLifeCycle implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    @Override
    public void destroy() {

    }
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public String getServletInfo() {
        return null;
    }

}
