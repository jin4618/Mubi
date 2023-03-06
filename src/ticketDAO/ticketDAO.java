package ticketDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import dbconn.DBConn;
import ticketVO.movieVO;
import ticketVO.scheduleVO;
import ticketVO.theaterVO;
import ticketVO.ticketVO;

public class ticketDAO {
	
	private Connection con;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public ticketDAO() throws ClassNotFoundException, SQLException {
		con = new DBConn().getConnection();
	}
	
	public void movieInsert(int mid, String title) throws SQLException {
		// admin.jsp 에서 insert
		
		// 영화
		String sql = "INSERT INTO movie VALUES (seq_movie.NEXTVAL, ?)";
						
		pstmt = con.prepareStatement(sql);

		pstmt.setString(1, title);
				
		pstmt.executeUpdate();
	}
	
	public void theaterInsert(int tid, String theater) throws SQLException {
		// admin.jsp 에서 insert
		
		// 극장
		String sql = "INSERT INTO theater VALUES (seq_theater.NEXTVAL, ?)";
		
		pstmt = con.prepareStatement(sql);
		
		pstmt.setString(1, theater);
		
		pstmt.executeUpdate();		
	}
	
	public void screenInsert(String title, String theater, String scheduleDate, String scheduleTime) throws SQLException {
		// admin.jsp 에서 insert
		
		// 상영시간표
		String sql = "INSERT INTO schedule VALUES (seq_schedule.NEXTVAL, ?, ?, ?, ?)";
		
		pstmt = con.prepareStatement(sql);
		
		pstmt.setString(1, title);
		pstmt.setString(2, theater);
		pstmt.setString(3, scheduleDate);
		pstmt.setString(4, scheduleTime);
		
		pstmt.executeUpdate();
		
		
	}
	
	public ArrayList<movieVO> movieAll() throws SQLException {	// admin.jsp에서 모두보기에 영화 목록
		ArrayList<movieVO> marray = new ArrayList<movieVO>();
		
		String sql = "SELECT * FROM movie ORDER BY 1";
		
		pstmt = con.prepareStatement(sql);
		
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			int mid = rs.getInt("mid");
			String title = rs.getString("title");
			
			movieVO mvo = new movieVO(mid, title);
			marray.add(mvo);
		}
		return marray;
	}
	
	public ArrayList<theaterVO> theaterAll() throws SQLException {	// admin.jsp에서 모두보기에 극장 목록		&	reservation.jsp에 극장 목록
		ArrayList<theaterVO> tharray = new ArrayList<theaterVO>();
		
		String sql = "SELECT * FROM theater ORDER BY 1";
		
		pstmt = con.prepareStatement(sql);
		
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			int tid = rs.getInt("tid");
			String theater = rs.getString("theater");
			
			theaterVO thvo = new theaterVO(tid, theater);
			tharray.add(thvo);
		}
		
		return tharray;
	}
	
	public ArrayList<scheduleVO> scheduleAll() throws SQLException {	// admin.jsp에서 모두보기에 시간 목록
		ArrayList<scheduleVO> scarray = new ArrayList<scheduleVO>();
		
		String sql = "SELECT * FROM schedule ORDER BY 1";
		
		pstmt = con.prepareStatement(sql);
		
		rs = pstmt.executeQuery();
		
		while (rs.next()) {
			int scno = rs.getInt(1);
			String title = rs.getString(2);
			String theater = rs.getString(3);
			String scheduleDate = rs.getString(4);
			String scheduleTime = rs.getString(5);
			
			
			scheduleVO scvo = new scheduleVO(scno, title, theater, scheduleDate, scheduleTime);
			scarray.add(scvo);
		}
		
		return scarray;
	}

	public ArrayList<scheduleVO> searchTheater(String orititle) throws SQLException {	// admin.jsp에서 모두보기에 극장 목록		&	reservation.jsp에 극장 목록
		ArrayList<scheduleVO> tharray = new ArrayList<scheduleVO>();
		
		String sql = "SELECT theater FROM schedule WHERE title = ? GROUP BY theater ORDER BY 1";
		
		pstmt = con.prepareStatement(sql);
		
		pstmt.setString(1, orititle);
		
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			
			String theater = rs.getString("theater");
			
			scheduleVO thvo = new scheduleVO(orititle, theater);
			tharray.add(thvo);
		}
		
		return tharray;
	}
	
	public ArrayList<scheduleVO> searchDate(String orititle, String oritheater) throws SQLException {	// reservation.jsp에서 date 목록
		ArrayList<scheduleVO> scdarray = new ArrayList<scheduleVO>();
		
		String sql = "SELECT schedule_date FROM schedule WHERE title = ? AND theater = ? GROUP BY schedule_date ORDER BY 1";
		
		pstmt = con.prepareStatement(sql);
		
		pstmt.setString(1, orititle);
		pstmt.setString(2, oritheater);
		
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			String scheduleDate = rs.getString("schedule_date");
			
			scheduleVO scdvo = new scheduleVO(orititle, oritheater, scheduleDate);
			scdarray.add(scdvo);
		}
		
		return scdarray;
	}

	public ArrayList<scheduleVO> searchTime(String orititle, String oritheater, String oridate) throws SQLException {
		ArrayList<scheduleVO> sctarray = new ArrayList<scheduleVO>();
		
		String sql = "SELECT schedule_time FROM schedule WHERE title = ? AND theater = ? AND schedule_date = ? ORDER BY 1";
		
		pstmt = con.prepareStatement(sql);
		
		pstmt.setString(1, orititle);
		pstmt.setString(2, oritheater);
		pstmt.setString(3, oridate);
		
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			String scheduleTime = rs.getString("schedule_time");
			
			scheduleVO sctvo = new scheduleVO(orititle, oritheater, oridate, scheduleTime);
			sctarray.add(sctvo);
		}
		
		return sctarray;
	}
	
	public void insertTicket(String id, String orititle, String oritheater, String oridate, String oritime) throws SQLException {
		String sql = "INSERT INTO ticket VALUES (seq_ticket.NEXTVAL, ?, ?, ?, ?, ?, 10000)";
		
		pstmt = con.prepareStatement(sql);
		
		pstmt.setString(1, id);
		pstmt.setString(2, orititle);
		pstmt.setString(3, oritheater);
		pstmt.setString(4, oridate);
		pstmt.setString(5, oritime);
		
		pstmt.executeUpdate();
	}

	public ArrayList<ticketVO> checkTicket(String id) throws SQLException {
		ArrayList<ticketVO> tarray = new ArrayList<ticketVO>();
		
		String sql = "SELECT * FROM ticket WHERE id = ? ORDER BY 1";
		
		pstmt = con.prepareStatement(sql);
		
		pstmt.setString(1, id);
		
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			if(rs.getString("id").equals(id)) {
			int tno = rs.getInt("tno");
			id = rs.getString("id");
			String title = rs.getString("title");
			String theater = rs.getString("theater");
			String scheduleDate = rs.getString("schedule_date");
			String scheduleTime = rs.getString("schedule_time");
			int price = rs.getInt("price");
			
			ticketVO tvo = new ticketVO(tno, id, title, theater, scheduleDate, scheduleTime, price);
			tarray.add(tvo);
			
			}
		}	
		return tarray;
	}
	
}
