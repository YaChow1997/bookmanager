<%--
  Created by IntelliJ IDEA.
  User: Yangchow
  Date: 2021-03-08
  Time: 9:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style type="text/css">
    form{
        width: 300px;
        height: 300px;
        margin: 0 auto;
        border: 1px black solid;
    }
    input{
        display: inline-block;
        float: right;
        margin-right: 20px;
    }
    h2{
        text-align: center;
    }
</style>
<body>
<form action="/user/checkLogin" method="post">
    <h2>欢迎登陆</h2>
    <p>登陆账号：<input type="text" name="user_code"/></p>
    <p>登录密码：<input type="password" name="password"/></p>
    <input type="submit" value="登录/Login"/>
    <input id="myregister" type="button" value="注册">
</form>
</body>
<script type="text/javascript" src="/js/jquery-1.12.4.min.js"></script>
<script type="text/javascript">
    $(function(){
        $("#myregister").click(function () {
            window.location = "/user/toRegister";
        })
    })
</script>
</html>
