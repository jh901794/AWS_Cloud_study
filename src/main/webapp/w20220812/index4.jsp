<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String userid = null;
if (request.getParameter("userid") != null) {
	userid = request.getParameter("userid");
}
String passwd = null;
if (request.getParameter("passwd") != null) {
	passwd = request.getParameter("passwd");
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="index4.jsp" method="post">
		<table>
			<tr>
				<td>
					<input type="text" name="userid" id="userid" />
				</td>
			</tr>
			<tr>
				<td>
					<input type="text" name="passwd" id="passwd" />
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" onclick="Login()" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>