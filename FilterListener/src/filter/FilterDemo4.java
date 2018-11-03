package filter;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(value="/index.jsp",dispatcherTypes = DispatcherType.FORWARD)//这里是浏览器直接访问的时候才会执行
public class FilterDemo4 implements Filter {
    /**
     * 只是在服务器启动的时候执行一次
     * @param filterConfig
     * @throws ServletException
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init...");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        HttpServlet httpServlet = (HttpServlet)new Servlet();

        System.out.println("demo4过滤前...");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("demo4过滤后...");
    }

    /**
     * 服务器正常关闭的时候执行
     */
    @Override
    public void destroy() {
        System.out.println("destory...");
    }
}
