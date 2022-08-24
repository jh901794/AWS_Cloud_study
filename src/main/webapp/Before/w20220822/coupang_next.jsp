<%@ page import="java.util.Enumeration" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: jh901
  Date: 2022-08-22
  Time: 오후 12:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="C_Common/C_Common.jsp"%>

<%
    request.setCharacterEncoding("utf-8");
    HashMap hashMap = new HashMap();
    ArrayList ar = new ArrayList();
    Enumeration<String> profile = request.getParameterNames();

    while (profile.hasMoreElements()){
        ar.add(profile.nextElement());

    }
    for(int i = 0; i <ar.size(); i++){
        hashMap.put(ar.get(i),request.getParameter(ar.get(i).toString()));
        out.print(hashMap.get(ar.get(i)));
    }

%>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
