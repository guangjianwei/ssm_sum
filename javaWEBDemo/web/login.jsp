<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <title>管理员登录</title>

    <!-- 1. 导入CSS的全局样式 -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- 2. jQuery导入，建议使用1.9以上的版本 -->
    <script src="js/jquery-2.1.0.min.js"></script>
    <!-- 3. 导入bootstrap的js文件 -->
    <script src="js/bootstrap.min.js"></script>
    <script type="text/javascript"></script>
    <script>
            var refreshCode = function () {
               var elementById = document.getElementById("vcode");
                elementById.src="${pageContext.request.contextPath}/checkCodeServlet?time="+new Date().getTime();
            }
           window.onload=function () {
                var elementsByName = document.getElementsByClassName("form-control");
               for(var i = 0;i<elementsByName.length;i++){
                   elementsByName[i].onkeydown = function () {
                      this.onblur=function () {//当元素失去焦点了在进行判断
                          var value = this.value;
                          if(value==null||value==""){
                           this.style="border:2px red solid";

                          }else{
                              this.style="border:1px #cccccc solid";
                          }


                      }
                   }
               }
           }
    </script>
</head>
<body>
<div class="container" style="width: 400px;">
    <h3 style="text-align: center;">管理员登录</h3>
    <form action="${pageContext.request.contextPath}/loginServlet" method="post">
        <div class="form-group">
            <label for="user">用户名：</label>
            <input type="text" name="username" class="form-control" id="user" placeholder="请输入用户名"/>
        </div>

        <div class="form-group">
            <label for="password">密码：</label>
            <input type="password" name="password" class="form-control" id="password" placeholder="请输入密码"/>
        </div>
        <div class="form-group">
            <input type="checkbox" name="checkbox" class="form-control" id="zdlogin"/>
            <label for="zdlogin">自动登录：</label>
        </div>
        <div class="form-inline">
            <label for="vcode">验证码：</label>
            <input type="text" name="verifycode" class="form-control" id="verifycode" placeholder="请输入验证码" style="width: 120px;"/>
            <a href="javascript:refreshCode()"><img src="${pageContext.request.contextPath}/checkCodeServlet" title="看不清点击刷新" id="vcode"/></a>
        </div>
        <hr/>
        <div class="form-group" style="text-align: center;">
            <input class="btn btn btn-primary" type="submit" value="登录" id="denglu">
        </div>
    </form>

    <!-- 出错显示的信息框 -->
    <div class="alert alert-warning alert-dismissible" role="alert">
        <button type="button" class="close" data-dismiss="alert" >
            <span>&times;</span></button>
        <c:if test="${not empty error}">
            <strong><%=request.getAttribute("error")==null?"":request.getAttribute("error")%></strong>
        </c:if>
        <c:if test="${not empty error_checkCode}">
            <strong><%=request.getAttribute("error_checkCode")==null?"":request.getAttribute("error_checkCode")%></strong>
        </c:if>
        <c:if test="${not empty error_checkCodeNull}">
            <strong><%=request.getAttribute("error_checkCodeNull")==null?"":request.getAttribute("error_checkCodeNull")%></strong>
        </c:if>
        <c:if test="${not empty error_checkUserNull}">
            <strong><%=request.getAttribute("error_checkUserNull")==null?"":request.getAttribute("error_checkUserNull")%></strong>
        </c:if>
        <c:if test="${not empty error_userOrpassword}">
            <strong><%=request.getAttribute("error_userOrpassword")==null?"":request.getAttribute("error_userOrpassword")%></strong>
        </c:if>

    </div>
</div>
</body>
</html>
