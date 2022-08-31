<%--
  Created by IntelliJ IDEA.
  User: it
  Date: 2022/5/10
  Time: 9:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html>
<head>
    <title>登录系统</title>
</head>
<body>
<form action="<%request.getContextPath();%>/user" method="post"></form>
账号:<input type="text" name="=user"></br>
密码:<input type="text" name="=pass"></br>
    <input type="submit"></br>
</body>
</html>
