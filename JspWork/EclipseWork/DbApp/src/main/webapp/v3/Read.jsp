<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="mybean.BoardDao"%>
<%@ page import="mybean.Board"%>
<html>
<head>
<title>JSPBoard</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>

<body>
	<%
	String b_num = request.getParameter("b_num");
	
	// DB로 부터 가져올 변수
	String name = "";
	String regdate = "";
	String email = "";
	String home = "";
	String subject = "";
	String content = "";
	String ip = "";
	int count = 0;
	
	BoardDao dao = new BoardDao();
	Board dto = dao.getBoard(b_num);
	
	
	name = dto.getB_name();
	regdate = dto.getB_regdate();
	email = dto.getB_email();
	home = dto.getB_homepage();
	subject = dto.getB_subject();
	content = dto.getB_content();
	ip = dto.getB_ip();
	count = dto.getB_count();
	
	%>
	<br>
	<br>
	<table align=center width=70% border=0 cellspacing=3 cellpadding=0>
		<tr>
			<td bgcolor=9CA2EE height=25 align=center class=m>글읽기</td>
		</tr>
		<tr>
			<td colspan=2>
				<table border=0 cellpadding=3 cellspacing=0 width=100%>
					<tr>
						<td align=center bgcolor=#dddddd width=10%>이 름</td>
						<td bgcolor=#ffffe8><%=name %></td>
						<td align=center bgcolor=#dddddd width=10%>등록날짜</td>
						<td bgcolor=#ffffe8><%=regdate %></td>
					</tr>
					<tr>
						<td align=center bgcolor=#dddddd width=10%>메 일</td>
						<td bgcolor=#ffffe8><%=email %></td>
						<td align=center bgcolor=#dddddd width=10%>홈페이지</td>
						<td bgcolor=#ffffe8><a href="http://<%=home %>" target="_new">http://<%=home %></a></td>
					</tr>
					<tr>
						<td align=center bgcolor=#dddddd>제 목</td>
						<td bgcolor=#ffffe8 colspan=3><%=subject %></td>
					</tr>
					<tr>
						<td colspan=4><%=content%></td>
					</tr>
					<tr>
						<td colspan=4 align=right>
						<%=ip %>로 부터 글을 남기셨습니다./ 조회수 : <%=count%></td>
					</tr>
				</table>
			</td>
		</tr>
		<tr>
			<td align=center colspan=2>
				<hr size=1> [ <a href="javascript:list()">목 록</a> 
				| <a href="Update.jsp?b_num=<%=b_num%>">수 정</a> | 
				<a href="Delete.jsp?b_num=<%=b_num%>">삭 제</a> ]<br>
			</td>
		</tr>
	</table>
</body>
</html>
