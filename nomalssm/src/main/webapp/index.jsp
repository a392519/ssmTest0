<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<a href="add.jsp">新增</a>
<form action="./findAll" method="post">
    <input placeholder="请输入用户名" name="username">
    <input type="submit">
</form>
<table>
    <tr>
        <th>用户名</th>
        <th>密码</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${list}" var="row">
        <tr>
            <td>${row.username}</td>
            <td>${row.password}</td>
            <td><a href="./findById?id=${row.id}">修改</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
