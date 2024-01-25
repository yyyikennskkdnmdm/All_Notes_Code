<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: a7249
  Date: 2023/12/26
  Time: 12:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <%--TODO 1.代码脚本----if 语句--%>
        <%!
          Map map = new HashMap();
        %>
        <%=12 %><br>
        <%=12.12%><br>
        <%="我是字符串"%><br>
        <%=map%><br>
        <%=request.getParameter("username")%>


        <%--if语句--%>
        <%
          int i = 10;
          if(i == 10){

        %>
        <h1>i == 10<h1>
        <%
          }else{
        %>
          <h1>i != 10<h1>
        <%
          }
        %>


    <%--2.代码脚本----for 循环语句--%>
    <table border="1" cellspacing="0">
        <%
            for (int j = 0; j < 10; j++) {
        %>
        <tr>
            <td>第 <%=j + 1%>行</td>
        </tr>
        <%
            }
        %>
    </table>
    <%--3.翻译后java文件中_jspService方法内的代码都可以写--%>
        <%
        String username = request.getParameter("username");
        System.out.println("用户名的请求参数值是：" + username);
    %>

</body>
</html>
