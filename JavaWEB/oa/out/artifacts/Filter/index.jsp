<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<form action="<%=request.getContextPath()%>/a.do" method="post">
    账号:<input type="text" name="user">
    密码:<input type="text" name="pass">
    <input type="submit" value="登录">
</form>
</body>
</html>