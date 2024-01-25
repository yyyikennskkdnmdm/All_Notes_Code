<%--
  Created by IntelliJ IDEA.
  User: a7249
  Date: 2023/12/26
  Time: 13:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>write</title>
</head>
<body>
<%--
response和out有不同的缓冲区
当jsp页面中所有代码执行完成后会做以下两个操作
1.执行out.flush()操作，会把out缓冲区中数据追加到response缓冲区末尾
2.会执行response.flushBuffer()操作，会把response缓冲区中的数据发送到客户端

--%>
    <%
      out.write("out.write<br>");
      out.print("可以输出所有形式的代码");
    %>

    <%
      response.getWriter().write("response.getWriter().write<br>");
    %>
</body>
</html>
