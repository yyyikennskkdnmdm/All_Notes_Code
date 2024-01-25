<%--
  Created by IntelliJ IDEA.
  User: a7249
  Date: 2023/12/26
  Time: 17:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
      request.setAttribute("key","request");
      session.setAttribute("key","session");
      application.setAttribute("key","application");
      pageContext.setAttribute("key","pageContext");
    %>

    四大域：${key}
</body>
</html>
