## :pushpin: Mubi
>영화 예매 사이트


</br>

### 1.제작기간&참여 인원
* 2022.11.29. ~ 2022.12.27.   
* 팀프로젝트(3인)

</br>

### 2.사용기술
* JAVA11   
* ORACLE   
* JAVASCRIPT   
* AJAX

</br>

### 3.ERD
<img src="img/Mubi_ERD.png" width="700" height="350">

</br>

### 4.핵심기능
>Admin ( 개봉 영화 목록 관리, 상영관 목록 관리, 영화 상영 시간표 관리 )   
- 개봉 영화를 조회, 등록할 수 있다.   
- 상영관 목록을 조회, 등록할 수 있다.   
- 영화 상영 시간표를 조회, 등록할 수 있다.      
>Client ( 회원가입, 로그인, 회원정보 수정 / 탈퇴, 예매, 예매 확인, 영화 리뷰 댓글 작성 )   
1. 비회원   
    - 영화 정보 및 리뷰를 조회할 수 있다.   
2. 회원   
    - 영화 정보 및 리뷰를 조회할 수 있다.   
    - 리뷰 댓글을 작성 / 수정 / 삭제 할 수 있다.   
    - 지도를 보고 영화관을 확인하고, 예매 및 예매 확인을 할 수 있다.   
    - 회원 정보를 수정하거나 탈퇴할 수 있다.   


</br>

<details>
<summary>상세설명 펼치기</summary>
</br>

#### 4-1. 전체흐름

<img src="img/MVC2.png" width="700" height="350">
<img src="img/프로젝트구조.png" width="700" height="350">
</br>
</br>


#### 4-2. Connection ✔️ [코드확인](https://github.com/jin4618/Mubi/blob/1195f0d80e1d486736aeea554c1004a6a93a2359/src/dbconn/DBConn.java)
-	JDBC를 활용한 OracleDB 연결

</br>

#### 4-3. 관리자 페이지
##### ‘usertable’에 저장된 관리자 계정과 비교하여 로그인 ✔️ [코드확인](https://github.com/jin4618/Mubi/blob/6f466c29b4a08575fd83d17868638eb34816e1d0/src/user/userDAO.java#L38-L41)
<!-- ✔️ [Command 코드확인](https://github.com/jin4618/Mubi/blob/6f466c29b4a08575fd83d17868638eb34816e1d0/src/com/Mubi/impl/user/userLogin.java#L38-L43) -->
<img src="img/Admin.png" width="600" height="300">
</br>

✔️ [코드확인](https://github.com/jin4618/Mubi/blob/6f466c29b4a08575fd83d17868638eb34816e1d0/src/screen/screenDAO.java)
-	상영관 등록 / 조회 => Controller를 거쳐 ‘theater’ 테이블에 insert
-	개봉 영화 등록 / 조회 => Controller를 거쳐 ‘movie’ 테이블에 insert
-	상영시간표 등록 / 조회 => Controller를 거쳐 ‘schedule’ 테이블에 insert

</br>

#### 4-4. 메인 화면

<img src="img/Main1.png" width="600" height="300">
<img src="img/Main2.png" width="600" height="300">
</br>

-	로그인 / 회원가입
-	영화 정보 swiper / 순위 ✔️ [코드확인](https://github.com/jin4618/Mubi/blob/6f466c29b4a08575fd83d17868638eb34816e1d0/WebApp/index.jsp#L320-L338)
- 영화 예매하기
-	영화 상세보기
-	내 정보 수정
-	회원 탈퇴


</br>

#### 4-4. 회원가입

<img src="img/Member.png" width="600" height="300">
</br>

-	아이디, 비밀번호, 이름, 생년월일, 이메일, 전화번호, 주소를 입력 => Controller를 거쳐 DB에서 ‘usertable’ 테이블에 회원정보를 insert


</br>

#### 4-5. 로그인

<img src="img/Login.png" width="600" height="300">
</br>

-	아이디와 비밀번호 입력 => Controller를 거쳐 DB에 ‘usertable’ 테이블에서 회원정보와 비교하여 일치할 경우 로그인


</br>

#### 4-6. 회원정보 수정

<img src="img/Join.png" width="600" height="300">
</br>

-	아이디와 생년월일을 제외한 비밀번호, 이름, 이메일, 전화번호, 주소를 입력 => 아이디 세션과 함께 Controller를 거쳐 DB에서 ‘usertable’ 테이블에 회원정보를 update 한다.


</br>

<!--
-	수량 입력
-	메뉴 추가할 때마다 추가한 메뉴, 수량 및 가격 출력 => DB에서 ‘CafeTable’ 테이블에 저장 ✔️ [코드확인]() </br>
</br>


- 총 주문 내역 출력 -> DB에 ‘CafeTable’ 테이블에서 데이터를 조회하여 불러옴 ✔️ [코드확인]() </br>
-	Yes 버튼 누를 시 포인트 적립 창으로 이동</br>
- 포인트 적립을 원할 경우 회원 번호를 입력 받아 적립</br>
=> DB에 'member1' 테이블에서 데이터를 조회하고 회원번호가 맞는지 확인 ✔️ [코드확인]() </br>
=> 현재 포인트 내역 출력 / 5개 모일 시 아메리카노 쿠폰 증정 (포인트 초기화) ✔️ [코드확인]() ✔️ [코드확인]()</br>
- 적립을 원하지 않을 경우 결제만 진행</br>
</br>

#### 4-7. 유효성 검사 ✔️ [코드확인]() ✔️ [코드확인]()

<img src="img/validations.png" width="600" height="300">
</br>

- 입력 받아야 하는 Data 조건이 맞지 않을 경우 다시 입력 받음
</br>

-->

</details>

</br>

### 5.핵심 트러블 슈팅 

### 6. 느낀점

이번 프로젝트를 진행하면서 초반 의견 조율이 되지 않아 진행 상황이 좋지 않았습니다. 생각보다 많은 문제들을 마주하고 다른 조들에 비해 진도가 매우 낮아 부족함도 많이 느끼고, 아쉬움이 많이 남았던 프로젝트였습니다. 그래도 짧은 시간 내에 하나하나씩 해결해 나가면서 실력적인 면에서는 많은 성장을 할 수 있었습니다. 그래서 프로젝트 발표 기간이 끝난 후에도 부족했던 리뷰게시판과 결제 기능 부분을 보완하여 전보다 좀 더 완성도를 높였습니다. 만약 앞으로도 시간이 된다면 좌석기능과 리뷰 게시판은 별점으로 평점을 내는 기능까지 한 번 시도해보고 싶습니다. 이번을 계기로 초반에 팀원들과의 소통이 매우 중요하다는 걸 깨달았습니다. 앞으로는 충분한 소통으로 서로 맞춰가며 설계하고 개발하여 시간적 여유를 가지고 완성도 높은 프로젝트를 만들자를 다짐하게된 계기였습니다.



