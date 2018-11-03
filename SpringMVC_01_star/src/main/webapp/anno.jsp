<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/16
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>anno一些常用注解的使用</title>
</head>
<body>
<a href="anno/requestParam?uname=zhangsan">注解RequestParam(解决参数不一致的情况)</a>
<br>
<form action="anno/requestBody" method="post">
    <table>
        <thead>注解RequestBody(获取本次请求的所有请求体的内容)</thead>
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
<br>
<a href="anno/pathVariable/100">注解PathVariable(用于绑定url中的占位符)</a>
<br>
<a href="/anno/testSessionAttribute">注解SessionAttributes设置</a>
<a href="/anno/getSessionAttribute">注解SessionAttributes取值</a>
</body>
</html>
