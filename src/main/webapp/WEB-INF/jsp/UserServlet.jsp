<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: LiuYuanZhe
  Date: 18/3/20
  Time: 下午10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"	import="java.util.* " %>
<html>
<head>
    <title>UserServlet</title>
</head>
<body>
    <form id="myform" method="get" action="${pageContext.request.contextPath}/user/addUser.do">
        <span>${pageContext.request.contextPath}</span>
        <table>
            <tr>
                <td>account :</td>
                <td><input id="account" type="text"></td>
            </tr>
            <tr>
                <td>country :</td>
                <td><input id="country" type="text"></td>
            </tr>
            <tr>
                <td>province:</td>
                <td><input id="province" type="text"></td>
            </tr>
            <tr>
                <td>sex     :</td>
                <td><input id="sex" type="text"></td>
            </tr>
            <tr>
                <td><input id="重置" type="reset"></td>
                <td><input id="提交" type="submit"></td>
            </tr>
        </table>
    </form>
</body>
</html>
