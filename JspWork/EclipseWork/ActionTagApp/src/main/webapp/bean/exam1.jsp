<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.Calendar" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>간단한 Bean예제</h2>
	<jsp:useBean id="cal" class="com.example.CalendarBean" />
	<h3>오늘은 <jsp:getProperty property="year" name="cal"/> 년 &nbsp;
		<jsp:getProperty property="month" name="cal"/>월 &nbsp;
		<jsp:getProperty property="date" name="cal"/>일 입니다.</h3>
</body>
</html>