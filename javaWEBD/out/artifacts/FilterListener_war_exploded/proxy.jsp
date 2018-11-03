<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/2
  Time: 19:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/ProxyServlet">
    <table>
        <caption>这里进行敏感词的过滤</caption>
        <tr>
            <td>姓名:</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>爱好:</td>
            <td><input type="text" name="like"></td>
        </tr>
        <tr><td colspan="2"><input type="submit" value="提交"></td></tr>
    </table>
</form>
</body>
</html>
