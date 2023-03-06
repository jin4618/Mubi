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
<head>
<meta charset="UTF-8">
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript" src="https://cdn.iamport.kr/js/iamport.payment-1.1.8.js"></script>
<title>pay</title>
</head>
<body>

<!-- TC0ONETIME -->
    <script>
    IMP.init('imp20123762');
 
    
	IMP.request_pay({
	pg : 'kakaopay', 
    pay_method : 'kakaopay',
    merchant_uid : 'merchant_' + new Date().getTime(),
    name :'<%=id%>',
    amount : 10000, 
    buyer_email : 'iamport@siot.do',
    buyer_name : '구매자이름',
    buyer_tel : '010-1234-5678',
    buyer_addr : '서울특별시 강남구 삼성동',
    buyer_postcode : '123-456'
    
    
	}, function(rsp) {
	    if ( rsp.success ) {
	    	jQuery.ajax({
	    	url: "/reservationCheck.do",
	    	type :'POST',
	    	dataType: 'json',
		data: {
    		"id": "<%=id%>",
    		"title" : "${orititle }",
    		"theater" : "${oritheater }",
    		"scheduleDate" : "${oridate }",
    		"scheduleTime" : "${oritime }",
    		"price" : "10000"
    
    		} 
	    	}).done(function(data) {
	    		if ( everythings_fine ) {
                    msg = '결제가 완료되었습니다.';
                    msg += '\n고유ID : ' + rsp.imp_uid;
                    msg += '\n상점 거래ID : ' + rsp.merchant_uid;
                    msg += '\결제 금액 : ' + rsp.paid_amount;
                    msg += '카드 승인번호 : ' + rsp.apply_num;
                    
                    alert(msg);
                } else {
                    //[3] 아직 제대로 결제가 되지 않았습니다.
                    //[4] 결제된 금액이 요청한 금액과 달라 결제를 자동취소처리하였습니다.
                }
	    	});
	    	location.href="reservationCheck.do?id=<%= id %>";
    } else {
        var msg = '결제에 실패하였습니다.';
        msg += '에러내용 : ' + rsp.error_msg;
        location.href="rscreen.do";
    	alert(msg);
    }
});
		

    </script>
    
</body>
</html>