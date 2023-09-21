<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.example.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="simple1" class="com.example.MessageBean" />
	<jsp:setProperty property="message" name="simple1" value="간단한 빈 예제입니다."/>
	메시지 : <jsp:getProperty property="message" name="simple1"/>
	<hr>
	<%
		MessageBean simple2 = new MessageBean();
		simple1.setMessage("이것은 스트립트릿으로 작성된 구문입니다.");
		simple2.setMessage("이것은 스트립트릿으로 생성된 객체입니다.");
	%>
		메시지 : <%= simple1.getMessage() %><br>
		메시지 : <%= simple2.getMessage() %>
	
</body>
</html>

<!-- 
	Bean ClassName : com.example.MessageBean
	
	Property Spec.
	---------------
	name			r/w				DataType			explain
	--------------------------------------------------------------
	message			r/w				String				메시지를 저장하고 가져오는 기능
	
 -->