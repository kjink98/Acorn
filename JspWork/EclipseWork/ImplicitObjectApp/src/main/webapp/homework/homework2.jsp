<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>homework2</title>
</head>
<body>
	<%
	request.setCharacterEncoding("UTF-8");
	String[] foods = request.getParameterValues("food");
	int totalPrice = 0;
	%>
	<ul>
		<li>당신이 주문한 상품의 합계입니다.</li>

		<%
		if (foods != null) {
			for (int i = 0; i < foods.length; i++) {
				int foodPrice = Integer.parseInt(foods[i]);
				totalPrice += foodPrice;
			}
		}
		%>
		<li>합계 : <%=totalPrice%></li>
	</ul>
</body>
</html>