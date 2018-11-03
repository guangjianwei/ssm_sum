package servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 1.类继承HttpServlet之后，由浏览器访问服务器的Servlet执行过程.
 * servlet只会创建一次,
 * 不需要我们手动实例化request,response对象,
 * servlet,get或者post方法执行完后,不需要我们手动关闭,Tomcat自动管理
 * 但是可以重写init(ServletConfig servletConfig),destory()
 */
@WebServlet("/HttpServletDemo")
public class HttpServletDemo extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(123);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

}
