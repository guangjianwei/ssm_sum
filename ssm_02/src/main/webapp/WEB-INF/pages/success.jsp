<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/22
  Time: 18:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>成功页面</h3>
<c:forEach items="${list}" var="user">
    <h4>${user.userName}</h4>
    <h4>${user.userPsw}</h4>
    <h4>${user.userSex}</h4>
</c:forEach>
</body>
</html>
