<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<%!
	<!-- 변수 선언 -->
	java.util.Date today;
%>
<body>
    <h1>Welcome To jingwang's Homepage</h1>
	<%
		today = new java.util.Date();
	%>
	<h3> 오늘은 <%=today%> 입니다. </h3>
</body>
</html>