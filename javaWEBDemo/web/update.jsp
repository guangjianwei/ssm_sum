<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="cn.guangjian.domain.user" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<!-- 网页使用的语言 -->
<html lang="zh-CN">
<head>
    <!-- 指定字符集 -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>修改用户</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="js/jquery-2.1.0.min.js"></script>
    <script src="js/bootstrap.min.js"></script>

</head>
<body>
<div class="container" style="width: 400px;">
    <h3 style="text-align: center;">修改联系人</h3>
    <%--在这里进行id的list的request中内容获取--%>
    <%
        List<user> list =(List<user>)request.getAttribute("list");
    %>
        <c:forEach items="${list}" var="li">
    <form action="${pageContext.request.contextPath}/updateAddServlet?id=${li.getId()}" method="post">
        <%--对list进行遍历--%>
        <div class="form-group">
            <label for="disabledTextInput">姓名：</label>
            <input type="text" class="form-control" id="disabledTextInput" name="name" value="${li.getUsername()}"  readonly="readonly" placeholder="请输入姓名">
        </div>
        <div class="form-group">
            <label for="disabledPassword">密码：</label>
            <input type="password" class="form-control" id="disabledPassword" name="password" value="${li.getPassword()}"  readonly="readonly" placeholder="请输入密码">
        </div>
        <div class="form-group">
            <label>性别：</label>
            <c:if test="${li.getGender()=='男'}">
            <input type="radio" name="sex" value="男" checked="checked"/>男
            <input type="radio" name="sex" value="女"/>女
            </c:if>
            <c:if test="${li.getGender()=='女'}">
                <input type="radio" name="sex" value="男" />男
                <input type="radio" name="sex" value="女" checked="checked"/>女
            </c:if>
        </div>

        <div class="form-group">
            <label for="age">年龄：</label>
            <input type="text" class="form-control" id="age" name="age" value="${li.getAge()}" placeholder="请输入年龄">
        </div>

        <div class="form-group">
            <label for="address">籍贯：</label>
            <select name="address" class="form-control" id="address">
                <option value="广东" <c:if test="${li.getAddress()=='广东'}">selected</c:if>>广东</option>

                <option value="广西" <c:if test="${li.getAddress()=='广西'}">selected</c:if>>广西</option>
                <option value="湖南" <c:if test="${li.getAddress()=='湖南'}">selected</c:if>>湖南</option>
                <option value="其他" <c:if test="${li.getAddress()=='呵呵'}">selected</c:if>>其他</option>
            </select>
        </div>

        <div class="form-group">
            <label for="phone">手机号：</label>
            <input type="text" class="form-control" name="phone" value="${li.getPhoneNumber()}" placeholder="请输入手机号码" id="phone"/>
        </div>

        <div class="form-group">
            <label for="date">注册时间：</label>
            <input type="date" class="form-control" name="datetime" value="${li.getDate()}" placeholder="请输入注册时间" id="date"/>
        </div>
        </c:forEach>
        <div class="form-group" style="text-align: center">
            <input class="btn btn-primary" type="submit" value="提交" />
            <input class="btn btn-default" type="reset" value="重置" />
            <input class="btn btn-default" type="button" value="返回" id="back"/>
        </div>
    </form>
</div>
<script>
    document.getElementById("back").onclick = function () {
        window.history.back();
    }
</script>
</body>
</html>
