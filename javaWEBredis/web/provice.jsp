<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/8
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="./js/jquery-3.3.1.min.js"></script>
    <script>
        $(function () {
            //发送请求
                var url = "${pageContext.request.contextPath}/proviceServlet";
            $.ajax({
                url:url,
                type:"POST",
                data:"",
                success:function (data) {
                    //[{"id":1,"proName":"广东"},{"id":2,"proName":"深圳"},{"id":3,"proName":"上海"},{"id":4,"proName":"灵璧"},{"id":5,"proName":"南京"}]
                    var option="";
                    for(var i=0;i<data.length;i++){
                    option= "<option name='"+data[i].id+"' value='"+data[i].proName+"'>"+data[i].proName+"</option>";
                    $("#select").append(option);
                    }
                },
                error:function () {
                    alert("请求失败");
                },
                dataType:"json"

            });
        });
    </script>
</head>
<body>
<select name="select" id="select">
    <option value="带选择">---选择省份---</option>
</select>
</body>
</html>
