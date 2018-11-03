<%@ page import="java.util.List" %>
<%@ page import="cn.guangjian.domain.user" %>
<%@ page import="cn.guangjian.domain.Page" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<!-- 网页使用的语言 -->
<html lang="zh-CN">
<head>
    <!-- 指定字符集 -->
    <meta charset="utf-8">
    <!-- 使用Edge最新的浏览器的渲染方式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- viewport视口：网页可以根据设置的宽度自动进行适配，在浏览器的内部虚拟一个容器，容器的宽度与设备的宽度相同。
    width: 默认宽度与设备的宽度相同
    initial-scale: 初始的缩放比，为1:1 -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>用户信息管理系统</title>

    <!-- 1. 导入CSS的全局样式 -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- 2. jQuery导入，建议使用1.9以上的版本 -->
    <script src="js/jquery-2.1.0.min.js"></script>
    <!-- 3. 导入bootstrap的js文件 -->
    <script src="js/bootstrap.min.js"></script>
    <style type="text/css">
        td, th {
            text-align: center;
        }
        .form-group{
            float: left;
        }
        .form-control{
            width: 150px;
            height: 34px;
        }
        .label_sele{
            float: left;
            font-size: 20px;
            font-weight: 500;
        }
        #form2{
            margin-top: 50px;
        }
    </style>
    <script>
        window.onload=function () {
            document.getElementById("searchAll").onclick=function () {
                document.getElementById("form").submit();
                document.getElementById("form1").submit();

            }
            document.getElementById("check_id").onclick=function () {
                    var eleclassName = document.getElementsByName("check");
                    for(var i =0;i<eleclassName.length;i++){
                        eleclassName[i].checked = this.checked;
                    }
            }
            document.getElementById("selectDel").onclick=function(){
                if(confirm("您确定要删除选中条目吗?")){
                    var flag = false;
                    //获取所有name为check的结点对象
                    var esb = document.getElementsByName("check");
                    //遍历
                    for(var i =0;i<esb.length;i++){
                        if(esb[i].checked){
                            flag=true;
                            break;
                        }
                    }
                    if(flag){
                        document.getElementById("form").submit();

                    }
                }

            }
        }

    </script>
</head>
<body>
<div class="container">
    <h2 style="text-align: center;color: #2aabd2">用户信息表</h2>
    <form action="${pageContext.request.contextPath}/listAllServlet" method="post" id="form1">
        <div class="form-group">
            <label for="name" class="label_sele">姓名：</label>
            <input type="text" class="form-control" id="name" name="name1" >
        </div>
        <div class="form-group">
            <label for="age" class="label_sele">年龄：</label>
            <input type="text" class="form-control" id="age" name="age1">
        </div>
        <div class="form-group">
            <label for="address" class="label_sele">地址：</label>
            <input type="text" class="form-control" id="address" name="address1">
        </div>
        <div class="form-group" style="text-align: center">
            <input class="btn btn-primary" type="submit" value="查询" id="searchAll"/>
        </div>
    </form>
    <%--<h3 style="text-align: center">用户信息列表</h3>--%>
    <table border="1" class="table table-bordered table-hover">
        <tr class="success">
            <th><input type="checkbox" name="check" id="check_id"></th>
            <th>编号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>年龄</th>
            <th>籍贯</th>
            <th>手机号</th>
            <th>注册时间</th>
            <th>操作</th>
        </tr>
        <%
            Page pageClass = (Page) request.getAttribute("pageClass");
            //获取总记录数
            int totalCount = pageClass.getTotalCount();
            int totalPage = pageClass.getTotalPage();
            List<user> list = pageClass.getList();
        %>
        <form id="form" action="${pageContext.request.contextPath}/delectSelectServlet" method="post">
        <c:forEach items="${pageClass.getList()}" var="li" varStatus="i">
            <tr>
                <td><input type="checkbox" name="check" value="${li.getId()}"></td>
                <td>${i.count}</td>
                <td>${li.getUsername()}</td>
                <td>${li.getGender()}</td>
                <td>${li.getAge()}</td>
                <td>${li.getAddress()}</td>
                <td>${li.getPhoneNumber()}</td>
                <td>${li.getDate()}</td>
                <td><a class="btn btn-default btn-sm" href="${pageContext.request.contextPath}/showUpdateServlet?id=${li.getId()}">修改</a>&nbsp;<a class="btn btn-default btn-sm" href="${pageContext.request.contextPath}/deleteServlet?id=${li.getId()}">删除</a></td>
            </tr>

        </c:forEach>

        </form>
        <tr>
            <td colspan="9" align="center">
                <a class="btn btn-primary" href="javascript:void(0);" id="selectDel">删除选中</a>
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/add.jsp">添加联系人</a>
            </td>
        </tr>
    </table>
    <nav>
        <ul class="pagination">
            <li>
                <a href="#" aria-label="Previous">
                    <span aria-hidden="true">&laquo;</span>
                </a>
            </li>
            <li><a href="${pageContext.request.contextPath}/listAllServlet?currentPage=1" class="btnCurrent">1</a></li>
            <li><a href="${pageContext.request.contextPath}/listAllServlet?currentPage=2">2</a></li>
            <li><a href="${pageContext.request.contextPath}/listAllServlet?currentPage=3">3</a></li>
            <li><a href="${pageContext.request.contextPath}/listAllServlet?currentPage=4">4</a></li>
            <li><a href="${pageContext.request.contextPath}/listAllServlet?currentPage=5">5</a></li>
            <li><a href="${pageContext.request.contextPath}/listAllServlet?currentPage=6">6</a></li>
            <li>
                <a href="#" aria-label="Next">
                    <span aria-hidden="true">&raquo;</span>
                </a>
            </li>
            <span style="color: darkslategrey;font-size: 25px;font-weight: 400;">共<span style="color: #2aabd2"><%=totalCount%></span>条记录,共<span style="color: red"><%=totalPage%></span>页</span>
        </ul>
    </nav>
</div>
</body>
</html>

