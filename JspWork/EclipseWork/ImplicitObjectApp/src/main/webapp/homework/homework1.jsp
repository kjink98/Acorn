<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>homework1</title>
</head>
<body>
	<%
	request.setCharacterEncoding("UTF-8");
	String kor = request.getParameter("kor");
	String eng = request.getParameter("eng");
	String mat = request.getParameter("mat");

	int korScore = Integer.parseInt(kor);
	int engScore = Integer.parseInt(eng);
	int matScore = Integer.parseInt(mat);
	%>
	<%!public int avg(int score1, int score2, int score3) {
		int avg = (score1 + score2 + score3) / 3;
		return avg;
	}%>
	<%!public char grade(int avgScore) {
		char grade;

		if (avgScore >= 90) {
			grade = 'A';
		} else if (avgScore >= 80) {
			grade = 'B';
		} else if (avgScore >= 70) {
			grade = 'C';
		} else if (avgScore >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		return grade;
	}%>
	<%
	int avgScore = avg(korScore, engScore, matScore);
	char stdGrade = grade(avgScore);
	%>

	<ul>
		<li>당신의 성적입니다</li>
		<li>평균 : <%=avgScore%></li>
		<li>학점 : <%=stdGrade%></li>
	</ul>
</body>
</html>