<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <script>
      function Next(){
          var frm = document.frm;
          frm.action="gwang_1next.jsp";
          frm.method="post";
          frm.submit();
      }
    </script>
</head>
<body>
<form name="frm">
    <table>
        <tr>
            <td><input type="text" name="userid" id="userid" placeholder=" 아이디" required/></td>
        </tr>
        <tr>
            <td><input type="text" name="passwd" id="passwd" placeholder=" 비밀번호" required/></td>
        </tr>
        <tr>
            <td><input type="submit" style="width:100%;" value="login" onclick="Next()"/></td>
        </tr>
    </table>
</form>
</body>
</html>