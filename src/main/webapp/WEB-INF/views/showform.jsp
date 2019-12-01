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
<h1>
	<c:if test="${formMag != null }">
		<c:if test="${formMag.name != null }">
			name:${formMag.name }
			<br>
		</c:if>
		<c:if test="${formMag.sex != null }">
			sex:${formMag.sex }
		</c:if>
	</c:if>
	<c:if test="${formMag == null }">
		null>>>>>>
	</c:if>
	</h1>
</body>
</html>