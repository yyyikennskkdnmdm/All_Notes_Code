<%--
  Created by IntelliJ IDEA.
  User: a7249
  Date: 2023/12/26
  Time: 13:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>forward</title>
</head>
<body>
    pageContext = <%=pageContext.getAttribute("key")%><br>
    request = <%=request.getAttribute("key")%><br>
    session = <%=session.getAttribute("key")%><br>
    application = <%=application.getAttribute("key")%><br>
</body>
</html>
