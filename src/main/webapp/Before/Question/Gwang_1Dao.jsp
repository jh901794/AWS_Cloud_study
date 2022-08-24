<%@ page import="java.util.ArrayList" %>
<%@ page import="Before.j20220823.BaseCommand" %>
<%@ page import="Before.Question.Gwang_Bean" %>
<%@ page import="java.sql.*" %><%--
  Created by IntelliJ IDEA.
  User: jh901
  Date: 2022-08-22
  Time: 오후 4:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%!
    static Connection conn;
    static ArrayList arr;

%>
<%!
    public static ArrayList Gwang_1_Mysql(){
    StringBuffer query = new StringBuffer();
    query.append("SELECT * FROM q_gwang_1");
    conn = BaseCommand.getMySqlConnection();
    Statement stat = null;
    arr = new ArrayList();
    try {
        stat = conn.createStatement();
        ResultSet rs = stat.executeQuery(query.toString());
        while (rs.next()){
            Gwang_Bean bean = new Gwang_Bean(rs.getString("G_name"),rs.getString("G_pwd")
                    ,rs.getString("G_age"),rs.getString("G_address"),rs.getString("G_num1"),rs.getString("G_num2"));
            arr.add(bean);

        }
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }

    return arr;
}

    public void insert_Mysql_Gwang(Gwang_Bean gb) {
        PreparedStatement pstmt;
        try {
            conn = BaseCommand.getMySqlConnection();
            String query = "Insert into q_gwang_1 (G_name, G_pwd, G_age, G_Address, G_num1, G_num2) values(?,?,?,?,?,?)";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, gb.getG_name());
            pstmt.setString(2, gb.getG_pwd());
            pstmt.setString(3, gb.getG_age());
            pstmt.setString(4, gb.getG_Address());
            pstmt.setString(5, gb.getG_num1());
            pstmt.setString(6, gb.getG_num2());
            int res = pstmt.executeUpdate();
            conn.commit();
            if (res > 0) {
                System.out.println("입력 성공");
            } else {
                System.out.println("입력 실패");
            }
        }catch (SQLException e) {
            // TODO Auto-generated catch block
            throw new RuntimeException(e);
        }
    }
%>
