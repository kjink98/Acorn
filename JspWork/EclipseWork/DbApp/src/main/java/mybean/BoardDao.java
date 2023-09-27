package mybean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDao {
	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;
	private DataSource ds;
	
	//생성자에다 DB연결
	public BoardDao() {
		try {
			Context ctx = new InitialContext();
			ds = (DataSource)ctx.lookup("java:comp/env/jdbc/myoracle");
		}
		catch(Exception err) {
			System.out.println("BoardDao: " + err);
		}
	}
	
	public void freeConnection()  {
		if(rs != null)
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		if(stmt != null)
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		if(con != null)
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
	// List.jsp (DB랑 연결해서 DB 데이터를 List에 담아 리턴해주기)
	public List getBoardList() {
		String sql = "select b_num, b_subject, b_name, b_regdate, b_count from tblboard";
		// 전체 리스트를 넘기기 위해(동기화 처리)
		Vector vector = new Vector();
		try {
			con = ds.getConnection();
			
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();

			// 데이터 개수만큼 반복 돌기
			while (rs.next()) {
				// bean 객체 생성
				Board board = new Board();
				board.setB_num(rs.getInt("b_num"));
				board.setB_subject(rs.getString("b_subject"));
				board.setB_name(rs.getString("b_name"));
				board.setB_regdate(rs.getString("b_regdate"));
				board.setB_count(rs.getInt("b_count"));
				
				vector.add(board);
			}
		}
		catch(Exception e) {
			System.out.println("List.jsp: " + e);
		}
		finally {
			freeConnection();
		}
		return vector;
	}
	
	// PostProc.jsp
	public void setBoard(Board board) {
		String sql = "insert into tblboard(b_num, " + 
				"b_name, b_email, b_homepage, b_subject, b_content, b_pass, b_count, "+ 
				"b_ip, b_regdate, pos, depth) " + 
				"values(seq_b_num.nextVal, ?,?,?,?,?,?, 0, ?, sysdate, 0, 0)";
		try {
			// db 접속
			con = ds.getConnection();
			stmt = con.prepareStatement(sql);
			// 첫 번째 물음표에 전달하겠다.
			stmt.setString(1, board.getB_name());
			stmt.setString(2, board.getB_email());
			stmt.setString(3, board.getB_homepage());
			stmt.setString(4, board.getB_subject());
			stmt.setString(5, board.getB_content());
			stmt.setString(6, board.getB_pass());
			stmt.setString(7, board.getB_ip());
			stmt.executeUpdate();
		}
		catch(Exception e) {
			System.out.println("setBoard : " + e);
		}
		finally {
			freeConnection();
		}
		
	}
	
	
	
}
