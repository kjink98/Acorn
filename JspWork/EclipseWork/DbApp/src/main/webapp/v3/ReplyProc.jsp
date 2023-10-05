<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="mybean.Board" %>
<jsp:useBean id="dao" class="mybean.BoardDao"></jsp:useBean>
<jsp:useBean id="dto" class="mybean.Board"></jsp:useBean>

<%
	request.setCharacterEncoding("utf-8");
%>

<jsp:setProperty property="*" name="dto"/>
<%
	// 부모글의 정보를 가져오기
	Board parent = dao.getBoard(dto.getB_num());

	// 부모 글의 pos보다 낮은 글의 pos 증가
	dao.replyUpdatePos(parent);
	
	// 답글 작성 시 부모 글의 pos와 depth 정보를 자식(답글) 글에 설정
	dto.setPos(parent.getPos());
	dto.setDepth(parent.getDepth());
	
	// 답글 달기
	dao.replyBoard(dto);
	response.sendRedirect("List.jsp");
%>