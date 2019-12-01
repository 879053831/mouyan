<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../../seting/header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>测试页面标签</title>
</head>
<body>
	<form action="./showform" method="post">
		Name<input name="name">
		<br>
		Age<input name="sex" type="number">
		<br>
		Email<input name="age" type="email">
		<br>
		<button type="submit">提交</button>
	</form>
</body>
</html>