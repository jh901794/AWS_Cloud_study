<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Enumeration" %>
<%@ page import="Before.Question.Gwang_Bean" %>
<%@ include file="Gwang_1Dao.jsp" %>
<%--
  Created by IntelliJ IDEA.
  User: jh901
  Date: 2022-08-22
  Time: 오후 4:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setCharacterEncoding("utf-8");
    HashMap hashMap = new HashMap();
    ArrayList ar = new ArrayList();
    Enumeration<String> profile = request.getParameterNames();
    while (profile.hasMoreElements()) {
        ar.add(profile.nextElement());
    }
    for (int i = 0; i < ar.size(); i++) {
        hashMap.put(ar.get(i), request.getParameter(ar.get(i).toString()));
    }
    if (hashMap.size() > 2) {
        Gwang_Bean gb = new Gwang_Bean(hashMap.get(ar.get(0)).toString(), hashMap.get(ar.get(1)).toString(),
                hashMap.get(ar.get(2)).toString(), hashMap.get(ar.get(3)).toString(), hashMap.get(ar.get(4)).toString(),
                hashMap.get(ar.get(5)).toString());

        insert_Mysql_Gwang(gb);
    }
    ArrayList arr = Gwang_1_Mysql();
    if (request.getParameter("search") != null) {
        for (int i = 0; i < arr.size(); i++) {
            Gwang_Bean g_b = (Gwang_Bean) arr.get(i);
            if (hashMap.get(ar.get(0)).equals(g_b.getG_name())) {
                out.print(g_b.getG_name() + " " + g_b.getG_pwd() + " " + g_b.getG_age() + " " + g_b.getG_Address() + " " +
                        g_b.getG_num1() + " " + g_b.getG_num2());
                out.print("<br>");
            }
        }
    } else {
        for (int i = 0; i < arr.size(); i++) {
            Gwang_Bean gwang_b = (Gwang_Bean) arr.get(i);
            out.print(gwang_b.getG_name() + " " + gwang_b.getG_pwd() + " " + gwang_b.getG_age() + " " + gwang_b.getG_Address() + " " +
                    gwang_b.getG_num1() + " " + gwang_b.getG_num2());
            out.print("<br>");
        }
    }
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="gwang_1next.jsp" method="post">
    <table>
        <tr>
            <td><input type="text" name="search" id="search"></td>
        </tr>
        <tr>
            <td><input type="submit" value="검색"></td>
        </tr>
    </table>
</form>

</body>
</html>
