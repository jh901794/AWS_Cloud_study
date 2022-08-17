<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.ArrayList,j20220812.NewsBean" %>
    <%
    NewsBean news = new NewsBean(1,"홈1","사회1", "정치1","경제1","국제1","문화1","it1",
    		"연재1","포토1","팩트1");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table>
    <tr>
        <td>num</td>
        <td>홈</td>
        <td>사회</td>
        <td>정치</td>
        <td>경제</td>
        <td>국제</td>
        <td>문화</td>
        <td>IT</td>
        <td>연재</td>
        <td>포토</td>
        <td>팩트</td>
    </tr>
    <tr>
        <td><%= news.getNews_num() %></td>
        <td><%= news.getNews_home() %></td>
        <td><%= news.getNews_society() %></td>
        <td><%= news.getNews_politics() %></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
    </tr>
</table>
</body>
</html>