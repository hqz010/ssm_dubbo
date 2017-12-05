<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017-12-04
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%
        String path = request.getContextPath();
        String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
    %>
    <title>Title</title>
</head>
<body>
　<form action="<%=basePath%>/query.do?" method="post">
    调用次数：<input type="text" name="id" value="3" />
    <button type="submit" value="通过传递参数" />
  </form>
</body>
</html>
