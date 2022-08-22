<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.ArrayList,Before.j20220812.BoardBean" %>
    <%
    	BoardBean bb = new BoardBean();
    	bb.setNum(1);
    	bb.setSubject("제목1");
    	bb.setUserid("김재훈");
    	bb.setCurrentdate("2022-08-12");
    	bb.setView(0);
    	bb.setLike(0);
    	
    	BoardBean bb2 = new BoardBean();
    	bb2.setNum(2);
    	bb2.setSubject("제목2");
    	bb2.setUserid("김재훈");
    	bb2.setCurrentdate("2022-08-12");
    	bb2.setView(0);
    	bb2.setLike(0);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table style="width:100%;">
    <tr>
        <th> num </th>
        <th> 제목 </th>
        <th> 작성자 </th>
        <th> 작성일 </th>
        <th> 조회 </th>
        <th> 좋아요 </th>
    </tr>
        <tr>
        <td><%= bb.getNum() %></td>
        <td><%=bb.getSubject() %></td>
        <td><%=bb.getUserid() %></td>
        <td><%=bb.getCurrentdate() %></td>
        <td><%=bb.getLike() %></td>
        <td><%=bb.getView() %></td>
    </tr>
    
        <tr>
        <td><%= bb2.getNum() %></td>
        <td><%=bb2.getSubject() %></td>
        <td><%=bb2.getUserid() %></td>
        <td><%=bb2.getCurrentdate() %></td>
        <td><%=bb2.getLike() %></td>
        <td><%=bb2.getView() %></td>
    </tr>
</table>
</body>
</html>