<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: it
  Date: 2022/5/13
  Time: 17:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
        list.add(i);
    }
     request.setAttribute("list",list);
%>

<c:forEach items="${list}" var="s">

</c:forEach>