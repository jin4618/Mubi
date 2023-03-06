<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="assets/css/loginstyle01.css">
<title>회원가입</title>
</head>
<body>
  <div class="wrapper">
    <h2>회원가입</h2>
    <form action="userInsert.do" method="post">
      <div class="input-box">
        <input type="text" name="id" placeholder="아이디" required>
      </div>
  
      <div class="input-box">
        <input type="password" name="pw" placeholder="비밀번호" minlength=5 maxlength=16 required>
      </div>
      <div class="input-box">
        <input type="text" placeholder="이름" name="name" required>
      </div>
      
         <div class="input-box">
        <input type="date" placeholder="생년월일" name="birth" required>
      </div>
      
      <div class="input-box">
        <input type="email" placeholder="이메일" name="email" required>
      </div>
      
      <div class="input-box">
        <input type="tel" placeholder="전화번호" name="tel" required>
      </div>
      
      <div class="input-box">
        <input type="text" placeholder="주소" name="address" required>
      </div>
    
      
      <div class="input-box button">
        <input type="Submit" id="joinBtn" value="회원가입">
        <a href="index.jsp" style="margin-left: 300px;">돌아가기</a>
      </div>

    </form>
    
  </div>
</body>
</html>