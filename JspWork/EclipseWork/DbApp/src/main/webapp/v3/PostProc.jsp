<%@ page contentType="text/html; charset=UTF-8"%>
<jsp:useBean id="dao" class="mybean.BoardDao"></jsp:useBean>
<jsp:useBean id="dto" class="mybean.Board"></jsp:useBean>

<%
	request.setCharacterEncoding("utf-8");
%>
<!-- 액션태그 -->
<!-- <jsp:setProperty property="b_name" name="dto" />
<jsp:setProperty property="b_email" name="dto" />
<jsp:setProperty property="b_homepage" name="dto" />
<jsp:setProperty property="b_subject" name="dto" />
<jsp:setProperty property="b_content" name="dto" />
<jsp:setProperty property="b_pass" name="dto"/>
<jsp:setProperty property="b_ip" name="dto"/> -->

<jsp:setProperty property="*" name="dto"/>
<%
	//String name = request.getParameter("name");
	//String email = request.getParameter("email");
	//String home = request.getParameter("homepage");
	//String subject = request.getParameter("subject");
	//String content = request.getParameter("content");
	//String pass = request.getParameter("pass");
	
	//dto에 담아주기
	// 자바코드 대신 액션태그도 사용가능
	//dto.setB_name(name);
	//dto.setB_email(email);
	//dto.setB_homepage(home);
	//dto.setB_subject(subject);
	//dto.setB_content(content);
	//dto.setB_pass(pass);
	//dto.setB_ip(request.getRemoteAddr());
	
	dao.setBoard(dto);
	
	response.sendRedirect("List.jsp");
%>