<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<body>
	<h2>Hello World!</h2>

	<ul>
		<li><a href="/first">first.jsp를 보여주세요</a></li>
		<li><a href="/second?p1=apple&p2=grape">second.jsp를 보여주세요</a></li>
	</ul>
	<br><br>
	<form method="post" action="/third">
		<input type="text" name="name"/><br>
		<input type="text" name="age"/><br>
		<input type="text" name="point"/><br>
		<input type="submit" name="전송"/><br>
	</form>
	
	<br><br>
	<form method="get" action="/fourth">
		<input type="text" name="name"/><br>	
		<input type="text" name="age"/><br>
		<input type="text" name="point"/><br>
		<input type="checkbox" name="chk" value="check" />동의 여부<br>
		<input type="submit" name="전송"/><br>
	</form>
	
	<br><br>
	<a href="/fifth">5</a>
</body>
</html>