<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- useBean은 한 번만 실행되기 때문에 -->
	<jsp:useBean id="dice" class="com.example.DiceBean" scope="page">
		<jsp:setProperty property="min" name="dice" value="1"/>
		<jsp:setProperty property="max" name="dice" value="6"/>
		<h1>주사위 굴리기 예제</h1>
		<h3>주사위 눈금은 <jsp:getProperty property="randomNumber" name="dice"/> 입니다.</h3>
	</jsp:useBean>
	
	<form method="post" action="dice.jsp">
		<input type="submit" value="다시 굴리기" />
	</form>
</body>
</html>
<!-- 
	Bean ClassName : com.example.DiceBean
	property spec.
	name			r/w				DataType			explain
	-------------------------------------------------------------
	randomNumber	r				int					임의의 값 생성
	max				r/w				int					생성가능한 최대값
	min				r/w				int					생성가능한 최소값
		
 -->