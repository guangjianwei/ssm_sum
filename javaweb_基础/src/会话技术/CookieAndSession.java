package 会话技术;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * 会话技术：一次会话中包含多次请求和响应。
 *        一次会话：浏览器第一次给服务器资源发送请求，会话建立，直到有一方断开为止
 * 功能：在一次会话的范围内的多次请求间，共享数据
 *        方式：
 *        客户端会话技术：Cookie      客户端会话技术，将数据保存到客户端, 不会存储敏感数据,存在客户端,不安全
 *        服务器端会话技术：Session    在一次会话的多次请求间共享数据，将数据保存在服务器端的对象中      数据保存在服务器,数据安全
 *
 * cookie:
 *        给Cookie设置有效时间的api是 cookie.setMaxAge() 单位是秒
 *        获得cookie的名称和值的api是cookie.getName()和cookie.getValue()
 *        响应cookie时,调用的api是 response.addCookie( cookie );                 是response添加cookie,传递给浏览器,并不是request
 *        创建cookie并且赋值的api是  Cookie cookie = new Cookie("name","value")  cookie赋值需要在构造方法中,并没有setName()方法
 *
 * cookie的api使用:
 *      cookie.setMaxAge(60*60) 设置cookie的最大存活时间
 *      cookie.setPath("/") 设置路径cookie的访问范围.
 *      setMaxAge   和  setPath 可以做到覆盖cookie的目的	 可在同一应用服务器内共享方法：设置cookie.setPath("/"),再设置持久化,就会把同Tomcat中的别的servlet中的相同name的cookie给覆盖掉
 *
 * session和cookie的区别
 *      cookie将数据保存到客户端浏览器，session将数据保存到服务器
 *      session的实现依赖于cookie
 *      cookie的大小和数量有一定的限制
 *
 * Session对象生命周期
 *      tomcat服务器默认session的超时时间为30分钟自动销毁
 *      服务器正常关闭 session不会销毁,Tomcat会自动钝化session
 *      服务器非正常关闭,session会销毁,非正常关闭,session没有时间钝化,但是tomcat都不存在了,session肯定被销毁
 *      服务器启动session不会立刻创建,在使用session时才会创建.
 *      浏览器关闭session不会销毁,因为session跟浏览器没有关系
 *      手动调用invalidate() session会销毁
 */
@WebServlet("/CookieAndSession")
public class CookieAndSession extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.invalidate();
        Cookie cookie1 = new Cookie("name", "zhangsan");
        response.addCookie(cookie1);
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            System.out.println(cookie.getName() + " : " + cookie.getValue());
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
