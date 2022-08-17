<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="Common.util.CommonUtil, java.util.ArrayList" %>
    <%!
/*     String guserid, gsubject, currentdate;
    int gnumber, gview, glike; 
  
    public void setType(Object type ){
    	String type_value = type.getClass().getName();
    	String str = new String();
    	String str_value = null;
    	int int_value = 0;
    	if(type_value.equals("java.lang.String")){
    		str_value = (String) type;
    	}
    	if(type_value.equals("java.lang.Integer")){
    		int_value = (Integer) type;
    	}
    }*/
    %>
    <%
    	Object num = CommonUtil.IsNull(request, 2, "number");
    Object subject = CommonUtil.IsNull(request, 1, "subject");
    Object userid = CommonUtil.IsNull(request, 1, "userid");
    Object currentdate = CommonUtil.IsNull(request, 1, "currentdate");
    Object view = CommonUtil.IsNull(request, 2, "view");
    Object like = CommonUtil.IsNull(request, 2, "like");
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="Gwang_1.jsp" name="frm">
<table>
	<tr>
	<th>number</th>
	<th>제목</th>
	<th>작성자</th>
	<th>작성일</th>
	<th>조회</th>
	<th>좋아요</th>
	</tr>
	<tr>
		<td><input type="text" name="number" id="" required/></td>
		<td><input type="text" name="subject" id="" required/></td>
		<td><input type="text" name="userid" id="" required/></td>
		<td><input type="text" name="currentdate" id="" required/></td>
		<td><input type="text" name="view" id="" required /></td>
		<td><input type="text" name="like" id="" required/></td>
	</tr>
	<tr>
		<td colspan="6"><input type="submit" value="" /></td>
	</tr>
</table>
</form>
<%=num %><br>
<%=subject %><br>
<%=userid %><br>
<%=currentdate %><br>
<%=view %><br>
<%=like %><br>

</body>
</html>