<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	int login = 0;
	int delete = 0;
	
	String id = "";

	if(session.getAttribute("login") != null) {
		login = (int)session.getAttribute("login");
	}
	
	if(session.getAttribute("delete") != null) {
		delete = (int)session.getAttribute("delete");
	}
	
	if(session.getAttribute("id") != null) {
		id = (String)session.getAttribute("id");
	}
%>
<!DOCTYPE html>
<html>
<style>
body, talbe, th, td, div, dl, dt, dd, ul, ol, li, h1, h2, h3, h4, h5, h6,
	pre, form, fieldset, textarea, blockquote, span, * {
	font-family: 'Noto Sans KR', sans-serif;
}
span.xxx-small {font-size:8px;}
span.xx-small {font-size:10px;}
span.x-small {font-size:12px;}
</style>
<head>
<meta charset="UTF-8">
	<meta name="viewport" content="user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, width=device-width">
	
	 
	 
<title>Mubi</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
<!-- CSS 경로  -->
	<link rel="stylesheet" href="assets/css/review.css">
	<link rel="stylesheet" href="assets/css/reset01.css">
	<link rel="stylesheet" href="assets/css/style02.css">
	 <link rel="stylesheet" href="assets/css/swiper.css">
	  <link rel="stylesheet" href="assets/css/font-awesome.css">
	
	<!-- 웹 폰트 -->
    <link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:100,300,400,500,700,900&amp;subset=korean" rel="stylesheet">
</head>
 
<body>
  <header id="header">
        <div class="container">
            <div class="row">
                <div class="header clearfix">
                    <h1>
                        <a href="index.jsp">
                            <em><img src="assets/img/logo.png" alt="Mubi"></em>
                        </a>
                    </h1>
                    <nav class="nav">
                    <c:if test="${login != 1 || delete == 1 }">
                        <ul class="clearfix">     
                            <li><a href="login.jsp">로그인</a></li>
                            <li><a href="userJoin.jsp">회원가입</a></li>
                        </ul>
                    </c:if>
                    <c:if test="${login == 1}">
                        <ul class="clearfix">
                            	<li><a href="userUpdate.jsp">내정보수정</a></li>
                            	<li><a href="logout.do">로그아웃</a></li>
                        </ul>
                    </c:if>
                    </nav>
                </div>
            </div>
        </div>
    </header>
    <!-- //header -->
    
    
   
    
        
    <section id="movie">
        <div class="container">
            <div class="row">
                <div class="movie">
                    <h2 class="ir_so">최신 영화 정보</h2>
                    <div class="movie_title">
                        <ul>
                            <li class="active"><a href="#">영화정보</a></li>
                        </ul>
                    </div>
                    <div class="movie_chart">
                        <div class="chart_cont1">
                            <div>
                                <div class="poster">
                                   <figure>
                                        <img src="assets/img/올빼미포스터01.jpg" srcset="assets/img/올빼미포스터01@.jpg 2x"  alt="올빼미">
                                    </figure>

                            </div>
                           
                       </div>
                        
                       
                          <h1>올빼미</h1>
                              
                            <hr>
                            맹인이지만 뛰어난 침술 실력을 지닌 ‘경수’는 어의 ‘이형익’에게 그 재주를 인정받아 궁으로 들어간다. 그 무렵, 청에 인질로 끌려갔던 ‘소현세자’가 8년 만에 귀국하고,
                           ‘인조’는 아들을 향한 반가움도 잠시 정체 모를 불안감에 휩싸인다. 그러던 어느 밤, 어둠 속에서는 희미하게 볼 수 있는 ‘경수’가 ‘소현세자’의 죽음을 목격하게 되고 
                           진실을 알리려는 찰나 더 큰 비밀과 음모가 드러나며 목숨마저 위태로운 상황에 빠진다. 
                          아들의 죽음 후 ‘인조’의 불안감은 광기로 변하여 폭주하기 시작하고
                           세자의 죽음을 목격한 ‘경수’로 인해 관련된 인물들의 민낯이 서서히 드러나게 되는데...
                            <br><br><br><br><br><br><br><br><br>
                                                       
						<a href="rscreen.do"><button class="blue">예매하기</button></a>
                            
                       </div>
                          
                    </div>
                    
                    <hr>

					<c:forEach var="vo" items="${alist}">
						${vo.id }  <span class="xx-small">${vo.indate }</span>
						<%--  ${fn:split(vo.indate," ")[0] }  이걸사용하면 년월일만 나옴  --%>
						<div class="input-group">
							<c:if test="${sessionScope.id == vo.id }">
								<input type="text" class="form-control" value="${vo.contents }"
									aria-label="Disabled input example" disabled readonly>
								<a href="commentSearchOne.do?rno=${vo.rno }&&title=올빼미"
									class="btn btn-outline-secondary">수정</a>
								<a href="commentDelete.do?rno=${vo.rno}"
									class="btn btn-outline-secondary">삭제</a>
							</c:if>
						</div>
						<div class="input-group">
							<c:if
								test="${login != 1 || delete == 1 || sessionScope.id != vo.id}">
								<input type="text" class="form-control" value="${vo.contents }"
									aria-label="Disabled input example" disabled readonly>
							</c:if>
						</div>
					</c:forEach>
					
					<br>

					<form action="commentInsert.do" method="post">

					<input type="hidden" name="title" value="올빼미">
					<input type="hidden" name="id" value="${id}"> <br>
					
					<textarea class="col-auto form-control" type="text"
						id="reviewContents" name="contents" placeholder="영화 리뷰를 남겨주세요"></textarea>
						
					<input type="submit" class="btn btn-primary" value="리뷰작성">
				</form>

			</div>
                           
            </div>
                         
    </section>
    <!-- //movie -->
                      
    
    <!-- movie  -->
    
	<!-- end 배너  -->




    <footer id="footer">
        <div id="footer_sns">
            <div class="container">
                <div class="footer_sns">
                    <ul>
                        <li class="icon s1"><a href="#"><span class="ir_pm">트위터</span></a></li>
                        <li class="icon s2"><a href="#"><span class="ir_pm">페이스북</span></a></li>
                        <li class="icon s3"><a href="#"><span class="ir_pm">인스타그램</span></a></li>
                        <li class="icon s4"><a href="#"><span class="ir_pm">구글 플레이</span></a></li>
                        <li class="icon s5"><a href="#"><span class="ir_pm">아이폰 앱스토어</span></a></li>
                    </ul>    
                    <div class="tel">
                        <a href="#">ARS <em>1234-5678</em></a>
                    </div>
                </div>
            </div>
        </div>
        <div id="footer_infor">
            <div class="container">
                <div class="row">
                    <div class="footer_infor">
                        <h2><a href="index.jsp"><img src="assets/img/logo_footer.png" alt="Mubi"></a></h2>
                        <ul>
                            <li><a href="#">회사소개</a></li>
                            <li><a href="#">채용정보</a></li>
                            <li><a href="#">제휴/광고/부대사업 문의</a></li>
                            <li><a href="#">이용약관</a></li>
                            <li><a href="#">개인정보처리방침</a></li>
                            <li><a href="#">고객센터</a></li>
                            <li><a href="#">윤리경영</a></li>
                       </ul>
                        <address>
                            <p>서울특별시 동작구 노량진동, 2층 Mubi(주) (노량진, KG아이티뱅크)<br><span class="bar2">대표자명 김동환</span> 개인정보보호 김지은 노대성<br><span class="bar2">사업자등록번호 012-345-6789</span> 통신판매업신고번호 제 777호</p>
                            <p>Copyright 2014 by Mubi Inc. All right reserved</p>
                        </address>
                    </div>
                </div>
            </div>
        </div>
    </footer>
    <!-- //footer -->


<!-- 자바스크립트 라이브러리 -->
   <script src="assets/js/jquery.min_1.12.4.js"></script>
    <script src="assets/js/modernizr-custom.js"></script>
    <script src="assets/js/ie-checker.js"></script>
    <script src="assets/js/swiper.min.js"></script>
    <script>
        var swiper = new Swiper('.swiper-container',{
            pagination: {
                el: '.swiper-pagination',
            },
            navigation: {
                nextEl: '.swiper-button-next',
                prevEl: '.swiper-button-prev',
            },
            autoplay: {
                delay: 5000,
            },
        });
    </script>
</body>
</html>