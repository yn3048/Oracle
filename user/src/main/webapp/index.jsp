<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
    h2 {
        max-width: 800px;
        height: 80px;
        width: 100%;
        margin: 50px auto;
        text-align: center;
        line-height: 80px;
        background-color: darkorange;
        color: #fff;
    }

    div {
        margin: 10px auto;
        max-width: 800px;
        width:100%;
        height:600px;
        border: 1px solid orange;
        text-align: center;
    }

    div h4 {
        font-weight: bold;
    }

    div a {
        text-decoration: none;
        color: #fff;
        font-weight: bold;
        display: inline-block;
        padding: 5px;
        margin-right: 10px;
        background-color: orange;
    }

    div a:hover {
        text-decoration: underline;
    }
</style>
<body>
<h2>Oracle users 실습</h2>

<div>
    <h4>user1 실습</h4>
    <a href="/user1/list">user1 목록</a>
    <a href="/user1/register">user1 등록</a>

    <h4>user2 실습</h4>
    <a href="/user2/list">user2 목록</a>
    <a href="/user2/register">user2 등록</a>

    <h4>user3 실습</h4>
    <a href="/user3/list">user3 목록</a>
    <a href="/user3/register">user3 등록</a>

    <h4>user4 실습</h4>
    <a href="/user4/list">user4 목록</a>
    <a href="/user4/register">user4 등록</a>

    <h4>user5 실습</h4>
    <a href="/user5/list">user5 목록</a>
    <a href="/user5/register">user5 등록</a>

    <h4>user6 실습</h4>
    <a href="/user6/list">user6 목록</a>
    <a href="/user6/register">user6 등록</a>

</div>
</body>
</html>
