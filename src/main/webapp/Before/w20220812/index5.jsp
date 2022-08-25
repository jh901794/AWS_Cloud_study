<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="My_Common.util.CommonUtil" %>
    <%
    	request.setCharacterEncoding("utf-8");
		String name = CommonUtil.IsNull(request, "name");
    	String age = CommonUtil.IsNull(request, "age");
    	String address = CommonUtil.IsNull(request, "address");
    	String email = CommonUtil.IsNull(request, "email");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="index5.jsp" method="post">
	<table>
		<tr>
			<td><input type="text" name="name" id="name" placeholder=" 이름" /></td>
		</tr>
		<tr>
			<td><input type="text" name="age" id="age"placeholder=" 나이" /></td>
		</tr>
		<tr>
			<td><input type="text" name="address" id="address" placeholder=" 주소"/></td>
		</tr>
		<tr>
			<td><input type="text" name="email" id="email" placeholder=" 이메일"/></td>
		</tr>
				<tr>
			<td><input type="submit" style="width:100%;"/></td>
		</tr>
	</table>
</form>
<div id="result">
	name : <%=name %><br>
	age : <%= age %><br>
	address : <%=address %><br>
	email : <%= email %><br>
</div>
</body>
</html>