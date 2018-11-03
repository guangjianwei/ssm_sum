package response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 1.重定向
 * response.sendRedirect("路径")
 *
 * 2.响应头的作用
 * location和响应码302一起完成重定向操作
 * content-disposition通知浏览器获得数据的方式
 * refresh: 定时刷新
 *
 * 3.设置响应头
 * response.setHeader("content-type","text/html;charset=utf-8")能设置响应编码
 * response.setHeader("content-disposition", "attachment;filename="+filename) 以附件的形式下载文件
 * response.setHeader("location","页面地址"); 可以跳转到指定的页面  不光需要设置location属性,还需要加上状态码
 * response.setHeader不能设置响应行状态码的数据
 *
 *
 */
@WebServlet("/ServletResponse")
public class ServletResponse extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置响应的状态码
        response.setStatus(302);
        response.setHeader("location","http://www.baidu.com");
        HttpSession session = request.getSession();
        session.invalidate();

        response.sendRedirect("http://www.baidu.com");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
