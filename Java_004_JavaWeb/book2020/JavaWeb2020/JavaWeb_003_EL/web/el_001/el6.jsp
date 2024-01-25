<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: a7249
  Date: 2023/12/26
  Time: 17:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--TODO    .运算和[]运算--%>
    <%
      Map<String,Object> map = new HashMap<String, Object>();
      map.put("a.a.a", "aaaValue");
      map.put("b+b+b", "bbbValue");
      map.put("c-c-c", "cccValue");

      request.setAttribute("map", map);
    %>

    ${ map['a.a.a'] } <br>
    ${ map["b+b+b"] } <br>
    ${ map['c-c-c'] } <br>
</body>
</html>
