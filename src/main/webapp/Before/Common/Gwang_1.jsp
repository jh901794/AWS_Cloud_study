<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%!
    GwangBean bean;
    ArrayList al;
%>
<%
    String id = request.getParameter("userid");
    String pwd = request.getParameter("passwd");

    if(bean == null) {
        bean = new GwangBean(id, pwd);
    }
    if(al == null){
        al = new ArrayList();
    }

    al.add(bean);
%>