package screen;

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

public class screenDAO {
	
	private Connection con;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public screenDAO() throws ClassNotFoundException, SQLException {
		con = new DBConn().getConnection();
	}
	
	public ArrayList<screenVO> screenAll() throws SQLException {
		ArrayList<screenVO> sarray = new ArrayList<screenVO>();
		
		String sql = "SELECT * FROM movie_screening ORDER BY mid";
		
		pstmt = con.prepareStatement(sql);
		
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			int mid = rs.getInt(1);
			String mtitle = rs.getString(2);
			String mtheater = rs.getString(3);
			String mscreenDate = rs.getString(4);
			String mscreenTime = rs.getString(5);
			
			screenVO svo = new screenVO(mid, mtitle, mtheater, mscreenDate, mscreenTime);
			sarray.add(svo);
		}
		return sarray;
	}
	
	
	
	public void screenInsert(String mtitle, String mtheater, String mscreenDate, String mscreenTime) throws SQLException {
		String sql =
				"INSERT INTO movie_screening VALUES (seq_movie_screening.NEXTVAL, ?, ?, ?, ?)";
				
		pstmt = con.prepareStatement(sql);

		pstmt.setString(1, mtitle);
		pstmt.setString(2, mtheater);
		pstmt.setString(3, mscreenDate);
		pstmt.setString(4, mscreenTime);
		
		pstmt.executeUpdate();
		
	}
	
	public ArrayList<screenVO> titleAll() throws SQLException {
		ArrayList<screenVO> starray = new ArrayList<screenVO>();
		
		String sql = "SELECT mtitle FROM movie_screening GROUP BY mtitle ORDER BY 1";
		
		pstmt = con.prepareStatement(sql);
		
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			String mtitle = rs.getString("mtitle");
			
			screenVO svo1 = new screenVO(mtitle);
			starray.add(svo1);
		}
		return starray;
	}
	
	public ArrayList<screenVO> theaterAll(String orititle) throws SQLException {
		ArrayList<screenVO> tharray = new ArrayList<screenVO>();
		
		String sql = "SELECT mtheater FROM movie_screening WHERE mtitle = ? GROUP BY mtheater ORDER BY 1";
		
		pstmt = con.prepareStatement(sql);
		
		pstmt.setString(1, orititle);
		
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			String mtheater = rs.getString("mtheater");
			
			screenVO svo2 = new screenVO(orititle, mtheater);
			tharray.add(svo2);
		}
		return tharray;
	}
	
	public ArrayList<screenVO> dateAll(String orititle1, String oritheater1) throws SQLException {
		ArrayList<screenVO> darray = new ArrayList<screenVO>();
		
		String sql = "SELECT mscreen_date FROM movie_screening WHERE mtitle = ? AND mtheater = ? GROUP BY mscreen_date ORDER BY 1";
		
		pstmt = con.prepareStatement(sql);
		
		pstmt.setString(1, orititle1);
		pstmt.setString(2, oritheater1);
		
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			String mscreenDate = rs.getString("mscreen_date");
			
			screenVO svo3 = new screenVO(orititle1, oritheater1, mscreenDate);
			darray.add(svo3);
		}
		return darray;
	}
	
	public ArrayList<screenVO> timeAll(String orititle2, String oritheater2, String oridate2) throws SQLException {
		ArrayList<screenVO> tarray = new ArrayList<screenVO>();
		
		String sql = "SELECT mscreen_time FROM movie_screening WHERE mtitle = ? AND mtheater = ? AND mscreen_date = ? GROUP BY mscreen_time ORDER BY 1";
		
		pstmt = con.prepareStatement(sql);
		
		pstmt.setString(1, orititle2);
		pstmt.setString(2, oritheater2);
		pstmt.setString(3, oridate2);
		
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			String mscreenTime = rs.getString("mscreen_time");
			
			screenVO svo4 = new screenVO(orititle2, oritheater2, oridate2, mscreenTime);
			tarray.add(svo4);
		}
		return tarray;
	}
	
	


}
