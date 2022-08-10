<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <script>
        var frm = document.frmlogin;
        frm.method = "get";
        frm.action="nextformdata2.jsp";
        frm.submit();
    </script>
</head>
<body>
<form action="" name="frmlogin">
    <input type="text" name="userid" id=""/>
    <input type="text" name="passwd" id=""/>

    <input type="button" value="">
    
</form>
</body>
</html>