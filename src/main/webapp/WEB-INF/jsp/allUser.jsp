<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: LiuYuanZhe
  Date: 18/3/20
  Time: 下午11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>allUser</title>
</head>
<body>
    <table>
               <%--account,country,score,province,sex,`password`--%>
        <tr>
            <td>account</td>
            <td>country</td>
            <td>score</td>
            <td>province</td>
            <td>sex</td>
            <td>password</td>
        </tr>
                   <c:forEach var="user" items="${requestScope.users}">
        <tr>
            <td>${user.account}</td>
            <td>${user.country}</td>
            <td>${user.score}</td>
            <td>${user.province}</td>
            <td>${user.sex}</td>
            <td>${user.password}</td>
        </tr>
                   </c:forEach>
    </table>
    <form action="/user/addUser.do" method="post" align="center">
        account：<input type="text"  name="account"/><br>
        score：   <input type="password"   name="score"/><br>
        <input type="submit"  value="登录"/>
    </form>
</body>
</html>
