<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>admin</title>
</head>
<body>
<h1>관리자 페이지</h1>

<form action="movieInsert.do">
	<table border="1">
		<tr height="50">
			<th colspan="2">개봉 영화 목록</th>
		</tr>
		
		<tr height="50">
			<th width="50" align="center">영화 번호</th>
			<th width="150" align="center">영화 목록</th>
		</tr>
		<tr height="50">
			<td width="50" align="center"><input type="text" name="mid" placeholder="영화 번호"/></td>
			<td width="150" align="center"><input type="text" name="title" placeholder="영화 제목" required/></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" align="center" value="추가">
				<a href="movieAllInfo.do">모두보기</a>
			</td>
		</tr>
	</table>
</form>
<br>
<br>
<div>
	<c:forEach var="mvo" items="${mlist1 }">
			<div>${mvo.mid }    ${mvo.title }</div>
	</c:forEach>
</div>
<br>
<br>
<form action="theaterInsert.do">
	<table border="1">
	
		<tr height="50">
			<th colspan="2">상영관 목록</th>
		</tr>
		
		<tr height="50">
			<th width="50" align="center">극장 번호</th>
			<th width="150" align="center">극장 목록</th>
		</tr>
		<tr height="50">
			<td width="50" align="center"><input type="text" name="tid" placeholder="극장 번호"/></td>
			<td width="150" align="center"><input type="text" name="theater" placeholder="극장" required/></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" align="center" value="추가">
				<a href="theaterAllInfo.do">모두보기</a>
			</td>
		</tr>
	</table>
</form>
<br>
<br>
<div>
	<c:forEach var="thvo" items="${thlist1 }">
			<div>${thvo.tid }    ${thvo.theater }</div>
	</c:forEach>
</div>
<br>
<br>
<form action="screenInsert.do">
	<table border="1">
	
		<tr height="50">
			<th colspan="4">상영 시간표</th>
		</tr>
		
		<tr height="50">
			<th width="150" align="center">상영 영화</th>
			<th width="150" align="center">상영관</th>
			<th width="150" align="center">상영 날짜</th>
			<th width="150" align="center">상영 시간</th>
		</tr>
		<tr height="50">
			<td width="150" align="center"><input type="text" name="title" placeholder="상영 영화"/></td>
			<td width="150" align="center"><input type="text" name="theater" placeholder="상영관"/></td>
			<td width="150" align="center"><input type="text" name="scheduleDate" placeholder="상영 날짜" required/></td>
			<td width="150" align="center"><input type="text" name="scheduleTime" placeholder="상영 시간" required/></td>
		</tr>
		<tr>
			<td colspan="4">
				<input type="submit" align="center" value="추가">
				<a href="screenAllInfo.do">모두보기</a>
			</td>
		</tr>
	</table>
</form>

<br>
<br>

<div>
	<c:forEach var="scvo" items="${sclist1 }">
			<div>${scvo.title }   ${scvo.theater }   ${scvo.scheduleDate }   ${scvo.scheduleTime }</div>
	</c:forEach>
</div>

	<a href="index.jsp" style="margin-left: 700px;">돌아가기</a>
</body>
</html>