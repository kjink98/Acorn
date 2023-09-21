<%@ page contentType="text/html; charset=UTF-8"%>

[머리말 내용]<br>
<jsp:useBean id="req" class="com.example.RequestBean" scope="request"></jsp:useBean>
<jsp:getProperty property="header" name="req" />
<hr>