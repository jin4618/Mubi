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
	<c:if test="${delete == 1 }">
		<script>
			alert("탈퇴 성공")
			location.href = "index.jsp";
		</script>
	</c:if>
	
	<c:if test="${delete == -1 || delete == 0 }">
		<script>
			alert("로그인 정보를 확인하세요.");
			location.href = "userDelete.jsp";
		</script>
	</c:if>
</body>
</html>