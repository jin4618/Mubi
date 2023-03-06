package user;

/*
CREATE TABLE usertable(
    no	number(10) NOT NULL,-- 시퀀스를 받기위해 사용
    id varchar2(40), --ID 10자리
    pw varchar2(40), --비밀번호 최대 16자리
    name varchar2(10), --이름
    birth varchar2(30), -- 생년월일
    email varchar2(40), -- 이메일
    tel varchar2(30),   -- 번호
    address varchar2(60)    -- 주소
);
 */

public class userVO {
	private int uno;
	private String id;
	private String pw;
	private String name;
	private String birth;
	private String email;
	private String tel;
	private String address;
	
	public userVO() { }

	public userVO(int uno, String id, String pw, String name, String birth, String email, String tel, String address) {
		this.uno = uno;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.birth = birth;
		this.email = email;
		this.tel = tel;
		this.address = address;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getUno() {
		return uno;
	}

	public void setUno(int uno) {
		this.uno = uno;
	}

	
	
	
}
