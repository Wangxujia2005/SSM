<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2025/11/5
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<body>
<h1>登录成功页面</h1>
<hr>
${user}
<a href="${pageContext.request.contextPath}/user/logout">登出</a>
</body>
</html>
