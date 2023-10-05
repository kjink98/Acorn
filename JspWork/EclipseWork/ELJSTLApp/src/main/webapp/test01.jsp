<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setAttribute("cnt1", 100);
	int cnt2 = (Integer)request.getAttribute("cnt1");
%>

<%= request.getAttribute("cnt1") %> <br>
<%= cnt2 %> <br>
<% out.println(cnt2); %> <br>
<!-- request에서 받아온거니 원래는 requestScope를 써야하는데 생략 가능함 -->
<!-- 생략을 하면 session -> pageContext -> request 처럼 순차적으로 검색함 -->
<!-- session에는 값이 없지만 null로 표현되지 않음. 이미 예외처리를 해놓음 -->
${cnt1}, ${requestScope.cnt1}, ${sessionScope.cnt1 } <br>

<%= session.getAttribute("cnt1") %>

${requestScope["cnt1"]}
<!-- 지역변수는 안됨. el이 다 되는건 아니다. -->
<!-- 그렇다고 null값은 안나옴. 예외처리 -->
${cnt2 }
</body>
</html>