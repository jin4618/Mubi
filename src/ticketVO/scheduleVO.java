package ticketVO;
/*
CREATE TABLE schedule (
    scno number(10) NOT NULL,
    -- mid number(10) NOT NULL,
    -- tid number(10) NOT NULL,
    title   varchar2(200) NOT NULL,
    theater   varchar2(15) NOT NULL,
    schedule_date   varchar2(40) NOT NULL,
    schedule_time   varchar2(40) NOT NULL,
    
    CONSTRAINT pk_schedule PRIMARY KEY(scno),
    CONSTRAINT schedule_movie_title_fk FOREIGN KEY (title) REFERENCES movie(title),
    CONSTRAINT schedule_theater_theater_fk FOREIGN KEY (theater) REFERENCES theater(theater)
);
*/

public class scheduleVO {
	
	private int scno;	// 상영 시간표 시퀀스
	private String title;	// 영화 fk
	private String theater;	// 극장 fk
	private String scheduleDate;	// 상영 날짜
	private String scheduleTime;	// 상영 시간
	
	public scheduleVO() {
		// TODO Auto-generated constructor stub
	}

	public scheduleVO(int scno, String title, String theater, String scheduleDate, String scheduleTime) {
		this.scno = scno;
		this.title = title;
		this.theater = theater;
		this.scheduleDate = scheduleDate;
		this.scheduleTime = scheduleTime;
	}
	
	

	public scheduleVO(String title) {
		this.title = title;
	}
	
	

	public scheduleVO(String title, String theater) {
		this.title = title;
		this.theater = theater;
	}

	public scheduleVO(String title, String theater, String scheduleDate) {
		this.title = title;
		this.theater = theater;
		this.scheduleDate = scheduleDate;
	}
	

	public scheduleVO(String title, String theater, String scheduleDate, String scheduleTime) {
		this.title = title;
		this.theater = theater;
		this.scheduleDate = scheduleDate;
		this.scheduleTime = scheduleTime;
	}

	public int getScno() {
		return scno;
	}

	public void setScno(int scno) {
		this.scno = scno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTheater() {
		return theater;
	}

	public void setTheater(String theater) {
		this.theater = theater;
	}

	public String getScheduleDate() {
		return scheduleDate;
	}

	public void setScheduleDate(String scheduleDate) {
		this.scheduleDate = scheduleDate;
	}

	public String getScheduleTime() {
		return scheduleTime;
	}

	public void setScheduleTime(String scheduleTime) {
		this.scheduleTime = scheduleTime;
	}


	
	
	

}
