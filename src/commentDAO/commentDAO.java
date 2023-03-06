package commentDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import commentVO.commentVO;
import dbconn.DBConn;

public class commentDAO {
	
	private Connection con;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public commentDAO() throws ClassNotFoundException, SQLException {
		con = new DBConn().getConnection();
	}
	
	public ArrayList<commentVO>  movie1(String Wtitle) throws SQLException {
		
		ArrayList<commentVO> alist = new ArrayList<commentVO>();
		
		String sql = "SELECT * FROM reviewTable where title = ? ORDER BY rno";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, Wtitle);
		rs = pstmt.executeQuery();
		
		while (rs.next()) {
			commentVO vo = null;
			
			int rno = rs.getInt(1);
			String id = rs.getString(2) ;
			String title =  rs.getString(3);
			String contents = rs.getString(4);
			String indate = rs.getString(5);
			
			vo = new commentVO(rno,id, title, contents, indate);
			
			alist.add(vo);
		}
		
		return alist;
	}
	
	public commentVO commentSearchOne(int _rno) throws SQLException {
		
		String sql = "SELECT * FROM reviewTable WHERE rno=?";
		
		pstmt=con.prepareStatement(sql);
		pstmt.setInt(1, _rno);
		rs = pstmt.executeQuery();
		
		rs.next();
		
		int rno = rs.getInt(1);
		String id = rs.getString(2) ;
		String title =  rs.getString(3);
		String contents = rs.getString(4);
		String indate = rs.getString(5);
		
		commentVO vo = new commentVO(rno,id, title, contents , indate);
			
		return vo;
	}

	public boolean commentUpdate(String contents,int rno) throws SQLException {
		
		String sql = "UPDATE reviewTable set contents=? where rno=?";
		
		pstmt=con.prepareStatement(sql);
		pstmt.setString(1, contents);
		pstmt.setInt(2, rno);
		
		pstmt.executeUpdate();
		
		return true;
	}
	

	public boolean commentInsert(String id, String title, String contents) throws SQLException {
		String sql = "INSERT INTO reviewtable (rno, id, title, contents) VALUES (seq_reviewtable.NEXTVAL,?,?,?)";
		
		pstmt=con.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, title);
		pstmt.setString(3, contents);
		
		pstmt.executeUpdate();
		
		return true;
	}

	public boolean commentDelete(int rno) throws SQLException {
	
		String sql = "DELETE FROM reviewTable WHERE rno=?";
		
		pstmt=con.prepareStatement(sql);
		pstmt.setInt(1, rno);
		
		pstmt.executeQuery();
		
		return true;
	}
	}
