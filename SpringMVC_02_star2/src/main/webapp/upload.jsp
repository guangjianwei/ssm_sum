<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/18
  Time: 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>文件上传</h3>
<p>原始方式</p>
<form action="upload/fileupload" method="post" enctype="multipart/form-data">
    选择文件：<input type="file" name="upload"/><br/>
    <input type="submit" value="上传文件"/>
</form>
<p>springMVC传统方式上传文件</p>
<%--这里面name的属性值必须和后台的MultipartFile upload 参数一致--%>
<form action="upload/springFileupload" method="post" enctype="multipart/form-data">
    选择文件：<input type="file" name="upload"/><br/>
    <input type="submit" value="上传文件"/>
</form>
<p>springMVC跨服务器方式上传文件</p>
<%--这里面name的属性值必须和后台的MultipartFile upload 参数一致--%>
<form action="upload/springFileupload1" method="post" enctype="multipart/form-data">
    选择文件：<input type="file" name="upload"/><br/>
    <input type="submit" value="上传文件"/>
</form>
</body>
</html>
