<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%!
    	public String[] arr = null;
    	public String[] crr = null;
    %>
    <%
    	arr = request.getParameterValues("rcommon");
    	crr = request.getParameterValues("ccommon");

    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
for(int i = 0; i<arr.length; i++){
	out.print(arr[i]);
}
%>
	<br><hr><br>
	<%
for(int i = 0; i<arr.length; i++){
	out.print(crr[i]);
}
%>
	
</body>
</html>