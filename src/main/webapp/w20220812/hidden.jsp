<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="Common.util.CommonUtil" %>
    <%
    // 모든 요청은 request. name, session, cookie를 가진다.
    String userid = CommonUtil.IsNull(request, "userid");
    String passwd =  CommonUtil.IsNull(request, "password");
    String hidden = CommonUtil.IsNull(request,"hidden");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script>
function Login(){
	var frm = document.frm;
	frm.action ="hidden.jsp";
	frm.submit();
}
</script>
<form name= "frm">
<table>
	<tr>
		<td>userid : </td>
		<td><input type="text" name="userid" /></td>
	</tr>
	<tr>
		<td>password : </td>
		<td><input type="text" name="password" /></td>
	</tr>
	<tr>
		<td>hidden : </td>
		<td><input type="hidden" name="hidden" value ="gwang1"/></td>
	</tr>
	<tr>
		<td colspan = "2"><input type="button" name="" value="login" onclick="Login()" /></td>
	</tr>
</table>
</form>
<br>
<table>
	<tr>
		<td>userid</td>
		<td><%=userid %></td>
	</tr>
	<tr>
		<td>password</td>
		<td><%=passwd %></td>
	</tr>
	<tr>
		<td>hidden</td>
		<td><%=hidden %></td>
	</tr>
</table>
</body>
</html>