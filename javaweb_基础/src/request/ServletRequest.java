package request;


import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Map;

/**
 * 1.request获取请求参数
 * request.getParameter（”name”）         获取对应name的参数
 * getParameterValues("hobby")            常用于获得一组数据,如复选框, 返回值是String[]
 * request.getParameterMap()              获取全部参数,保存到map集合中,注意返回值的类型Map<String, String[]>
 *    如果请求数据中没有对应的参数,那么得到的数据为null,不会出现报错.

 * 2.request转发代码
 * request.getRequestDispatcher("HttpServletDemo").forward(request,response);
 *
 * referer: 浏览器通知服务器,当前请求来自何处

 * 3.获取form表单中的数据,post的请求传输数据,防止中文乱码.
 * 需要先设置请求头的编码表
 * request.setCharacterEncoding("utf-8")
 * 然后再获取对应的数据
 * 如果先获取数据,再去设置编码表,这样是无效的,因为请求的流只有一条,被消费后,就不存在了
 *
 */
@WebServlet("/ServletRequest")
public class ServletRequest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        String name = request.getParameter("name");
        Map<String, String[]> parameterMap = request.getParameterMap();
        System.out.println(name);


        ServletInputStream inputStream = request.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);

        //转发
//        request.getRequestDispatcher("HttpServletDemo").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
