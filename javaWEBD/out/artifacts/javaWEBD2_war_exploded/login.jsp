<%@ page import="java.net.URLDecoder" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>

    <style>
        p{
            color: red;
        }
.td_in{
    text-align: right;
}
    </style>
    <script>
        window.onload = function(){
            //对验证码的图片进行事件的绑定
            document.getElementById("td_img").onclick=function () {
                var date = new Date();
                var time = date.getTime();
                var newImg = "/imgeServlet?time="+time;
                this.setAttribute("src",newImg);
            }
        }
    </script>
</head>
<body>
<form action="/checkServlet" method="get">
    <table border="1px">
        <tr>
            <td class="td_in">姓名:</td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>
            <td class="td_in">年龄:</td>
            <td><input type="text" name="password"></td>
        </tr>
        <tr>
            <td class="td_in">验证码:</td>
            <td><input type="text" name="checkCode"></td>
        </tr>
        <tr>
            <td colspan='2'><img id='td_img' src='/imgeServlet'></td>;
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="提交"></td>
        </tr>
    </table>
<p><%=request.getAttribute("error")==null?"":request.getAttribute("error")%></p>
<p><%
    Cookie[] cookies = request.getCookies();
    for (Cookie cookie1 : cookies) {
        String name = cookie1.getName();
        if("error_cookie".equals(name)){
           String value =  cookie1.getValue();
            String decode = URLDecoder.decode(value, "utf-8");
//            out.print(decode);
            //当展示完错误后,重新给cookie赋值
            cookie1.setValue("");
            break;
        }
    }
%>
</p>
</form>




</body>
</html>
