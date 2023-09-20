<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exam1.jsp</title>
</head>
<body>
	<jsp:include page="inc/header.jsp"></jsp:include>
	<%
		int i = 20;
	%>
	<%= i %>
	<h1>Welcome To My World</h1>
	<jsp:include page="inc/footer.jsp"></jsp:include>
	
	<%
		int j = 20;
	%>
	<%= j %>
	
	...
</body>
</html>