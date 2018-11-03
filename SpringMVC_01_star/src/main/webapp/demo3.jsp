<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/16
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>自定义类型转换</h4>
<form action="account/args5" method="post">
    <table>

            <td>姓名：</td>
            <td><input type="text" name="uname"/></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="text" name="psw"/> </td>
        </tr>
        <tr>
            <td>生日：</td>
            <td><input type="text" name="date"/></td>
        </tr>
        <tr><input type="submit" value="提交"> </tr>
    </table>
</form>
</body>
</html>
