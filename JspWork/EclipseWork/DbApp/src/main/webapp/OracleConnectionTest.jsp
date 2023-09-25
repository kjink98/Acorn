<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>오라클 DB연결 테스트</h1>
	<%
		// 이 클래스를 메모리에 올려 놓겠다.
		// 이게 잘 올라가면 JDBC가 동작하는 것.
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// oracle에 등록돼있는 url @DB주소:포트번호@DB기본이름
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		// 연결 객체 만들기
		Connection conn = DriverManager.getConnection(url, "scott", "1111");
	%>
	
	DB 연결 주소 : <%= conn %>
</body>
</html>