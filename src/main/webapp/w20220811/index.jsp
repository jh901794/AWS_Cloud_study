<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.Hashtable,java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! 
	String name= "김재훈1";
	String addr = "우동1";
	int age = 24;
%>
    <%	String name2 = "김재훈2";
    	String addr2 = "우동2";
    	int age2 = 24;
    	
        out.println(name);
    	out.println(age);
    	out.println(addr);
    	
        out.println(name2);
    	out.println(age2);
    	out.println(addr2);
    	
    	out.print("<hr>");
    	name = "김재훈3";
    	addr = "우동3";
    	age = 24;
    	
 	name2 = "김재훈4";
	addr2 = "우동4";
	age2 = 24;
    	
    out.println(name);
	out.println(age);
	out.println(addr);
	
    out.println(name2);
	out.println(age2);
	out.println(addr2);
  
    %>
</body>
</html>