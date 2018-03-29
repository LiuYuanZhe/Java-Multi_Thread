<%--
  Created by IntelliJ IDEA.
  User: LiuYuanZhe
  Date: 17/12/17
  Time: 下午3:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Title</title>
</head>
<body>
test：
<table width="100%" border=1>
    <tr>
        <td>id</td>
        <td>name</td>
    </tr>
    <tr>
        <td>${student.id }</td>
        <td>${student.name }</td>
    </tr>
</table>
</body>
</html>
