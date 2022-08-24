
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*,Before.j20220819.MysqlDao2" %>
<%
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<%
    Connection conn =null;

    try{
        String jdbcUrl= "jdbc:mysql://localhost:3306/gwang_1";
        String dbId = "gwang_1";
        String dbPass = "gwang_1";

        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(jdbcUrl, dbId, dbPass);
        out.println("연결");
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    out.println("connection succeed mysql"+"<br>");
%>
<%
    Connection conn2 =null;

    try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        System.out.println("driver load success");

        String jdbcUrl2 = "jdbc:oracle:thin:@localhost:1521:xe";
        String dbId2 = "gwang_1";
        String dbPass2 = "gwang_1";

        conn2 = DriverManager.getConnection(jdbcUrl2, dbId2, dbPass2);
        out.println("연결");
    }
    catch(Exception e)
    {
        e.printStackTrace();
        return;
    }
    //MysqlDao2.MysqlInputLogin();
    out.println("connection succeed oracle"+"<br>");
%>
<%
    if( conn != null ){
        out.println("<h1>mysql</h1>");
        Statement stat = conn.createStatement();
        String sql = "select NAME, MEMBERID, EMAIL from MEMBER";
        ResultSet rs = stat.executeQuery( sql );

        while ( rs.next() ){
            for ( int i = 1 ; i <= 3; ++i ){
                out.println(rs.getString(i) +", ");
            }
            out.println("<br>");
        }
    }

%>

<%
    if( conn2 != null ){
        out.println("<h1>oracle</h1>");

        Statement stat = conn2.createStatement();
        String sql = "select NAME, MEMBERID, EMAIL from MEMBER";
        ResultSet rs = stat.executeQuery( sql );

        while ( rs.next() ){

            for ( int i = 1 ; i <= 3; ++i ){
                out.println(rs.getString(i) +", ");
            }
            out.println("<br>");
        }
    }

%>
</body>
</html>