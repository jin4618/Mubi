package user;

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

public class userDAO {
	
	private Connection con;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public userDAO() throws ClassNotFoundException, SQLException {
		con = new DBConn().getConnection();
	}
	
	public int userLogin(String id, String pw) throws SQLException {
		
		String sql = "SELECT * FROM usertable WHERE id = ? AND pw = ?";
		
		try {
		pstmt = con.prepareStatement(sql);
		
		pstmt.setString(1, id);
		pstmt.setString(2, pw);
		
		rs = pstmt.executeQuery();
		
			if(rs.next()) {
				if(rs.getString("pw").equals("1234") && rs.getString("id").equals("admin")) {
				return 2;	// 관리자 로그인
				}
				else if(rs.getString("pw").equals(pw) && rs.getString("id").equals(id)){
					return 1;	// 로그인 성공
				}
				else {
					return 0;	// 아이디 또는 비번 확인하세요
				}
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	public void userInsert(String id, String pw, String name, String birth, String email, String tel, String address) throws SQLException {
		
			String sql = "INSERT INTO usertable (uno, id, pw, name, birth, email, tel, address) VALUES(seq_usertable.NEXTVAL, ?, ?, ?, ?, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, name);
			pstmt.setString(4, birth);
			pstmt.setString(5, email);
			pstmt.setString(6, tel);
			pstmt.setString(7, address);
			
			pstmt.executeUpdate();
		
	}	// userInsert()-end
	

	public void userUpdate (String new_pw, String new_name, String new_email, String new_tel, String new_address, String ori_id) throws SQLException {
		//con = ds.getConnection();
		
			String sql = 
				"UPDATE usertable SET pw = ?, name = ?, email = ?, tel = ?, address = ? where id = ?";
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, new_pw);
			pstmt.setString(2, new_name);
			pstmt.setString(3, new_email);
			pstmt.setString(4, new_tel);
			pstmt.setString(5, new_address);
			pstmt.setString(6, ori_id);
			
			pstmt.executeUpdate();
		
	}	
	
	public int userDelete(String id, String pw) throws SQLException {
		String sql = "select id, pw from usertable where id=? and pw =?";
	      
	      try {   
	      pstmt = con.prepareStatement(sql);
	      pstmt.setString(1, id);
	      pstmt.setString(2, pw);
	   
	      rs = pstmt.executeQuery();
	      if(rs.next()) {

				String sql2 = "DELETE FROM ticket WHERE id = ?";
				pstmt = con.prepareStatement(sql2);
				pstmt.setString(1, id);
				pstmt.executeUpdate();

				String sql3 = "DELETE FROM reviewtable WHERE id = ?";
				pstmt = con.prepareStatement(sql3);
				pstmt.setString(1, id);
				pstmt.executeUpdate();
	    	  
				String sql1 = "DELETE FROM usertable WHERE id = ?";
				pstmt = con.prepareStatement(sql1);
				pstmt.setString(1, id);
				pstmt.executeUpdate();
				
	          	return 1;
	         }
	         else {
	            return 0;
	         }
	      }
	      
	      catch (SQLException e) {
	         // TODO: handle exception
	         e.printStackTrace();

	      }
	      return -1;
	      
	   }   // userDelete()-end

	
}
