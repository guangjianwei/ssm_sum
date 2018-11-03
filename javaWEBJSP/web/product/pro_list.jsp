<%@ page import="com.product.pruduct" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>Bootstrap</title>

<!-- Bootstrap -->
<link href="../css/bootstrap.min.css" rel="stylesheet">

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="../js/jquery-3.2.1.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="../js/bootstrap.min.js"></script>
<style>
    img {
        width: 150px;
    }
</style>
<body>
<div class="container">
    <div class="row">
        <%
            List<pruduct> list = (List<pruduct>)request.getAttribute("list");
            for (pruduct pruduct : list) {
                out.print("<div class=\"col-md-2\">");
                out.print("<img src='/img/"+pruduct.getPimage()+"'>");
                out.print("<p>描述:"+pruduct.getPdesc()+"</p>");
                out.print("<p>价格:"+pruduct.getShop_price()+"</p>");
                out.print("</div>");
                }

        %>

    </div>
</div>
</body>
</html>
