<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/18
  Time: 8:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.min.js"></script>
    <script>
        $(function () {
            $("#btn1").click(function () {
                $.ajax({
                    type: "POST",
                    contentType:"application/json;charset=UTF-8",
                    url: "user/testJsonStatic",
                    data: '{"msg":"武林高手1号"}',
                    success: function(data){
                        alert(data);
                    },
                    dataType:"json"
                });
            });
            $("#btn2").click(function () {
                $.ajax({
                    type: "POST",
                    contentType:"application/json;charset=UTF-8",
                    url: "user/testJsonStatic1",
                    data: '{"uname":"jeck","psw":123}',
                    success: function(data){
                        alert(data.uname);
                    },
                    dataType:"json"
                });
            });
        });
    </script>
</head>
<body>
<h3>欢迎来到主页面</h3>
<a href="/user/string">跳转到success页面</a>
<br>
<a href="/user/desparcher">请求转发，跳转到success页面</a>
<br>
<a href="/user/redirect">重定向，跳转到success页面</a>
<br>
<a href="/user/testModelAndView">使用ModelAndView，跳转到success页面</a>
<br>
<a href="/user/testForwardOrRedirect">使用关键字的方式，跳转到success页面</a>
<br>
<button id="btn1">
    ResponseBody响应json数据(静态资源)
</button>
<br>
<button id="btn2">
    使用@ResponseBody注解把JavaBean对象转换成json字符串，直接响应
</button>
</body>
</html>
