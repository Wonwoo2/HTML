<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	table{
		border : 2px solid blue;
	}
	td{
		width : 300px;
		height : 50px;
		padding : 5px;
		text-align : center;
		font-size : 1.5em;
	}
</style>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");

	String userName = request.getParameter("name");
	String userID = request.getParameter("id");
	String userPW = request.getParameter("pw");
	String userAddr = request.getParameter("addr");
	String userTel = request.getParameter("tel");
	String userGender = request.getParameter("gender");
	String fileName = request.getParameter("file");
	String img = request.getParameter("inputimg");
	String[] food = request.getParameterValues("food");
	
	String str = "";
	for (int i = 0; i < food.length; i ++) {
		str += food[i] + " ";
	}
%>
<%= userName %>
<%= userID %>
<%= userPW %>
<%= userAddr %>
<%= userTel %>
<%= userGender %>
<br>
<% for (int i = 0; i < food.length; i ++) { %>
	<%= food[i]%><br>
<%}%>
<%= fileName %>

<table border="1">
	<tr>
		<td>아이디</td>
		<td><%=userID %></td>
	</tr>
	<tr>
		<td>비밀번호</td>
		<td><%=userPW %></td>
	</tr>
	<tr>
		<td>이름</td>
		<td><%=userName %></td>
	</tr>
	<tr>
		<td>주소</td>
		<td><%=userAddr %></td>
	</tr>
	<tr>
		<td>전화번호</td>
		<td><%=userTel %></td>
	</tr>
	<tr>
		<td>성별</td>
		<td><%=userGender %></td>
	</tr>
	<tr>
		<td>좋아하는 음식</td>
		<td><%=str %></td>
	</tr>
	<tr>
		<td>파일</td>
		<td><%=fileName %></td>
	</tr>
	<tr>
		<td>이미지</td>
		<td><%=img %></td>
	</tr>
</table>
</body>
</html>