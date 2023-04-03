
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

</style>
<head>
<meta charset="UTF-8">
	<meta name="viewport" content="user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, width=device-width">
	 
<title>Mubi</title>
<!-- CSS 경로  -->
	<link rel="stylesheet" href="assets/css/reserve.css">
	
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
                            	<li><a href="reservationCheck.do?id=<%= id %>">예매 확인</a></li>
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
                            <li class="active"><a href="#">상영시간표</a></li>
                       
                        </ul>
                        
 <!--/////////////////////////////////////////////////////////  -->                  
                    
                <!-- 상영정보 start -->    
<form>
    <div class="reserve-container">
        <div class="movie-part">
            <div class="reserve-title">영화</div>
            <div class="movie-list">
	   <div class="ticketList">
				<c:forEach var="mvo" items="${mlist1 }">
             <a href="searchTheater.do?title=${mvo.title }">${mvo.title }</a><br>
            </c:forEach>
		</div>
		
 </div>
        </div>
        <div class="theater-part">
            <div class="reserve-title">상영관</div>
               <div class="theater-place-wrapper">
					<c:forEach var="thvo" items="${theater }">
						<a href="searchDate.do?title=${orititle }&theater=${thvo.theater }" >${thvo.theater }</a><br>
					</c:forEach>                
                   	 </div>
        				</div>
     
     
     
        <div class="day-part">
            <div class="reserve-title">날짜</div>
           			<c:forEach var="scdvo" items="${date }">
						<a href="searchTime.do?title=${orititle }&theater=${oritheater }&scheduleDate=${scdvo.scheduleDate }">${scdvo.scheduleDate }</a><br>
					</c:forEach>
        </div> 
        
        
        
            
        <div class="time-part">
            <div class="reserve-title">시간</div>     
        		  <c:forEach var="sctvo" items="${time }">
					<a href="reservationView.do?title=${orititle }&theater=${oritheater }&scheduleDate=${oridate }&scheduleTime=${sctvo.scheduleTime }&id=<%=id %>">${sctvo.scheduleTime }</a><br>
				</c:forEach>
              
	</div>
    </div>

</form>
	
	

<!-- ///////////////////////////////////////////////////////////////////////// -->

<form name="reservation" action="reservation.do" method="post">

<div class="reserve-container">
        <div class="movie-part">
            <div class="reserve-title">영화</div>
						${orititle }
						</div>
        
        
        <div class="theater-part">
            <div class="reserve-title">상영관</div>
               <div class="theater-place-wrapper">
					 ${oritheater }             
                  	  </div>
  </div>
     
     
        <div class="day-part">
            <div class="reserve-title">날짜</div>
           			${oridate }
        			</div>  
        
           
        <div class="time-part">
            <div class="reserve-title">시간</div>     
        		  ${oritime }      
        </div>
        
          
        		 
        
        
    </div>

</form>
<br>
<h4>영화관 위치</h4>
<div id="map" style="width:100%;height:350px;"></div>

<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=d4fb441d1b6839cf1e4a9522ce1cd2df"></script>
<script>

var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
    mapOption = { 
        center: new kakao.maps.LatLng(37.52972651319289,126.96395252493481), // 지도의 중심좌표
        level: 3 // 지도의 확대 레벨
    };

var map = new kakao.maps.Map(mapContainer, mapOption);

// 마커가 표시될 위치입니다 
var markerPosition  = new kakao.maps.LatLng(37.52972651319289,126.96395252493481); 

// 마커를 생성합니다
var marker = new kakao.maps.Marker({
    position: markerPosition
});

// 마커가 지도 위에 표시되도록 설정합니다
marker.setMap(map);

var iwContent = '<div style="padding:5px;">Mubi</div>', // 인포윈도우에 표출될 내용으로 HTML 문자열이나 document element가 가능합니다
    iwPosition = new kakao.maps.LatLng(37.52972651319289,126.96395252493481); //인포윈도우 표시 위치입니다

// 인포윈도우를 생성합니다
var infowindow = new kakao.maps.InfoWindow({
    position : iwPosition, 
    content : iwContent 
});
  
// 마커 위에 인포윈도우를 표시합니다. 두번째 파라미터인 marker를 넣어주지 않으면 지도 위에 표시됩니다
infowindow.open(map, marker); 
</script>












  
  
  
  
   
<br>
<br>       
  
  <a href="reservation.do?title=${orititle }&theater=${oritheater }&scheduleDate=${oridate }&scheduleTime=${oritime }&id=<%=id %>">
  <div style="display: flex; justify-content: center;">   
  	<button class="blue" >
		예매하기
	     
		 </button>
       </div>       
     </a>    		<!-- 상영정보 end -->
  <!--/////////////////////////////////////////////////////////  -->     
                 </div>
                 </div>    
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
