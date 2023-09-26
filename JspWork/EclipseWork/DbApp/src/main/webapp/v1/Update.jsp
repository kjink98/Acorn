<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="dbcp.DBConnectionMgr"%>
<html>
<head> <title>JSPBoard</title>
<link href="style.css" rel="stylesheet" type="text/css">
<script>
	function check() {
	   if (document.form.pass.value == "") {
		 alert("수정을 위해 패스워드를 입력하세요.");
	     form.pass.focus();
		 return false;
		 }
	   document.form.submit();
	}
</script>
</head>
<body>
<%
	String b_num = request.getParameter("b_num");
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	DBConnectionMgr pool = null;

	
	// DB로 부터 가져올 변수
	String name = "";
	String regdate = "";
	String email = "";
	String home = "";
	String subject = "";
	String content = "";
	String ip = "";
	int count = 0;
	
	
	try {
		pool = DBConnectionMgr.getInstance();
		con = pool.getConnection();
		
		String sql = "select * from tblboard where b_num=" + b_num;
		stmt = con.createStatement();
		rs = stmt.executeQuery(sql);

		// 데이터 개수만큼 반복 돌기
		if(rs.next()){
			name = rs.getString("b_name");
			regdate = rs.getString("b_regdate");
			email = rs.getString("b_email");
			home = rs.getString("b_homepage");
			subject = rs.getString("b_subject");
			content = rs.getString("b_content");
			ip = rs.getString("b_ip");
			count = rs.getInt("b_count");
			}
		} catch (Exception e) {
			System.out.println("List.jsp: " + e);
		} finally {
			// 닫혀 있을 때만 닫을 수 있게
			pool.freeConnection(con, stmt, rs);
		}
		
%>
<center>
<br><br>
<table width=460 cellspacing=0 cellpadding=3>
  <tr>
   <td bgcolor=#FF9018  height=21 align=center class=m>수정하기</td>
  </tr>
</table>

<form name=form method=post action="UpdateProc.jsp" >
<!-- 글 번호를 전달하는 부분이 없으므로 hidden 태그로 보내준다 -->
<input type="hidden" name="b_num" value="<%=b_num%>" />
<table width=70% cellspacing=0 cellpadding=7>
 <tr>
  <td align=center>
   <table border=0>
    <tr>
     <td width=20%>성 명</td>
     <td width=80%>
	  <input type=text name=name size=30 maxlength=20 value="<%=name%>">
	 </td>
	</tr>
    <tr>
     <td width=20%>E-Mail</td>
     <td width=80%>
	  <input type=text name=email size=30 maxlength=30 value="<%=email%>">
	 </td>
    </tr>
	<tr>
     <td width=20%>제 목</td>
     <td width=80%>
	  <input type=text name=subject size=50 maxlength=50 value="<%=subject%>">
	 </td>
    <tr>
     <td width=20%>내 용</td>
     <td width=80%>
	  <textarea name=content rows=10 cols=50><%= content %></textarea>
	 </td>
    </tr>
	<tr>
     <td width=20%>비밀 번호</td> 
     <td width=80%><input type=password name=pass size=15 maxlength=15>
      수정시에는 비밀번호가 필요합니다.</td>
    </tr>
	<tr>
     <td colspan=2 height=5><hr size=1></td>
    </tr>
	<tr>
     <td colspan=2>
	  <input type=Button value="수정완료" onClick="check()">
      <input type=reset value="다시수정"> 
      <input type=button value="뒤로" onClick="history.back()">
	 </td>
    </tr> 
   </table>
  </td>
 </tr>
</table>
</form> 
</center>
</body>
</html>