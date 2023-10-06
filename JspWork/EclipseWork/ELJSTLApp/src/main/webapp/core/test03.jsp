<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String[] foods = {"불고기", "오므라이스", "짜장면"};
	request.setAttribute("foods", foods);
%>

<%
	String[] arrFoods = (String[])request.getAttribute("foods");

	for(int i = 0; i<arrFoods.length; i++){
%>
	<%=arrFoods[i] %>
<%
	}
%>
<br>

<c:forEach begin="0" end="3" step="1" var="i">
	${foods[i] }
</c:forEach>
<br>
<c:forEach var="food" items="${requestScope.foods}">
	${food }
</c:forEach>
<hr>
<c:set var="guests" value="토끼/거북이*너구리-호랑이,기린"></c:set>
<c:forTokens items="${guests }" delims="/*-," var="token">
	${token }
</c:forTokens>

<c:redirect url="test04.jsp">
	<c:param name="irum" value="신돌석"></c:param>
	<c:param name="age" value="40세"></c:param>
</c:redirect>
</body>
</html>