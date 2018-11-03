package demo;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

@WebServlet("/ServletDemo5")
public class ServletDemo5 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          //ServletContext对象代表整个web应用，可以和程序的容器进行通信
        //两种获取此对象的方式
        ServletContext servletContext = request.getServletContext();
        ServletContext servletContext1 = this.getServletContext();
        System.out.println(servletContext);
        System.out.println(servletContext1);
        //获取文件类型数据
        String file = "1.jpg";
        String mimeType = servletContext.getMimeType(file);
        System.out.println(mimeType);
        //域对象：共享数据
        //			1. setAttribute(String name,Object value)
        //			2. getAttribute(String name)
        //			3. removeAttribute(String name)
        servletContext.setAttribute("msg","无敌神童");
        //获取文件的真实路径 String getRealPath(String path)
        //1.获取a.txt文件的真实路径
        String realPath = servletContext.getRealPath("/WEB-INF/classes/demo/a.txt");
        System.out.println("a.txt真实路径："+realPath);
        //2.获取b.txt文件的真实路径
        String realPath1 = servletContext.getRealPath("/b.txt");
        System.out.println("b.txt真实路径："+realPath1);
        //3.获取.txt文件的真实路径
        String realPath2 = servletContext.getRealPath("/WEB-INF/c.txt");
        System.out.println("c.txt真实路径："+realPath2);
    }
}
