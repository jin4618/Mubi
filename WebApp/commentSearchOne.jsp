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
                          <c:if test="${ title == '아바타 - 물의 길'}">
                            <div>
                                <div class="poster">
                                    <figure>
                                        <img src="assets/img/아바타포스터01.jpg" srcset="assets/img/아바타포스터01@.jpg 2x"  alt="아바타">
                                    </figure>
                            	</div>
                           
                       		</div>
                       
                         <h1>아바타 : 물의 길</h1>
                              
                            <hr>
                            아바타: 물의 길은 판도라 행성에서 '제이크 설리'와 '네이티리'가 이룬 가족이 겪게 되는 무자비한 위협과 살아남기 위해 떠나야 하는 긴 여정과 전투, 그리고 견뎌내야 할 상처에 대한 이야기를 그렸다. 
                           작중 배경은 전작의 2154년에서 15년이 지난 2169년이며, 족장이 된 제이크 설리와 네이티리는 가정을 꾸리고 네 자녀를 갖는다. 
                           개중에는 그레이스 박사의 아바타가 낳은 입양아인 키리도 있다. 나이가 어려 냉동 수면을 할 수 없었던 인간 아이 스파이더도 남아 완전히 부족에 동화된 모습이고,
                            제이크와 함께 남은 과학자 일행도 잘 정착한 모습이다. 
                           그러나 인류가 한 척도 아니고 10척에 이르는 대규모 우주선단을 이끌고 다시 판도라로 돌아오고,
                            이번에는 언옵타늄 채굴 따위가 아니라 죽어가는 지구를 버리고 판도라로의 완전 이주를 목적으로 하여 개발과 침공을 준비한다.
                            <br><br><br><br><br><br><br><br><br>
   						</c:if>
   						
   						<c:if test="${ title == '올빼미'}">
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
   						</c:if>
   						
   						<c:if test="${ title == '탄생'}">
                            <div>
                                <div class="poster">
                                    <figure>
                                        <img src="assets/img/탄생포스터01.png" srcset="assets/img/탄생포스터01@.png 2x"  alt="탄생">
                                    </figure>
                            	</div>
                           
                       		</div>
                       
                         <h1>탄생</h1>
                              
                            <hr>
                            1845년, 조선 근대의 문을 열다!
							새로운 세상을 꿈꾼 청년 김대건의 위대한 모험
							호기심 많고 말보다 행동이 앞서는 청년 김대건.
							조선 최초의 신부가 되라는 운명을 기꺼이 받아들이고,
							신학생 동기 최양업, 최방제와 함께 마카오 유학길에 나선다.
							나라 안팎으로 외세의 침략이 계속되고 아편전쟁이 끝나지 않은 시기,
 						    김대건은 바다와 육지를 종횡무진 누비며 마침내 조선 근대의 길을 열어젖힌다!
                            <br><br><br><br><br><br><br><br><br><br><br><br><br>
   						</c:if>
   						
   						<c:if test="${ title == '영웅'}">
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
   						</c:if>
   						
						<a href="rscreen.do"><button class="blue">예매하기</button></a>
                            
						</div>
						
					</div>
					
                  
                    <hr>
						<form action="commentUpdate.do">
						<div class="input-group">
							<input type="hidden" name="rno" value="${vo.rno }">
							<input type="text" class="form-control" value="${vo.contents }" name="contents">
							<input type="submit" class="btn btn-dark" value="수정">
						</div>
				</form>
			</div>
                           
            </div>
                         
    </section>    <!-- //movie -->
                      
    
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