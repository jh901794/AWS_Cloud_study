<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="coupang_2.jsp" method="get">
<table width = "400" height = "400" style="border-collapse : collapse;">
	<tr align = "center">
		<td colspan ="3"> <img src="/../../images/coupang.png" alt="" /></td>
	</tr>
	<tr align = "center" >
		<td>ID : </td>
		<td colspan= "2"><input type="text" name="user_id" id="" style="width:99%; height:90%" /></td>
	</tr>
	<tr align = "center" >
		<td>PWD : </td>
		<td colspan= "2" ><input type="text" name="user_pwd" id="" style="width:99%; height:90%"/></td>
	</tr>
	<tr>
		<td ><input type="radio" name="auto" id="" value="true">자동로그인</input></td>
		<td style="width:15%">          </td>
		<td align = "right" ><a href="https://login.coupang.com/login/accountInfoFind.pang">아이디(이메일)/비밀번호 찾기 ></a></td>
	</tr>
	<tr align = "center" width="100%">
		<td colspan ="3" ><button type ="submit" style="width:100%; height:100%">로그인</button></td>
	</tr>
	<tr>
	<td colspan = "3"><hr></td>
	</tr>
	
	<tr>
		<td colspan ="3"><button type ="submit" style="width:100%; height:100%">회원가입</button></td>
	</tr>
</table>
</form>
</body>
</html>