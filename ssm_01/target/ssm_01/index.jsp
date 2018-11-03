<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/19
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>欢迎来到主页面</h3>
<a href="account/findAll.action">查找所有</a>
<br>
<form action="account/save.action">
    账户：<input type="text" name="name">
    金额：<input type="text" name="money">
    <input type="submit" value="提交">
</form>
</body>
</html>
