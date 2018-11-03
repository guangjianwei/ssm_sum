package login;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/checkServlet")
public class checkServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        //首先接收传递进来的参数
        response.setContentType("text/html;charset=utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String checkCode = request.getParameter("checkCode");
        String contextPath = request.getContextPath();
           Map<String,String> map = new HashMap<>();
           map.put("username",username);
           map.put("password",password);
        //先对验证码进行判断
        HttpSession session = request.getSession();
        Object session_value = session.getAttribute("checkCode_session");
        if(session_value.toString().equalsIgnoreCase(checkCode)){
            //验证码验证成功,开始验证姓名和密码
            //创建JdbcTemplate对象
            System.out.println(map);
            boolean flag = new userCheck().getMap(map);
            if(flag){
                //这里重定向代替转发
                response.sendRedirect(contextPath+"/successServlet");
            }else{
                    //这里使用cookie的进行错误信息的存储
                String error_cookie = "对不起,你输入的账号或密码错误";
                //对cookie信息进行编码
                error_cookie= URLEncoder.encode(error_cookie, "utf-8");
                Cookie cookie = new Cookie("error_cookie",error_cookie);
                response.addCookie(cookie);
                //重定向到
                response.sendRedirect(contextPath+"/login.jsp");
            }
        }else{
            //获取虚拟路径
            //把错误信息响应到浏览器中
            String error = "验证码输入错误";
            request.setAttribute("error",error);

            //进行请求转发
            request.getRequestDispatcher(contextPath+"/login.jsp").forward(request,response);

        }
        //
    }
}
