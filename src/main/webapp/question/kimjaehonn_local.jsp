<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%! 
    	String name = "전역재훈";
    	String address = "전역 부산";
    	int age = 24;
    	
    	public String getName(){
    		return name;
    	}
    	public String getAdd(){
    		return address;
    	}
    	public int getAge(){
    		return age;
    	}
    %>
    <%
    	String name = "지역 재훈";
    	String address ="지역 부산";
    	int age = 25;
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= name %>
<%= age %>
<%= address %>

<hr>
<%= getName()%>
<%= getAdd()%>
<%= getAge()%>
</body>
</html>