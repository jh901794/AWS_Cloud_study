<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList, java.util.Hashtable"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	ArrayList arr = new ArrayList();
	int sum = 0;
	Hashtable hash = new Hashtable();
	int sum2 = 0;
	for (int i = 0; i <= 10; i++) {
		arr.add(i);
		hash.put(i, i);
	}
	for (int i = 0; i < arr.size(); i++) {
		sum += (int) arr.get(i);
		sum2 += (int) hash.get(i);
	}
	out.print(sum);
	out.print(sum2);
	%>
</body>
</html>