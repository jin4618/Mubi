package ticketVO;
/*
CREATE TABLE movie (
    mid number(10) NOT NULL,
    title   varchar2(40) NOT NULL,
    
    CONSTRAINT pk_movie PRIMARY KEY(mid)
);
*/
public class movieVO {
	
	private int mid;	// movie 식별자
	private String title;	// 영화제목
	
	public movieVO() {
		// TODO Auto-generated constructor stub
	}


	public movieVO(int mid, String title) {
		this.mid = mid;
		this.title = title;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	
	

}
