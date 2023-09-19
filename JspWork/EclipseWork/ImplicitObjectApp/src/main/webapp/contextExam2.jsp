<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>contextExam2.jsp</h1>
	<h2>session 값을 확인</h2>
	<%=	session.getAttribute("i")%>
	
	<h2>application 값 확인</h2>
	<%=	application.getAttribute("i")%>
	
	<h2>pageContext 값 확인</h2>
	<%=	pageContext.getAttribute("i")%>
	<!-- 같은 페이지가 아니여서 안나옴 -->
</body>
</html>