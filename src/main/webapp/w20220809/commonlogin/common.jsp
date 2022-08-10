<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%!
    public String[] r = null;
    public String[] c =null;
    
    %>
    <%
    for(int i=1; i <=4; i++){
    	r[i] = request.getParameter("r"+i);
    	c[i] = request.getParameter("c"+i);
    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		for(int i=1; i<=4; i++){
			out.print(r[i]);
			
		}
	out.print("<br><hr><br>");
	for(int i=1; i<=4; i++){
		out.print(c[i]);
	}
	%>
</body>
</html>