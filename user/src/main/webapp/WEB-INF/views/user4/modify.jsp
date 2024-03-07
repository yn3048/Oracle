<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<html>
<head>
    <title>user4::modify</title>
</head>
<body>
<h3>user4 수정</h3>
<a href="/">메인</a>
<a href="/user4/list">목록</a>
<form action="/user4/modify" method="post">
    <table border="1">
        <tr>
            <td>이름</td>
            <td><input type="text" name="name" readonly value="${user4DTO.name}"></td>
        </tr>
        <tr>
            <td>성별</td>
            <td>
                <label><input type="radio" name="gender" value="F" ${user4DTO.gender == 'F' ? 'checked' : ''}>여자</label>
                <label><input type="radio" name="gender" value="M" ${user4DTO.gender == 'M' ? 'checked' : ''}>남자</label>
            </td>
        </tr>
        <tr>
            <td>나이</td>
            <td><input type="number" name="age" min="0" value="${user4DTO.age}"></td>
        </tr>
        <tr>
            <td>주소</td>
            <td><input type="text" name="addr" value="${user4DTO.addr}"></td>
        </tr>
        <tr>
            <td colspan="2" align="right"><input type="submit" value="수정"></td>
        </tr>
    </table>

</form>
</body>
</html>
