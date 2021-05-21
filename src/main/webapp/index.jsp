<%--
  Created by IntelliJ IDEA.
  User: YEN
  Date: 5/21/2021
  Time: 11:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <form action="/alert" method="get">
      <h1>Nhấn nút bên dưới để gọi lời chào</h1>
      <button>Send</button>
    </form>

    <form action ='/login' method="post">
      <input type="text" name="usename" placeholder="usename" size="30px"/>name </br>
      <input type="text" name="pass" placeholder="pass" size="30px"/> pass
      </br>
      <button type="submit">login</button>
    </form>
  </body>
</html>
