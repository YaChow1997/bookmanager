<%--
  Created by IntelliJ IDEA.
  User: Yangchow
  Date: 2021-03-08
  Time: 9:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style type="text/css">
    span{
        color: red;
    }
    form{
        width: 300px;
        height: 400px;
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
<form action="/user/register" method="post">
    <h2>注册</h2>
    <p>登录账号：<input type="text" name="user_code"/><span>*</span></p>
    <p>密码：<input type="password" name="password"/><span>*</span></p>
    <p>确认密码：<input type="password" /><span>*</span></p>
    <p>性别：<select name="gender">
        <option value="">--请选择--</option>
        <option value="男">男</option>
        <option value="女">女</option>
    </select><span>*</span></p>
    <p>邮箱：<input type="email" name="email"></p>
    <input type="submit" value="确认注册" />
    <input id="reBtn" type="button" value="返回登录">
</form>
</body>
<script type="text/javascript" src="/js/jquery-1.12.4.min.js"></script>
<script type="text/javascript">
    $(function(){
        $("#reBtn").click(function () {
            window.location = "/user/toLogin";
        })
    })
</script>
</html>
