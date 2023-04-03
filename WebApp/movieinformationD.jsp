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
                            <li class="active"><a href="#">영화 정보</a></li>
                        </ul>
                    </div>
                    <div class="movie_chart">
                        <div class="chart_cont1">
                            <div>
                                <div class="poster">
                                  <figure>
                                        <img src="assets/img/영웅포스터01.jpg" srcset="assets/img/영웅포스터01@.jpg 2x"  alt="영웅">
                                    </figure>
                            </div>
                           
                       </div>
                        
                       
                                    <h1>영웅</h1>

                              
                            <hr>
                            어머니 ‘조마리아’(나문희)와 가족들을 남겨둔 채 고향을 떠나온 대한제국 의병대장 ‘안중근’(정성화). 동지들과 함께 네 번째 손가락을 자르는 
                            단지동맹으로 조국 독립의 결의를 다진 안중근은 조선 침략의 원흉인 ‘이토 히로부미’를 3년 내에 처단하지 못하면 자결하기로 피로 맹세한다. 
                            그 약속을 지키기 위해 블라디보스토크를 찾은 안중근. 오랜 동지 ‘우덕순’(조재윤), 명사수 ‘조도선’(배정남), 독립군 막내 ‘유동하’(이현우), 독립군을 보살피는 동지 ‘마진주’(박진주)와 함께 거사를 준비한다.
                             한편 자신의 정체를 감춘 채 이토 히로부미에게 접근해 적진 한복판에서 목숨을 걸고 정보를 수집하던 독립군의 정보원 ‘설희’(김고은)는 이토 히로부미가 곧 러시아와의 회담을 위해 하얼빈을 찾는다는 일급 기밀을 다급히 전한다. 
                             드디어 1909년 10월 26일,이날만을 기다리던 안중근은 하얼빈역에 도착한 이토 히로부미를 향해 주저 없이 방아쇠를 당긴다. 현장에서 체포된 그는 전쟁 포로가 아닌 살인의 죄목으로, 
                             조선이 아닌 일본 법정에 서게 되는데… 누가 죄인인가, 누가 영웅인가!
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
								<a href="commentSearchOne.do?rno=${vo.rno }&&title=영웅"
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

					<input type="hidden" name="title" value="영웅">
					<input type="hidden" name="id" value="${id}"> <br>
					
					<textarea class="col-auto form-control" type="text"
						id="reviewContents" name="contents" placeholder="영화 리뷰를 남겨주세요"></textarea>
						
					<input type="submit" class="btn btn-primary" value="리뷰작성">
				</form>

			</div>
                           
            </div>
                         
    </section>    <!-- //movie -->

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
                            <p>Copyright 2022 by Mubi Inc. All right reserved</p>
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