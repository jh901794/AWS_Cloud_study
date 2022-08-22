<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%
ArrayList arr = new ArrayList();
for (int i = 0; i < 10; i++) {
	arr.add(i + 1);
}
for (int i = 0; i < arr.size(); i++) {
	out.print(arr.get(i + 1));
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>