<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.ArrayList" %>
<%
    String userid =null;
    if(request.getParameter("_id") != null) {
        userid = request.getParameter("_id");
    }
    String userpwd =null;
    if(request.getParameter("_pwd") != null) {
        userpwd = request.getParameter("_pwd");
    }
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <script>
        function Login(){
            var frm = document.gwangfrm;
            
            frm.action="gwang1.jsp";
            frm.submit;
        }
    </script>
</head>
<body>
<form name ="gwangfrm">
    <table>
        <tr>
            <td align="right">ID :</td>
            <td><input type="text" name="_id" id="_id"></td>
        </tr>
        <tr>
            <td>PASSWORD :</td>
            <td><input type="text" name="_pwd" id="_pwd"></td>
        </tr>
        <tr><td colspan="2"> <div></div></td></tr>
        <tr>
            <td colspan="2">
                <button type="submit" style="width: 100%" value="로그인" onclick="Login()">로그인</button>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <button type="submit" style="width: 100%" onclick="_list()">회원확인</button>
            </td>
        </tr>
    </table>
    <br>

</form>
</body>
</html>