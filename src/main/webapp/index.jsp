<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<h2>Hello World!</h2>
<h1>
    <a href="${pageContext.request.contextPath}/test/testdemo.action">点击</a>
    <a href="${pageContext.request.contextPath}/student/getStudent.action">学生</a>
</h1>
</body>
</html>
