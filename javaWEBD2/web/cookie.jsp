<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.net.URLEncoder" %>
<%@ page import="java.net.URLDecoder" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>把下方输入的内容存入cookie中</p>
<form action="/cookieDemo1">
    <input type="text" name="username">
    <input type="text" name="password">
    <input type="submit" value="提交">
</form>
<%
    response.setContentType("text/html;charset=utf-8");
    request.setCharacterEncoding("utf-8");
    //获取名为cookie中名字为lastTime的值
    Boolean flag = false;
    Cookie[] cookies = request.getCookies();
    if(cookies!=null&&cookies.length>0){
        for (Cookie cookie : cookies) {
            String name = cookie.getName();
            if ("lastTime".equals(name)) {
                //这次访问的时间重新赋值
                flag=true;
                Date newdate = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String str_newdate = sdf.format(newdate);
                String  str_newdate1 = URLEncoder.encode(str_newdate, "utf-8");
                cookie.setValue(str_newdate1);
                //获取值
                String value = cookie.getValue();
                //对获取的value进行解码
                String decode = URLDecoder.decode(value, "utf-8");
                out.print("您上次访问的时间是:" + decode);
                out.print("<br>");
                break;
            }
        }
    }
    if(cookies==null||cookies.length==0||flag==false){
       out.print("欢迎首次访问!");
        Date date = new Date();
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str_date = sdf.format(date);
        //重新创建一个名字为lastTime的cookie
        //为防止其中的空格字符影响cookie的存储,所以要对存储的数据进行编码
        String str_date1 = URLEncoder.encode(str_date, "utf-8");
        Cookie lastTime = new Cookie("lastTime", str_date1);
        //发布
        response.addCookie(lastTime);
    }
%>
</body>
</html>
