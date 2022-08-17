<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="Common.util.CommonUtil, Common.util.userBean"%>
<%
String userid = CommonUtil.IsNull(request, 1, "userid").toString();
String passwd = CommonUtil.IsNull(request, 1, "passwd").toString();
String email = CommonUtil.IsNull(request, 1, "email").toString();
int age = Integer.parseInt(CommonUtil.IsNull(request, 2,"age").toString());
userBean ub = new userBean(userid,passwd,email,age);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>아이디</td>
			<td><%=ub.getUserid().toString()%></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><%=ub.getPasswd().toString()%></td>
		</tr>
		<tr>
			<td>이메일</td>
			<td><%=ub.getEmail().toString()%></td>
		</tr>
		<td>이메일</td>
		<td><%=ub.getAge() %></td>
		</tr>
	</table>
</body>
</html>