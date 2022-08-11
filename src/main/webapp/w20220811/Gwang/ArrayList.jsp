<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%!
    ArrayList arr = null;
%>
<%
    arr = new ArrayList();
    if(request.getParameter("_id") != null) {
        arr.add(request.getParameter("_id"));
    }
    if(request.getParameter("_pwd") != null) {
        arr.add(request.getParameter("_pwd"));
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
            if(frm._id.value==""){
                alert("아이디 입력");
                return;
            }
            if(frm._pwd.value==""){
                alert("password 입력");
                return;
            }
            frm.action="ArrayList.jsp";
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
    </table>
    <br>

</form>
<%
    out.println("ID : " + arr.get(0) + "<br>" + "PWD : "+ arr.get(1));
%>
</body>
</html>