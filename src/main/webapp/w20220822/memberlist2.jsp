<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: jh901
  Date: 2022-08-22
  Time: 오전 11:16
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
    String sql = "select * from MEMBERLIST";
    Connection conn = getOracle_Conn();
    Statement stat = conn.createStatement();
    ResultSet rs = stat.executeQuery(sql);

    while ( rs.next() ) {
        for (int i = 1; i <= 5; ++i) {

            out.println(rs.getString(i) + ", ");
        }
        out.print("<br>");
    }
%>

</body>
</html>
