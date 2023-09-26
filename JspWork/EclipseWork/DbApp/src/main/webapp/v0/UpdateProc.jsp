<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.sql.*" %>

<%
request.setCharacterEncoding("utf-8");

String b_num = request.getParameter("b_num");
String name = request.getParameter("name");
String email = request.getParameter("email");
String subject = request.getParameter("subject");
String content = request.getParameter("content");
String pass = request.getParameter("pass");


//out.println(name + ", " + email + ", " + subject +
//		", " + content + ", " + pass);

Connection con = null;
PreparedStatement stmt = null;
// 값 받아서 저장
ResultSet rs = null;
	
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String id = "scott";
String pw = "1111";

try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con = DriverManager.getConnection(url, id, pw);
	
		
	// 업데이트 이전에 비밀번호 확인 작업
	String sql = "select b_pass from tblboard where b_num=?";
	stmt = con.prepareStatement(sql);
	stmt.setString(1, b_num);
	// rs에 결과 받기
	rs = stmt.executeQuery();
	rs.next();
	
	if(pass.equals(rs.getString("b_pass"))){
		sql = "update tblboard set b_name=?, b_email=?, b_subject=?, b_content=? " +
			"where b_num=?";
		stmt = con.prepareStatement(sql);
		stmt.setString(1, name);
		stmt.setString(2, email);
		stmt.setString(3, subject);
		stmt.setString(4, content);
		stmt.setString(5, b_num);
		stmt.executeUpdate();
		
	
		response.sendRedirect("List.jsp");
	}
	else {
%>
	<script>
		alert("비밀번호가 틀렸습니다.");
		// update.jsp로 back 시키기
		history.back();
	</script>
<%		
	}
}
catch(Exception e){
	System.out.println("UpdateProc.jsp: " + e);
}
finally{
	if(stmt != null) stmt.close();
	if(con != null)	con.close();
	if(rs != null) rs.close();
}
%>