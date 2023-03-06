<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="assets/css/signupstyle01.css">
<title>로그인</title>
</head>
<body>
  <div class="container">
    <input type="checkbox" id="check">
    <div class="login form">
      <header>로그인</header>
      
      <form action="login.do" method="post">
        <input type="text" name="id" placeholder="아이디" required>
        <input type="password" name="pw" placeholder="비밀번호" required>
        <!-- <a href="#">비밀번호 찾기</a> -->
        <input type="submit" class="button" value="로그인">
      </form>
      
      <div class="signup">
        <span class="signup">회원이 아니신가요?
         <a href="userJoin.jsp">회원가입</a>
         <!-- <a href="index.jsp">돌아가기</a> -->
        </span>
      </div>
    </div>
    
  </div>
</body>
</html>