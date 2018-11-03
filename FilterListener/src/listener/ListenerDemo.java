package listener;


import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ListenerDemo implements ServletContextListener{
    //服务器创建的时候执行
    //通常用来加载配置文件,一般不不会去写,在框架的时候会用到
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext servletContext = servletContextEvent.getServletContext();
        String location = servletContext.getInitParameter("location");
        String realPath = servletContext.getRealPath(location);
        try {
            FileInputStream fis =new FileInputStream(realPath);
            System.out.println("ServletContextListener方法执行了");
            System.out.println(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
//服务器正常关闭的时候执行
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
