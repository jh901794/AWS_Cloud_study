<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	
	String name = request.getParameter("userid");
	String pwd = request.getParameter("userpwd");
	
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
다음 페이지.
<%= name %>
<%= pwd %>

</body>
</html>