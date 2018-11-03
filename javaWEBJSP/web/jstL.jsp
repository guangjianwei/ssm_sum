<%@ page import="com.product.Student" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/28
  Time: 20:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--c:out 就相当于out.print("")--%>
<c:out value="传智播客"></c:out>
<%
 request.setAttribute("temp","333");
%>
<hr>
<%--
      判断session中的loginUser是否为空：
      1.如果不为空，获取session中的信息，并将用户名显示在页面上；
      2.如果为空，则提示用户登录；
  --%>
<c:if test="${not empty temp}">
    <h3>欢迎您！${temp}</h3>
</c:if>
<c:if test="${empty temp}">
    <h3>对不起，请先<a href="#">登录</a></h3>
</c:if>
<hr>
<%--
     需求一：遍历普通数组
 --%>
<%
    String[] strArr = new String[5];
    strArr[0] = "hello";
    strArr[1] = "world";
    strArr[2] = "传智";
    strArr[3] = "播客";
    strArr[4] = "黑马";
    request.setAttribute("strArr",strArr);
%>
<c:forEach items="${strArr}" var="str" step="2">${str}</c:forEach>
<hr>
<%--
    需求二：遍历Student的list集合
--%>

<%
    List<Student> stuList = new ArrayList<>();
    Student stu1 = new Student(1, "张三1", "123");
    Student stu2 = new Student(2, "张三2", "123");
    Student stu3 = new Student(3, "张三3", "123");
    stuList.add(stu1);
    stuList.add(stu2);
    stuList.add(stu3);
    request.setAttribute("stus",stuList);
%>
<c:forEach items="${stus}" var="stu">${stu.age}</c:forEach>
<
<hr>
<%--遍历Map集合--%>
<%
    Map<String, String> map = new HashMap<>();
    map.put("张三", "123");
    map.put("李四", "123");
    map.put("王五", "123");
    request.setAttribute("maps",map);
%>
<c:forEach items="${maps}" var="stuMap">
    ${stuMap.key}=${stuMap.value}
</c:forEach>
</body>
</html>
