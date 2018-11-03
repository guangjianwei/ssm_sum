package demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

@WebServlet("/ServletDemo2")
public class ServletDemo2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        String header = request.getHeader("User-Agent");
        //查询当前浏览器的信息（从请求行中获得）
        response.getWriter().write("当前浏览器的信息："+header);
        response.getWriter().write("<br>");
        String referer = request.getHeader("Referer");
        response.getWriter().write("告诉浏览器你从哪里来："+referer);
        //获取请求方式
        String method = request.getMethod();
        response.getWriter().write("<br>");
        response.getWriter().write("获取请求方式："+method);
        //获取虚拟目录
        String contextPath = request.getContextPath();
        response.getWriter().write("<br>");
        response.getWriter().write("虚拟目录："+contextPath);
        //获取get方式请求参数(这里参),post方式这里是获取不到参数的
        String queryString = request.getQueryString();
        response.getWriter().write("<br>");
        response.getWriter().write("获取get方式请求参数："+queryString);
        // (*)获取请求URI       统一资源标识符
        String requestURI = request.getRequestURI();
        response.getWriter().write("<br>");
        response.getWriter().write("获取统一资源标识符："+requestURI);
        // URL:统一资源定位符 ：
        StringBuffer requestURL = request.getRequestURL();
        response.getWriter().write("<br>");
        response.getWriter().write("获取统一资源定位符："+requestURL);
         //获取协议及版本：HTTP/1.1
        String protocol = request.getProtocol();
        response.getWriter().write("<br>");
        response.getWriter().write("获取协议及版本："+protocol);
        //获取客户机的IP地址
        String remoteAddr = request.getRemoteAddr();
        response.getWriter().write("<br>");
        response.getWriter().write("获取客户机的IP地址："+remoteAddr);
        response.getWriter().write("<br>");
        response.getWriter().write("===============================");
        /*
        获取请求参数通用方式：不论get还是post请求方式都可以使用下列方法来获取请求参数
				1. String getParameter(String name):根据参数名称获取参数值    username=zs&password=123
				2. String[] getParameterValues(String name):根据参数名称获取参数值的数组  hobby=xx&hobby=game
				3. Enumeration<String> getParameterNames():获取所有请求的参数名称
				4. Map<String,String[]> getParameterMap():获取所有参数的map集合
         */
        response.getWriter().write("<br>");
        String name = request.getParameter("username");
        response.getWriter().write("name参数值："+name);
        response.getWriter().write("<br>");
        // getParameterValues 一般应用于复选框
        String[] sexes = request.getParameterValues("sex");
        for (String sex : sexes) {
            response.getWriter().write(sex+",");
        }
        response.getWriter().write("<br>");
        //获取所有请求参数的名称
        Enumeration<String> parameterNames = request.getParameterNames();
        response.getWriter().write("所有参数名称：");
        while(parameterNames.hasMoreElements()){
            String s = parameterNames.nextElement();
            response.getWriter().write(s);
            }
        response.getWriter().write("<br>");
         //获取所参数的map集合
        Map<String, String[]> parameterMap = request.getParameterMap();
        response.getWriter().write("获取所参数的map集合");
        response.getWriter().write("<br>");
        Set<String> keySet = parameterMap.keySet();
        for (String s : keySet) {
            String[] strings = parameterMap.get(s);
            for (String string : strings) {
                response.getWriter().write(s+":"+string);
                response.getWriter().write("<br>");
                }
        }

    }
}
