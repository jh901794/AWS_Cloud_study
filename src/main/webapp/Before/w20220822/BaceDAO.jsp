<%@ page import="java.sql.Connection" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="Before.j20220823.BaseCommand" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="Before.j20220822.CoupangBean" %>
<%@ page import="java.sql.SQLException" %><%--
  Created by IntelliJ IDEA.
  User: jh901
  Date: 2022-08-22
  Time: 오후 2:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%!
  static Connection conn;
  public static ArrayList _Coupang_list(){
  StringBuffer query = new StringBuffer();
  query.append("SELECT * FROM coupang_login");

  conn = BaseCommand.getMySqlConnection();

  Statement stat = null;
  ArrayList arr = new ArrayList();
  try {
    stat = conn.createStatement();
    ResultSet rs = stat.executeQuery(query.toString());
    while (rs.next()){
      CoupangBean bean = new CoupangBean(rs.getString("id"),rs.getString("pwd")
              ,rs.getString("name"),rs.getString("email"));
      arr.add(bean);
    }
  } catch (SQLException e) {
    throw new RuntimeException(e);
  }

  return arr;
}
%>
