<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String _id = request.getParameter("_id");
	String _pwd = request.getParameter("_pwd");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	if(_id.equals("jaehoon") && _pwd.equals("1234")){
		out.print("로그인성공");
	}else{
		response.sendRedirect("common.html");
	}
%>
</body>
</html>