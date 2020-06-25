<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test</title>
</head>
<style>
	p{
		font-size: 20px;
		color: blue;
		background-color: yellow;
	}
</style>
<script type="text/javascript">
	function goBack() {
		location.href="Test01_Location객체.html";
	}
</script>
<body>
	<h1>JSP : Java Server Page</h1>
	클라이언트가 요청(전송)시 서버 내에서 실행되는 BackEnd 프로그램 <br>
	request 라는 내장 객체 변수를 가지고 값을 전달 받는다<br>
	<%
		String sname = request.getParameter("name");
	%>
	<br><%= sname %>님 환영합니다.
	<br>
	<a href="javascript:goBack()">뒤로</a>
</body>
</html>