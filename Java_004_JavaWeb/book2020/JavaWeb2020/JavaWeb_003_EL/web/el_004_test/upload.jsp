<%--
  Created by IntelliJ IDEA.
  User: a7249
  Date: 2023/12/26
  Time: 18:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="http://192.168.1.3:8080/uploadServlet" method="post" enctype="multipart/form-data">
      用户名：<input type="text" name="username" /> <br>
      头像：<input type="file" name="photo" > <br>
      <input type="submit" value="上传">
    </form>
</body>
</html>
