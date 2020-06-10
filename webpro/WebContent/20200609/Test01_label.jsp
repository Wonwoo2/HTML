<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../CSS/myCSS.css">

<style>

   table{
      border : 2px solid blue;
   }
   td{
      width : 200px;
      height : 40px;
      padding : 2px;
      text-align : center;
      font-size : 1.2em;
   }


</style>
</head>
<body>
<h3>클라이언트 전송시 입력한 데이터값을 전달 받는다.</h3>
<p> request.getParameter('name이름')</p>
<%
   request.setCharacterEncoding("UTF-8");
   
   //클라이언트 전송시 입력한 데이터값을 전달 받는다.
   String vName = request.getParameter("name");
   String vId = request.getParameter("id");
   String vPass = request.getParameter("pass");
   String vAddr = request.getParameter("addr");
   String vTel = request.getParameter("tel");
%>

<table border="1">
   <tr>
      <td>아이디</td>
      <td><%= vId %></td>
   </tr>
   
   <tr>
      <td>이름</td>
      <td><%= vName %></td>
   </tr>
   
   <tr>
      <td>비밀번호</td>
      <td><%= vPass %></td>
   </tr>
   
   <tr>
      <td>주소</td>
      <td><%= vAddr %></td>
   </tr>
   
   <tr>
      <td>번호</td>
      <td><%= vTel %></td>
   </tr>
</table>
</body>
</html>