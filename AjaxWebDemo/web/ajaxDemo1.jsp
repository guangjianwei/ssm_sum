<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <!-- 指定字符集 -->
    <meta charset="utf-8">
    <!-- 使用Edge最新的浏览器的渲染方式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- viewport视口：网页可以根据设置的宽度自动进行适配，在浏览器的内部虚拟一个容器，容器的宽度与设备的宽度相同。
    width: 默认宽度与设备的宽度相同
    initial-scale: 初始的缩放比，为1:1 -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>添加用户</title>

    <!-- 1. 导入CSS的全局样式 -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- 2. jQuery导入，建议使用1.9以上的版本 -->
    <script src="js/jquery-2.1.0.min.js"></script>
    <!-- 3. 导入bootstrap的js文件 -->
    <script src="js/bootstrap.min.js"></script>
    <script>
      $(function () {
          //post请求
          $("#btn2").onclick(function () {
              var url="${pageContext.request.contextPath}/AjaxPostServlet";
              //下面参数是以json格式
              var params ={
                  "username":"zhangsan",
                  "password":"1234"
              };
              $.post(url,params,function (data) {
                  alert(data.username);
              });
          });
      });
    </script>
</head>
<body>
<div>
    <button value="ajaxGet方法" id="btn1"/>
    <span id="span1"></span>
</div>
<div>
    <button value="ajaxPost方法" id="btn2"/>
    <span id="span2"></span>
</div>
<div>
    <button value="ajaxPost方法" id="btn3"/>
    <span id="span3"></span>
</div>
<div>
    <button value="弹窗" id="btn4"/>
</div>

</body>
</html>
