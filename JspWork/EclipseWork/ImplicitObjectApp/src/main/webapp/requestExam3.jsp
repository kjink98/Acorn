<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Date today = (Date)request.getAttribute("currentDate");
	%>
	오늘은 <%=today %> 입니다.
	<br><br>
	
	<%
	// request안에다 값 넣어 주기
		request.setAttribute("currentDate", new Date());
		today = (Date)request.getAttribute("currentDate");
	%>
	오늘은 <%=today %> 입니다.
	<br><br>
	
	<%
	// 삭제
		request.removeAttribute("currentDate");
		today = (Date)request.getAttribute("currentDate");
	%>
	오늘은 <%=today %> 입니다.
</body>
</html>