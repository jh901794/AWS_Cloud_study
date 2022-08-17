<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="j20220817.bean.LoginBean,j20220817.dao.LoginDao" %>
<%

    request.setCharacterEncoding("utf-8");
    String id = request.getParameter("userid");
    String pwd = request.getParameter("passwd");
    String email = request.getParameter("email");
    Boolean loginflag = false;
    
    LoginBean login = new LoginBean(id,pwd,email);
    LoginDao dao = new LoginDao();
    if(dao.CheckLogin(id, pwd,email)){
       out.print("로그인 됐습니다.");
    }else{
    	out.print("로그인실패");
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