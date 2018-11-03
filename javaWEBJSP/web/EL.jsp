<%@ page import="java.util.ArrayList" %>
<%@ page import="com.product.Student" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/28
  Time: 19:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--分别往request域,session域,servletContext域,和pageContext中存值--%>
<%
   request.setAttribute("request","very Good!");
   request.getSession().setAttribute("session","very Good...");
   request.getServletContext().setAttribute("servletContext","very Good.....");
   pageContext.setAttribute("pageName","page域中的值");
%>
<p>request域:${requestScope.request}</p>
<p>session域:${sessionScope.session}</p>
<p>servletContext域:${applicationScope.servletContext}</p>
<p>pageContext域:${pageScope.pageName}</p>
<hr>
<%
 request.setAttribute("n1","20");
 request.setAttribute("n2","40");
%>
<p>加法:${n1+n2}</p>
<p>减法:${n1-n2}</p>
<p>乘法:${n1*n2}</p>
<p>除法:${n1/n2}</p>
<p>取余:${n1%n2}</p>
<hr>
==:${n1 == n2}或 ${n1 eq n2}<br>
!=:${n1 != n2}或 ${n1 ne n2}<br>
>:${n1 > n2}或 ${n1 gt n2}<br>
>=:${n1 >= n2}或 ${n1 ge n2}<br>
"<":${n1 < n2}或 ${n1 lt n2}<br>
<=:${n1 <= n2}或 ${n1 le n2}<br>
<hr>
<p>三元运算符n1>10:${n1>10?"正确":"错误"}</p>
<hr>
<%
String str = "";
ArrayList<String> list = new ArrayList<>();
Student stu =null;
%>
空字符串:${not empty str}<br>
list size=0:${empty list}<br>
空对象 null:${empty stu}<br>
</body>
</html>
