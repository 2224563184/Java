<%--
  Created by IntelliJ IDEA.
  User: it
  Date: 2022/5/12
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<h1>登录</h1>

<form action="<%=request.getContextPath()%>/user/login" method="post">
    账号:<input type="text" name="user"><br/>
    密码:<input type="text" name="pass"><br/>
        <input type="submit"><br/>
        <input type="checkbox" name="verify" value="1">7天免登录
</form>

</body>
</html>
