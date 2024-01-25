<%--
  Created by IntelliJ IDEA.
  User: a7249
  Date: 2023/12/26
  Time: 17:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--比较jsp和el的区别--%>
    <%
      request.setAttribute("key","el");
    %>

    表达式脚本输出key的值是：<%=request.getAttribute("key")==null?"":request.getAttribute("key")%><br>
    EL表达式输出的key的值是：${key}
</body>
</html>
