<%@ page contentType="text/html; charset=UTF-8"%>

<hr>
[꼬리말 내용]<br>

<jsp:useBean id="req" class="com.example.RequestBean" scope="request"></jsp:useBean>
<jsp:getProperty property="footer" name="req" />