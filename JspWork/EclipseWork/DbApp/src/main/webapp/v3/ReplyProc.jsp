<%@ page contentType="text/html; charset=UTF-8"%>
<jsp:useBean id="dao" class="mybean.BoardDao"></jsp:useBean>
<jsp:useBean id="dto" class="mybean.Board"></jsp:useBean>

<%
	request.setCharacterEncoding("utf-8");
%>

<jsp:setProperty property="*" name="dto"/>
<%
	dao.setBoard(dto);
	response.sendRedirect("List.jsp");
%>