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
<form action="account/args4" method="post">
    <table>
        <tr>
            <td>用户id：</td>
            <td><input type="text" name="id"/></td>
        </tr>
        <tr>
            <td>用户名：</td>
            <td><input type="text" name="username"/> </td>
        </tr>
        <tr>
            <td>存款：</td>
            <td><input type="text" name="balance"/> </td>
        </tr>
        <tr>
            <td>姓名：</td>
            <td><input type="text" name="list[0].uname"/></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="text" name="list[0].psw"/> </td>
        </tr>
        <tr>
            <td>姓名：</td>
            <td><input type="text" name="map['one'].uname"/></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="text" name="map['one'].psw"/> </td>
        </tr>
        <tr><input type="submit" value="提交"> </tr>
    </table>
</form>
</body>
</html>
