<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="javax.sql.DataSource"%>
<%@ page import="javax.naming.InitialContext"%>
<%@ page import="javax.naming.Context"%>
<%
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String home = request.getParameter("homepage");
	String subject = request.getParameter("subject");
	String content = request.getParameter("content");
	String pass = request.getParameter("pass");
	
	//out.println(name + ", "+ email + ", " + home + 
	//", " + subject + ", " + content + ", " + pass);
	
	Connection con = null;
	// Statement를 개선해서 나온 PreparedStatement 씀
	PreparedStatement stmt = null;
	ResultSet rs = null;
	
	Context ctx = new InitialContext();
	DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/myoracle");
	
	
	try {
		con = ds.getConnection();
		
		String sql = "insert into tblboard(b_num, " + 
			"b_name, b_email, b_homepage, b_subject, b_content, b_pass, b_count, "+ 
			"b_ip, b_regdate, pos, depth) " + 
			"values(seq_b_num.nextVal, ?,?,?,?,?,?, 0, ?, sysdate, 0, 0)";
		stmt = con.prepareStatement(sql);
		// 첫 번째 물음표에 전달하겠다.
		stmt.setString(1, name);
		stmt.setString(2, email);
		stmt.setString(3, home);
		stmt.setString(4, subject);
		stmt.setString(5, content);
		stmt.setString(6, pass);
		stmt.setString(7, request.getRemoteAddr());
		stmt.executeUpdate();
%>
		reponse.sendReirect("List.jsp");
<%		
		
	} catch (Exception e) {
		System.out.println("PostProc.jsp: " + e);
	} finally {
		// 닫혀 있을 때만 닫을 수 있게
		if (rs != null)
			rs.close();

		if (stmt != null)
		stmt.close();
	
		if (con != null)
		con.close();
	}
%>