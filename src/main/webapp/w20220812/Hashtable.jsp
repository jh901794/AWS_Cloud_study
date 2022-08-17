<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.Hashtable" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Hashtable hash = new Hashtable();
for(int i =1; i <= 10; i++){
	hash.put(i,i);
}
for(int i =1; i <= 10; i++){
	int intvalue = (int) hash.get(i);
	out.print(intvalue);
}
%>

</body>
</html>