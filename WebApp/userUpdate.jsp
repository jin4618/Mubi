<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String id = "";

	if(session.getAttribute("id") != null) {
		id = (String)session.getAttribute("id");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="assets/css/loginstyle01.css">
<title>회원수정</title>
</head>
<body>
  <div class="wrapper">
    <h2>회원수정</h2>
    <form action="userUpdate.do" method="post">
    
      <div class="input-box">
        <input type="text" name="id" value=<%=id %> readonly>
      </div>
      
      <div class="input-box">
        <input type="password" name="pw" placeholder="비밀번호" minlength=5 maxlength=16>
      </div>
      
      <div class="input-box">
        <input type="text" placeholder="이름" name="name">
      </div>
      
      <div class="input-box">
        <input type="email" placeholder="이메일" name="email">
      </div>
      
      <div class="input-box">
        <input type="tel" placeholder="전화번호" name="tel">
      </div>
      
      <div class="input-box">
        <input type="text" placeholder="주소" name="address">
      </div>
      
      <div class="input-box button">
        <input type="submit" value="회원수정">
        <a href="index.jsp" style="margin-left: 300px; ">돌아가기</a>
      </div>
      
    </form>
  </div>
</body>
</html>