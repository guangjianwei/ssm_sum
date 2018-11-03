<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/22
  Time: 18:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-3.2.1.min.js"></script>
    <script>
        // $(function () {
        //     $.ajax({
        //         type: "POST",
        //         url: "user/findAll",
        //         data: {},
        //         success: function(data){
        //             alert( "Data Saved: " + msg );
        //         }
        //     });
        //
        //
        // });
    </script>
</head>
<body>
<a href="/user/findAll">查询所有数据,跳转到success页面...</a>
<form action="/user/insert" method="post">
    姓名:<input type="text" name="userName"/>
    <br>
    密码:<input type="text" name="userPsw"/>
    <br>
    性别:男<input type="radio" name="userSex" value="1"/>  女<input type="radio" name="userSex" value="0"/>
    <br>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
