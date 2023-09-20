<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	// 그냥 변수에 저장
	String addr = "서울시 강남구";
	// pageContext.SESSION_SCOPE 옵션: session에 저장 시키겠다
	pageContext.setAttribute("addr", "서울시 종로구", pageContext.SESSION_SCOPE);
%>

	<!-- 세션에 저장했기 때문에 pageContext의 값은 널이 나옴 -->
	주소 : <%=pageContext.getAttribute("addr") %>
</body>
</html>