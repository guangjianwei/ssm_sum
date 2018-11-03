<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/24
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <style>
        td{
            width: 50px;
        }
    </style>
</head>
<body>
<h3>成功页面</h3>
<table border="1px">
<c:forEach items="${list}" var="user">
   <tr><td>${user.name}</td><td>${user.password}</td><td>${user.sex}</td></tr>
    <%--<h4>${user.password}</h4>--%>
    <%--<h4>${user.sex}</h4>--%>
</c:forEach>
</table>
</body>
</html>
