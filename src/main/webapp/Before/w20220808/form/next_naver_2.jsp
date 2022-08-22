<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String name = request.getParameter("userid");
    String pwd = request.getParameter("userpwd");
    String email = request.getParameter("useremail");
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1" width ="300" height="300">
	<tr>
		<td>ID : </td>
		<td><%=name %></td>
	</tr>
	<tr>
		<td>PWD : </td>
		<td><%= pwd %></td>
	</tr>
	<tr>
		<td>Email : </td>
		<td><%= email %></td>
	</tr>
</table>

</body>
</html>