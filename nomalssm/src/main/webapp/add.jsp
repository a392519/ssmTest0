<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: zhangli
  Date: 2020-05-16
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${user.username}
    <form action="./addOrUpdate" method="post">
       <input type="hidden" name="sid" value="${user.id}">
        <input name="username" placeholder="用户名" value="${user.username}"> <br>
        <input type="password" placeholder="密码" name="password" value="${user.password}"><br>
        <input type="submit">
    </form>
</body>
</html>
