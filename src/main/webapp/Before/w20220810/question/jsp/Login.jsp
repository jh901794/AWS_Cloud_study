<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String _id = request.getParameter("_id");
	String _pwd = request.getParameter("_pwd");
	if(_id.equals("jaehoon") && _pwd.equals("1234")){
		response.sendRedirect("success.html");
	}else{
		response.sendRedirect("common.html");
	}
%>
