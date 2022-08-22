<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
	get을 왜 쓰냐 
	jsp > php, aspx 등 다른곳으로 값을 넘겨줄때 post는 사용할 수 없다.
	get방식으로 key,value 형식으로 값을 전달하면 다른 was에서도 사용할 수 있다.
 -->
	<form action="next_jsp_login.jsp" method="get">
		<table border="1" witdh="500" height="500">
			<tr>
				<td>userid</td>
				<td><input type="text" name="userid" id="" /></td>
			</tr>
			<tr>
				<td>userpwd</td>
				<td><input type="password" name="userpwd" id="" /></td>
			</tr>
						<tr>
				<td colspan = "2"><input type="submit" value="login" /></td>
			</tr>
		</table>
	</form>
</body>
</html>