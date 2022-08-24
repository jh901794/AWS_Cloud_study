<%--
  Created by IntelliJ IDEA.
  User: jh901
  Date: 2022-08-22
  Time: 오후 4:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        function x() {
            document.frm.action="gwang_1next.jsp";
            document.frm.method="post";
        }

    </script>
</head>
<body>
<form name="frm">
    <table id="table">
        <tr>
            <td colspan="2"><input type="text" id="id" name="id" required placeholder=" 이름"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="text" id="pwd" name="pwd" required placeholder=" 비밀번호"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="text" id="age" name="age" required placeholder=" 나이"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="text" id="addr" name="addr" required placeholder=" 주소"></td>
        </tr>
        <tr>
            <td ><input type="text" id="num1" name="num1" required placeholder=" 생년월일"></td>
            <td ><input type="text" id="num2" name="num2" required placeholder=" 개인식별번호"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="회원가입" style="width: 100%" onclick="x()"></td>
        </tr>
    </table>
</form>
</body>
</html>