<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="test" class="mybean.BeanTest"></jsp:useBean>
	<jsp:setProperty property="name" name="test" value="홍길동"/>
	<jsp:setProperty property="price" name="test" value="100000"/>
	
	이름 : <jsp:getProperty property="name" name="test"/><br>
	가격 : <jsp:getProperty property="price" name="test"/><br>
	<hr>
	이름 : ${test.name } <br>
	가격 : ${test.price } <br>
	<hr>
	<a href="/ELJSTLApp/eltest.action?name=John">서블릿에게 요청</a>
</body>
</html>