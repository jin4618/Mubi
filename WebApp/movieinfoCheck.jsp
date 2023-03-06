<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${alist.title == '아바타 - 물의 길' }">
		<script>
			location.href = "movieinformationA.jsp";
		</script>
	</c:if>
	<c:if test="${alist.title == '올빼미' }">
		<script>
			location.href = "movieinformationB.jsp";
		</script>
	</c:if>
	<c:if test="${alist.title == '탄생' }">
		<script>
			location.href = "movieinformationC.jsp";
		</script>
	</c:if>
	<c:if test="${alist.title == '영웅' }">
		<script>
			location.href = "movieinformationD.jsp";
		</script>
	</c:if>
</body>
</html>