<%--
  Created by IntelliJ IDEA.
  User: jh901
  Date: 2022-08-22
  Time: 오전 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../Common/Common_connect.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //getMysql_Conn();
    Statement s = getMysql_Conn().createStatement();
    s.executeQuery();
%>
</body>
</html>
