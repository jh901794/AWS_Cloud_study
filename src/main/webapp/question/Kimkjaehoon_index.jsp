<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ page import="java.util.ArrayList, j20220812.kimjaehoon_Bean" %>
        <%
        	kimjaehoon_Bean kb = new kimjaehoon_Bean();
        	kb.setNum(1);
        	kb.setSubject("제목1");
        	kb.setUserid("김재훈");
        	kb.setCurrentdate("2022-08-12");
        	kb.setView(0);
        	kb.setEmail("mail1.naver.com");
        	kb.setLike(0);
        	
        	kimjaehoon_Bean kb1 = new kimjaehoon_Bean();
        	kb1.setNum(2);
        	kb1.setSubject("제목2");
        	kb1.setUserid("김재훈");
        	kb1.setCurrentdate("2022-08-12");
        	kb1.setView(0);
        	kb1.setEmail("mail1.naver.com");
        	kb1.setLike(0);
        	
        	kimjaehoon_Bean kb2 = new kimjaehoon_Bean();
        	kb2.setNum(3);
        	kb2.setSubject("제목3");
        	kb2.setUserid("김재훈");
        	kb2.setCurrentdate("2022-08-12");
        	kb2.setView(0);
        	kb2.setEmail("mail1.naver.com");
        	kb2.setLike(0);
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
        <th> 이메일 </th>
        <th> 조회 </th>
        <th> 좋아요 </th>
    </tr>
        <tr>
        <td><%= kb.getNum() %></td>
        <td><%=kb.getSubject() %></td>
        <td><%=kb.getUserid() %></td>
        <td><%=kb.getEmail() %></td>
        <td><%=kb1.getCurrentdate() %></td>
        <td><%=kb.getLike() %></td>
        <td><%=kb.getView() %></td>
    </tr>
        <tr>
        <td><%= kb1.getNum() %></td>
        <td><%=kb1.getSubject() %></td>
        <td><%=kb1.getUserid() %></td>
                <td><%=kb2.getEmail() %></td>
        <td><%=kb1.getCurrentdate() %></td>
        <td><%=kb1.getLike() %></td>
        <td><%=kb1.getView() %></td>
    </tr>
            <tr>
        <td><%= kb2.getNum() %></td>
        <td><%=kb2.getSubject() %></td>
        <td><%=kb2.getUserid() %></td>
                <td><%=kb.getEmail() %></td>
        <td><%=kb2.getCurrentdate() %></td>
        <td><%=kb2.getLike() %></td>
        <td><%=kb2.getView() %></td>
    </tr>
    
</table>
</body>
</html>