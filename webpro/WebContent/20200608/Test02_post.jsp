<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	span{
		red;
	}
	.uid{
		color : blue;
	}
</style>
</head>
<body>
<p>클라이언트 전송(요청)시 id와 password를 가져온다.</p>
<p>post 방식으로 데이터를 전달받는다</p>
<%
	request.setCharacterEncoding("UTF-8");
	String userID = request.getParameter("id");
	String userPW = request.getParameter("pw");
	
	// db와 연결해서 CRUD처리한다.
	// 작업한 결과를 출력한다.
	out.print("<span class='uid'>" + userID + "</span>님 <span class='ms'>즐거운 하루 되세요</span><br>");
%>
<br>
<br>
<span class="uid"><%= userID %> </span>님 <span class="ms">행복하세요!</span>

</body>
</html>