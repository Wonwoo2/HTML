<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MemberJsp</title>
<style>
p {
	font-size : 1.5em;
	background : yellow;
}
</style>
</head>
<body>
<h1>JSP : Java Serve Page</h1>
<%
	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("nm");
	String id = request.getParameter("id");
%>
<p><%= name %>님 환영합니다.</p>
</body>
</html>