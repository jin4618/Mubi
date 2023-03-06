package ticketVO;
/*
CREATE TABLE theater (
    tid number(10) NOT NULL,
    theater   varchar2(40) NOT NULL,
    
    CONSTRAINT pk_theater PRIMARY KEY(tid)
);
*/
public class theaterVO {
	private int tid;	// theater 식별자
	private String theater;	// 상영관
	
	public theaterVO() {
		// TODO Auto-generated constructor stub
	}

	public theaterVO(int tid, String theater) {
		this.tid = tid;
		this.theater = theater;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTheater() {
		return theater;
	}

	public void setTheater(String theater) {
		this.theater = theater;
	}
	
	
	
	
}
