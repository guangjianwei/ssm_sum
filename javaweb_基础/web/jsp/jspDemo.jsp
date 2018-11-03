0<%@ page0 contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/6
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>JSP知识点</title>
</head>
<body>

<%--
1.jsp概念
jsp其实就是一个servlet
jsp和html的区别主要在于，jsp可以嵌套java代码
当启动服务器时，jsp就被编译成servlet文件,不是servlet文件而是class文件,因为jsp本质上是servlet,java代码会被编译为class文件

2.jsp注释问题
    两种注释方式
    1.网页上可以看得到代码      <!-- --> 只能注释html代码片段
    2.网页上看不到任何代码      <%-- --% >可以注释所有代码,推荐使用

3.所有的域对象
page
request
application servletContext
session
    存储对象的方法:
        getAttribute()      从域中获取对象
        setAttribute()      设置对象到域中
        removeAttribute()	删除域中的对象

4.jsp获取域中的数据
可以从request域\session域\servletContext域中获取数据
注意,域并不是request,而是requestScope,而且不会使用get方法,而是直接.属性名
${ request.getSession().getAttribute("user").getUsername() }    错
${sessionScope.getAttribute("user").username }  				错
${sessionScope.user.username}									对

5.jstl遍历集合数据
1.使用jstl需要导入其jar包
2.使用jstl需要在页面中使用taglib指令引入标签库
3.可以在页面中通过${list[0]}, ${list[1]}取出两个数据

6.jsp九大内置对象
JSP的内置对象指的是可以直接在JSP页面中直接使用的对象。
pageContext,
request,
session,
application,
response,
page,
out,
config,
exception
其中的pageContext,request,application,session可以通过setAttribute方法存储数据
response没有域不能存储数据

7.jsp的指令
taglib   	导入lib库
page 	 	标题
include		jsp的include指令元素读入指定页面的内容。并把这些内容和本来的页面融合到一起。（这个过程是在翻译阶段:也就是jsp被转化成servlet的阶段进行的。)
import		不是jsp的指令    <%@ page import="java.util.List" %>

8.el表达式和jstl
    EL可以从request,session,applicaton,pageContext中获取数据
    EL的语法结构是：${ expression }
    JSTL的全称是jsp标准标签库
    JSTL常用核心core标签库,但是并不只有core一个标签库

9.jstl常用标签
<c:if> 的test属性是用来存放表达式的，且支持el表达式
<c:forEach> 通常用来遍历list集合或者map集合，也可以用来作为普通的for循环
无论是if还是forEach 中的var属性都表示临时变量的含义
forEach中var代表虚幻获取到的对象
if中的var代表test中的boolean值

10.jsp中域对象存值    向下看代码
--%>

<%
    request.setAttribute("number",12);
%>

<c:if test="${requestScope.number % 2 == 1}" var="i">
    ${i}<br>
    ${requestScope.number}是奇数
</c:if>

<c:if test="${requestScope.number % 2 != 1}" var="i">
    ${i}<br>
    ${requestScope.number}是偶数
</c:if>

<c:forEach begin="1" end="10" var="i" step="2" varStatus="str">
    ${i}<br>  ${str.index}<br>  ${str.count}<hr>
</c:forEach>

<%
    List<String> strings = new ArrayList<>();
    strings.add("123");
    strings.add("234");
    strings.add("345");
    strings.add("456");
    request.setAttribute("list",strings);
%>

<%--<c:forEach items="requestScope.list" var="s" varStatus="stu">--%>
<c:forEach items="${requestScope.list}" var="s" varStatus="stu" step="2">
    ${s}<br> ${stu.index}<br> ${stu.count}<hr>
</c:forEach>


<%
    request.setAttribute("str","中国");
    request.getSession().setAttribute("str","欧洲");
    request.getServletContext().setAttribute("str","美国");

    request.removeAttribute("str");
%>


${sessionScope.str} 获得结果是欧洲
${applicationScope.str} 获得结果是美国
${servletContext.str}没有结果



${str}  获得结果为中国
<%--
${域名称.键名}：从指定域中获取指定键的值
	* 域名称：
		1. pageScope		--> pageContext
		2. requestScope 	--> request
		3. sessionScope 	--> session
		4. applicationScope --> application（ServletContext）
${键名}：表示依次从最小的域中查找是否有该键对应的值，直到找到为止。
--%>
</body>
</html>
