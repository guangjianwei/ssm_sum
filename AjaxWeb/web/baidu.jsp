<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/14
  Time: 20:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="js/jquery-2.1.0.min.js"></script>
    <style>
        body{
            width: 100%;
            margin: 0 auto;
        }
        #div1{
            margin-left: 35%;
            margin-top: 120px;
        }
        #name{
            width: 250px;
        }
        #div2{
            color: #0f0f0f;
        }
        #div3{
        }
        #div4{
            display: none;
            border: 1px solid black;
            text-align:left ;
            width: 250px;
            min-height: 150px;
            max-height: 250px;
            margin-left: 5px;
            margin-top: -3px;
        }
    </style>
    <script>
        $(function () {
            //获取输入框内容
            $("#name").keypress(function () {
                var name = $(this).val();
                $.post("${pageContext.request.contextPath}/baiduAjax",{"name":name},function (data) {
                    //把模糊查询到的data.name的值展示
                    $.each(data,function(){
                        $("#div4").append("<div class='ser_up'>"+data.name+"</div>");
                    });

                });
            });
            $(".ser_up").mouseover(function () {
                $(this).css("backgroundColor","grey");
            });
            $(".ser_up").mouseout(function () {
                $(this).css("backgroundColor","#fff");
            });
        });
    </script>
</head>
<body>
<div id="div1">
    <div id="div2"><h2>百度首页</h2></div>
    <div id="div3">
        <form action="#">
            <table>
                <tr>
                    <td><input type="text" id="name" class="name"></td>
                    <td><input type="submit" value="搜索" id="search" class="search"></td>
                </tr>
            </table>
        </form>
    </div>
    <div id="div4">
        heheda
    </div>
</div>
</body>
</html>
