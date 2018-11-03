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
    <title>添加用户</title>

    <!-- 1. 导入CSS的全局样式 -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- 2. jQuery导入，建议使用1.9以上的版本 -->
    <script src="js/jquery-2.1.0.min.js"></script>
    <!-- 3. 导入bootstrap的js文件 -->
    <script src="js/bootstrap.min.js"></script>
    <script>
        //为username单独绑定以个事件

        window.onload=function () {
            var elementsByName = document.getElementsByClassName("form-control");
            for(var i = 0;i<elementsByName.length;i++){
                elementsByName[i].onkeydown = function () {
                    var value = this.value;
                    //在这里进行正则表达式的校验
                    this.onblur=function () {
                        if(value==null||value==""){
                            this.style="border:2px red solid";

                        }else{
                            this.style="border:1px #cccccc solid";
                        }


                    }
                }
            }
            document.getElementById("sub").onclick=function () {
                var elementsByName = document.getElementsByClassName("form-control");
                for(var i = 0;i<elementsByName.length;i++){
                    var value = elementsByName[i].value;
                    if(value==null||value==""){
                        elementsByName[i].style="border:2px red solid";

                    }else{
                        if(i==1){
                            var pattern = /^\d{3,6}$/;   //3-6位数字
                          var flag =  pattern.test(value);
                          if(!flag){
                              alert("您输入的密码不合法!请重新输入");
                        elementsByName[i].style="border:1px #cccccc solid";
                              break;
                          }
                        }
                        if(i==2){
                            var pattern = /^\d{1,2}$/;   //0-100
                            var flag =  pattern.test(value);
                            if(!flag){
                                alert("您输入的年龄不合法!请重新输入");
                        elementsByName[i].style="border:1px #cccccc solid";
                                break;
                            }
                        }
                        if(i==4){
                            var pattern = /^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\d{8}$/;   //3-6位数字
                            var flag =  pattern.test(value);
                            if(!flag){
                                alert("您输入的手机号码不合法!请重新输入");
                        elementsByName[i].style="border:1px #cccccc solid";
                                break;
                            }
                        }
                        if(i==(elementsByName.length-1)){
                            elementsByName[i].style="border:1px #cccccc solid";
                        document.getElementById("form").submit();
                        }
                    }
                }

            }

        }
    </script>
</head>
<body>
<div class="container" style="width: 400px;">
    <center><h3>添加联系人页面</h3></center>
    <form action="${pageContext.request.contextPath}/addAllServlet" method="post" id="form">
        <div class="form-group">
            <label for="name">姓名：</label>
            <input type="text" class="form-control" id="name" name="name" placeholder="请输入姓名">
        </div>
        <div class="form-group">
            <label for="password">密码：</label>
            <input type="password" class="form-control" id="password" name="password" placeholder="请输入密码" data-toggle="popover"
            data-trigger="focus"
            data-content="请输入3-6位纯数字!">
            <script>
                $(function () {
                    $('[data-toggle="popover"]').popover();
                });
            </script>
        </div>
        <div class="form-group">
            <label>性别：</label>
            <input type="radio" name="sex" value="男" checked="checked"/>男
            <input type="radio" name="sex" value="女"/>女
        </div>

        <div class="form-group">
            <label for="age">年龄：</label>
            <input type="text" class="form-control" id="age" name="age" placeholder="请输入年龄" data-toggle="popover"
                   data-trigger="focus"
                   data-content="请输入0-100纯数字!">
        </div>

        <div class="form-group">
            <label for="address">籍贯：</label>
            <select name="address" class="form-control" id="address">
                <option value="广东">广东</option>
                <option value="广西">广西</option>
                <option value="湖南">湖南</option>
                <option value="其他">其他</option>
            </select>
        </div>

        <div class="form-group">
            <label for="phone">手机号：</label>
            <input type="text" class="form-control" name="phone" placeholder="请输入手机号码" id="phone" data-toggle="popover"
                   data-trigger="focus"
                   data-content="请输入以13开头的11位合法的手机号!"/>
        </div>

        <div class="form-group">
            <label for="date">注册时间：</label>
            <input type="date" class="form-control" name="datetime" placeholder="请输入注册时间" id="date"/>
        </div>

        <div class="form-group" style="text-align: center">
            <input class="btn btn-primary" type="button" value="提交" id="sub"/>
            <input class="btn btn-default" type="reset" value="重置" />
            <input class="btn btn-default" type="button" value="返回" id="back"/>
        </div>
    </form>
</div>
<script>
    document.getElementById("back").onclick = function () {
        window.history.back();
    }
</script>
</body>
</html>
