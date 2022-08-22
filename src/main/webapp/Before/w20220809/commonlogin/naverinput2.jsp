<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
		String[] type = {"아이디", "비밀번호", "이름" , "연도","월","일", "이메일", "전화번호"};
    	String[] arr = request.getParameterValues("arr");
    	String check = request.getParameter("checkpwd");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	if(check.equals(arr[1])){
		out.print("회원가입 성공 <br><hr>");
		for(int i = 0; i < arr.length; i++){
			out.print(type[i] +" : " + arr[i]);
			out.print("<br>");
		}
	}else{
		out.print("비밀번호 확인 오류");
	}
	%>
</body>
</html>