<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = request.getParameter("user_id");
		String pwd = request.getParameter("user_pwd");
		String auto = request.getParameter("auto");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
			
			<%out.println("ID : " + id);	%><br>
		<%out.println("PWD : " + pwd);	%><br>
		<%out.println("Auto : " + auto);	%><br>

</body>
</html>