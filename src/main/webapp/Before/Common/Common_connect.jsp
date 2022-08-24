<%@ page import="java.util.Collection" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %>
<%--
  Created by IntelliJ IDEA.
  User: jh901
  Date: 2022-08-22
  Time: 오전 10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%!
    Connection mysql_conn;
    String m_url = "jdbc:mysql://localhost:3306/gwang_1";
    String m_userid = "root";
    String m_passwd = "1234";

    public Connection getMysql_Conn(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("드라이버 로딩");
            mysql_conn = DriverManager.getConnection(m_url, m_userid, m_passwd);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return mysql_conn;
    }
%>
<%!
    Connection oracle_conn;
    String o_url = "jdbc:oracle:thin:@localhost:1521:xe";
    String o_userid = "gwang_1";
    String o_passwd = "gwang_1";
    public Connection getOracle_Conn(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("드라이버 로딩");
            oracle_conn = DriverManager.getConnection(o_url, o_userid, o_passwd);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return oracle_conn;
    }
%>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
