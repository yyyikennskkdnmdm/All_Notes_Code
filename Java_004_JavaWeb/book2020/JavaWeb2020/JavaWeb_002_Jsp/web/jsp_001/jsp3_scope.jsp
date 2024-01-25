<%--
  Created by IntelliJ IDEA.
  User: a7249
  Date: 2023/12/26
  Time: 12:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>四大域对象</title>
</head>
<body>
<%--

pageContext:当前jsp页面范围内有效
request:一次请求内有效
session:一个回话范围内有效（打开浏览器访问服务器，直到关闭浏览器）
application:整个web工程范围内有效（只要web工程不停止，数据都在)

--%>
    <%
      // 往四个域中分别保存了数据
      pageContext.setAttribute("key","pageContext");
      request.setAttribute("key","request");
      session.setAttribute("key","session");
      application.setAttribute("key","application");
    %>


    pageContext = <%=pageContext.getAttribute("key")%><br>
    request = <%=request.getAttribute("key")%><br>
    session = <%=session.getAttribute("key")%><br>
    application = <%=application.getAttribute("key")%><br>

<%--    转发    --%>
  <%
    request.getRequestDispatcher("./jsp4_scope_forward.jsp").forward(request,response);
  %>


</body>
</html>
