<%--
  Created by IntelliJ IDEA.
  User: a7249
  Date: 2023/12/26
  Time: 17:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    ${ 12 == 12 } 或 ${ 12 eq 12 } <br>
    ${ 12 != 12 } 或 ${ 12 ne 12 } <br>
    ${ 12 < 12 } 或 ${ 12 lt 12 } <br>
    ${ 12 > 12 } 或 ${ 12 gt 12 } <br>
    ${ 12 <= 12 } 或 ${ 12 le 12 } <br>
    ${ 12 >= 12 } 或 ${ 12 ge 12 } <br>
    <hr>
    ${ 12 == 12 && 12 > 11 } 或 ${ 12 == 12 and 12 > 11 } <br>
    ${ 12 == 12 || 12 > 11 } 或 ${ 12 == 12 or 12 > 11 } <br>
    ${ ! true } 或 ${ not true } <br>
    <hr>
    ${ 12 + 12 } <br>
    ${ 12 - 12 } <br>
    ${ 12 * 12 } <br>
    ${ 18 / 12 } 或 ${ 18 div 12 }<br>
    ${ 18 % 12 } 或 ${ 18 mod 12 } <br>
</body>
</html>
