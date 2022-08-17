<%@page import="java.lang.ProcessBuilder.Redirect"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="j20220811.HomeBean, java.util.ArrayList" %>
<%!
	ArrayList list;
public ArrayList getNew(){
	if(list == null){
		list = new ArrayList();
	}
	return list;
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
getNew();

HomeBean hb = new HomeBean();
hb.setName(request.getParameter("_name"));
hb.setAddress(request.getParameter("_address"));
hb.setEmail(request.getParameter("_email"));
hb.setAge(Integer.parseInt(request.getParameter("_age")));
list.add(hb);

response.sendRedirect("DaumLogin.html");
%>
</head>
<body>

<script>
        function Login(){
            var frm = document.gwangfrm;
            if(frm._name.value==""){
                alert("이름 입력");
                return;
            }
            if(frm._age.value==""){
                alert("나이 입력");
                return;
            }
            if(frm._address.value==""){
                alert("주소 입력");
                return;
            }
            if(frm._email.value==""){
                alert("이메일 입력");
                return;
            }
            frm.action="daum.jsp";
            frm.submit;
        }
    </script>
<form name ="gwangfrm">
    <table>
        <tr>
            <td align="right">이름 :</td>
            <td><input type="text" name="_name" id="_name"></td>
        </tr>
        <tr>
            <td>주소 :</td>
            <td><input type="text" name="_address" id="_address"></td>
        </tr>
        <tr>
            <td>나이 :</td>
            <td><input type="text" name="_age" id="_age"></td>
        </tr>
        <tr>
            <td>이메일 :</td>
            <td><input type="text" name="_email" id="_email"></td>
        </tr>
        <tr>
            <td colspan="2">
                <button type="submit" style="width: 100%" value="로그인" onclick="Login()">정보입력</button>
            </td>
        </tr>
    </table>
</form>
<%
	for(int i =0; i < list.size(); i++){
		HomeBean resulthb = (HomeBean) list.get(i);
		out.print("이름 : " + resulthb.getName() + "나이 : " + resulthb.getAge() + 
				"주소 : " + resulthb.getAddress() + "이메일 : " + resulthb.getEmail());
	}

%>
</body>
</html>