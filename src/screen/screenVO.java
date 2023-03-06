/*
CREATE TABLE movie_screening (
	id	number(10) NOT NULL,
	title	varchar2(200)	NOT NULL, -- 영화명
	theater	varchar2(15) NOT NULL, -- 상영관
	movie_id	number(10) NOT NULL, -- 영화 식별자
	screen_date	varchar2(20)	NOT NULL, -- 상영 날짜
    screen_time    varchar2(20)    NOT NULL, -- 상영 시간
    CONSTRAINT pk_movie_screening PRIMARY KEY(id)
);
*/

package screen;

public class screenVO {
	private int mid;
	private String mtitle;
	private String mtheater;
	private String mscreenDate;
	private String mscreenTime;
	
	public screenVO() { }

	public screenVO(int mid, String mtitle, String mtheater, String mscreenDate, String mscreenTime) {
		this.mid = mid;
		this.mtitle = mtitle;
		this.mtheater = mtheater;
		this.mscreenDate = mscreenDate;
		this.mscreenTime = mscreenTime;
	}

	public screenVO(String mtitle) {
		this.mtitle = mtitle;
	}

	public screenVO(String mtitle, String mtheater) {
		this.mtitle = mtitle;
		this.mtheater = mtheater;
	}

	public screenVO(String mtitle, String mtheater, String mscreenDate) {
		this.mtitle = mtitle;
		this.mtheater = mtheater;
		this.mscreenDate = mscreenDate;
	}

	public screenVO(String mtitle, String mtheater, String mscreenDate, String mscreenTime) {
		this.mtitle = mtitle;
		this.mtheater = mtheater;
		this.mscreenDate = mscreenDate;
		this.mscreenTime = mscreenTime;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getMtitle() {
		return mtitle;
	}

	public void setMtitle(String mtitle) {
		this.mtitle = mtitle;
	}

	public String getMtheater() {
		return mtheater;
	}

	public void setMtheater(String mtheater) {
		this.mtheater = mtheater;
	}

	public String getMscreenDate() {
		return mscreenDate;
	}

	public void setMscreenDate(String mscreenDate) {
		this.mscreenDate = mscreenDate;
	}

	public String getMscreenTime() {
		return mscreenTime;
	}

	public void setMscreenTime(String mscreenTime) {
		this.mscreenTime = mscreenTime;
	}
	
	

}