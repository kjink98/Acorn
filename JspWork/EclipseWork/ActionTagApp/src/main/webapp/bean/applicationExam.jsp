<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>전체 방문자 카운터</h1>
	<jsp:useBean id="cnt" class="com.example.ApplicationBean" scope="application"></jsp:useBean>
	<%
		if(session.isNew()){
	%>
	<jsp:setProperty property="counter" name="cnt" value="0"/>
	<%
		}
	%>
	방문자 수 :   
	<jsp:getProperty property="counter" name="cnt"/>
	명
	
	<form action="applicationExam.jsp" method="post">
		<input type="submit" name="check" value="새로고침" />
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="submit" name="restart" value="카운터 리셋" />
	</form>
</body>
</html>