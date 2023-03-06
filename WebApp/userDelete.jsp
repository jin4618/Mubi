<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="assets/css/signupstyle01.css">
<title>회원탈퇴</title>
</head>
<body>
  <div class="container">
    <input type="checkbox" id="check">
    <div class="login form">
      <header>회원탈퇴</header>
      <form action="userDelete.do" method="post">
        <input type="text" name="id" placeholder="아이디" required>
        <input type="password" name="pw" placeholder="비밀번호" required>
        <div class="input-box button">
        	<input type="submit" class="button" value="회원탈퇴">
        	<a href="index.jsp" style="margin-left: 300px;">돌아가기</a>
        </div>
      </form>
    </div>
    
  </div>
</body>
</body>
</html>