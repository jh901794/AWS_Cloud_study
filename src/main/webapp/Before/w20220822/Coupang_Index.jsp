<%--
  Created by IntelliJ IDEA.
  User: jh901
  Date: 2022-08-22
  Time: 오후 12:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        function x() {
            document.frm.action="coupang_next.jsp";
            document.frm.method="post";
            if(document.getElementById("pwd").equals(document.getElementById("c_pwd"))){
                document.frm.submit();
            }else {
                alert("비밀번호가 틀립니다.");
            }
        }

    </script>
</head>
<body>
<form name="frm">
    <table id="table">
        <tr>
            <td><input type="text" id="id" name="id" required placeholder=" 아이디"></td>
        </tr>
        <tr>
            <td><input type="text" id="pwd" name="pwd" required placeholder=" 비밀번호"></td>
        </tr>
        <tr>
            <td><input type="text" id="c_pwd" required placeholder=" 비밀번호 확인"></td>
        </tr>
        <tr>
            <td><input type="text" id="name" name="name" required placeholder=" 이름"></td>
        </tr>
        <tr>
            <td><input type="text" id="phone" name="phone" required placeholder=" 전화번호"></td>
        </tr>
        <tr>
            <td><input type="submit" value="회원가입" style="width: 100%" onclick="x()"></td>
        </tr>
    </table>
</form>
</body>
</html>
