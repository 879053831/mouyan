<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../../seting/header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>
		<c:if test="${givePwerFlag == false}">
		分配失败
		</c:if>
		<c:if test="${givePwerFlag == true}">
		分配成功
		</c:if>
	</h2>
</body>
</html>