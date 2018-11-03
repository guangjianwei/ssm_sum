package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BaseServlet extends HttpServlet {
    //重写其中的service方法，以便于我们对servlet的抽取

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //这里完成方法的分发
        //获取路径
        String uri = req.getRequestURI();
        System.out.println("路径uri："+uri);
        //获取方法名称
        String methodName = uri.substring(uri.lastIndexOf('/') + 1);
        System.out.println("方法名："+methodName);
        try {
            //获取方法对象Method（下面的this是谁调用我，我就代表谁）
            //忽略权限
            Method method = this.getClass().getDeclaredMethod(methodName,HttpServletRequest.class, HttpServletResponse.class);
            //暴力反射
            method.setAccessible(true);
            method.invoke(this,req,resp);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
