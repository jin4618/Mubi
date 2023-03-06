package ticketVO;
/*
CREATE TABLE ticket (
    tno    number(10) NOT NULL,
    id varchar2(40) NOT NULL,
    title   varchar2(200) NOT NULL,
    theater   varchar2(15) NOT NULL,
    schedule_date   varchar2(40) NOT NULL,
    schedule_time   varchar2(40) NOT NULL,
    price   number(30) NOT NULL,
   
    CONSTRAINT pk_ticket PRIMARY KEY(tno),
    CONSTRAINT ticket_usertable_id_fk FOREIGN KEY (id) REFERENCES usertable(id),
    CONSTRAINT ticket_movie_title_fk FOREIGN KEY (title) REFERENCES movie(title),
    CONSTRAINT ticket_theater_theater_fk FOREIGN KEY (theater) REFERENCES theater(theater),
    CONSTRAINT ticket_schedule_schedule_date_schedule_time_fk FOREIGN KEY (schedule_date, schedule_time) REFERENCES schedule(schedule_date, schedule_time)
);
*/
public class ticketVO {
	
	private int tno;
	private String id;
	private String title;
	private String theater;
	private String scheduleDate;
	private String scheduleTime;
	private int price;
	
	public ticketVO() {
		// TODO Auto-generated constructor stub
	}

	public ticketVO(int tno, String id, String title, String theater, String scheduleDate, String scheduleTime,
			int price) {
		this.tno = tno;
		this.id = id;
		this.title = title;
		this.theater = theater;
		this.scheduleDate = scheduleDate;
		this.scheduleTime = scheduleTime;
		this.price = price;
	}

	public int getTno() {
		return tno;
	}

	public void setTno(int tno) {
		this.tno = tno;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
