package commentVO;

public class commentVO {
	private int rno;
	private String id;
	private String title;
	private String contents;
	private String indate;
	
	public String getIndate() {
		return indate;
	}


	public void setIndate(String indate) {
		this.indate = indate;
	}


	public int getRno() {
		return rno;
	}


	public void setRno(int rno) {
		this.rno = rno;
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


	public String getContents() {
		return contents;
	}


	public void setContents(String contents) {
		this.contents = contents;
	}
	
	
	public commentVO(int rno, String id, String title, String contents,String indate) {
		this.rno = rno;
		this.id = id;
		this.title = title;
		this.contents = contents;
		this.indate = indate;
	}
	
}
