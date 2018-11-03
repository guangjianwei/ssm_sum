<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/4
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        function btn1() {
            //写一个json格式的字符串,进行获取其中 值
            var person = {"firstname": "张", "lastname": "三丰", "age": 50};
            document.getElementById("btn1").value = person.lastname;

        }
        function btn2() {
            //写一个json格式的字符串,进行获取其中 值
            var person = {
           "baobao":[
                           {"firstname": "张", "lastname": "三丰", "age": 50},
                           {"firstname": "李", "lastname": "四", "age": 60},
                           {"firstname": "王", "lastname": "五", "age": 70},
                     ]
                          };
            document.getElementById("btn2").value = person.baobao[1].firstname;

        }
    </script>
</head>
<body>
<p>
    <span>格式为:{"firstname": "张", "lastname": "三丰", "age": 50}</span>
    <input type="text" value="" id="btn1">
    <input type="button" onclick="btn1()" value="json1">
</p>
<p>
    <span>格式为:"{
           "baobao":[
                           {"firstname": "张", "lastname": "三丰", "age": 50},
                           {"firstname": "李", "lastname": "四", "age": 60},
                           {"firstname": "王", "lastname": "五", "age": 70},
                     ]
                          }"</span>
    <input type="text" value="" id="btn2">
    <input type="button" onclick="btn2()" value="json2">
</p>
</body>
</html>
