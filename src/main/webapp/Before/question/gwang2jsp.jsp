<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="Before.j20220811.infobean, java.util.ArrayList" %>
<%!
	ArrayList list;
public ArrayList getNew(){
	if(list == null){
		list = new ArrayList();
	}
	return list;
}
%>
<%
int like = 0, count = 0;
String userid = request.getParameter("_userid");
String subject = request.getParameter("_subject");
String date = request.getParameter("_date");
	if(request.getParameter("_like") != null){
		 like = Integer.parseInt(request.getParameter("_like"));	
	}
	if(request.getParameter("_count") != null){
		count = Integer.parseInt(request.getParameter("_count"));	
	}
	infobean ib = new infobean(userid,subject,date,like,count);
	getNew().add(ib);
	
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
<script>
        function Login(){
            var frm = document.gwangfrm;
            if(frm._userid.value==""){
                alert("작성자 입력");
                return;
            }
            if(frm._subject.value==""){
                alert("글제목 입력");
                return;
            }
            if(frm._date.value==""){
                alert("날자 입력");
                return;
            }
            if(frm._like.value==""){
                alert("좋아요 입력");
                return;
            }
            if(frm._count.value==""){
                alert("조회수 입력");
                return;
            }
            frm.action="gwang2jsp.jsp";
            frm.submit;
        }
    </script>
<form name ="gwangfrm">
    <table>
        <tr>
            <td align="right">작성자 :</td>
            <td><input type="text" name="_userid" id="_userid"></td>
        </tr>
        <tr>
            <td align="right">글제목 :</td>
            <td><input type="text" name="_subject" id="_subject"></td>
        </tr>
        <tr>
            <td align="right">날자 :</td>
            <td><input type="text" name="_date" id="_date"></td>
        </tr>
        <tr>
            <td align="right">좋아요 :</td>
            <td><input type="text" name="_like" id="_like"></td>
        </tr>
        <tr>
            <td align="right">조회수 :</td>
            <td><input type="text" name="_count" id="_count"></td>
        </tr>
        <tr>
            <td colspan="2">
                <button type="submit" style="width: 100%" value="로그인" onclick="Login()">정보입력</button>
            </td>
        </tr>
    </table>
</form>
<%
out.print("게시판 목록 <br><hr>");
	for(int i =1; i < list.size(); i++){
		infobean resultinfo = (infobean) list.get(i);
		out.print("글제목 : " + resultinfo.getSbject() + " 작성자 : " +resultinfo.getUserid() + " 작성일 : " +resultinfo.getData()+
				" 좋아요 : " +resultinfo.getLike() + " 조회수 : " +resultinfo.getCount());
		out.print("<br>");
	}

%>
</body>
</html>