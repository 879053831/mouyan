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
<c:if test="${powerMap!=null }">
${powerMap.size }
<c:forEach items="${powerMap }" var="item">

powerId:${item.value.powerId }

</c:forEach>
</c:if>
</body>
</html>