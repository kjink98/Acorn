<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sessionExam.jsp</title>
</head>
<body>
	<h1>세션을 이용한 타이머</h1>
	<jsp:useBean id="timer" class="com.example.SessionBean" scope="session"></jsp:useBean>
	세션 시작입니다. 타이머 작동을 시작합니다.
	<br><br>
	
	bean의 프로퍼티를 마지막으로 접근한 뒤에 경과한 시간은 
	<jsp:getProperty property="elapsedTimeAfterLastAccess" name="timer"/>	
	초 입니다.<br><br>
	
	<jsp:setProperty property="restart" name="timer" param="restart"/>
	타이머를 리셋한 뒤에 경과한 시간은  
	<jsp:getProperty property="elapsedTime" name="timer"/>
	초 입니다. <br><br>
	
	타이머가 시작한 뒤에 경과된 시간은
	<jsp:getProperty property="elapsedTimeAfterInst" name="timer"/>	  
	초 입니다. <br><br>
	
	<form action="sessionExam.jsp" method="post">
		<input type="submit" name="check" value="경과시간 확인" />
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="submit" name="restart" value="타이머 리셋" />
		
	</form>
</body>
</html>

<!-- 
className : com.example.SessionBean
name r/w datatype explain
---------------------------------------------------------
elapsedTime r long 타이머 리셋 후 경과시간
restart w boolean 타이머 리셋
elapsedTimeAfterInst r long 객체 생성 후 경과시간
elapsedTimeAfterLastAcess r long 마지막 접근 후 경과시간
-->