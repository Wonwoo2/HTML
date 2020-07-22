<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String resID = (String) request.getAttribute("result");

	if(resID != null) {
%>
	{
		"id" : "<%= resID %> 님 가입을 성공하셨습니다."
	}
<%
	} else {
%>
	{
		"id" : "가입을 실패하셨습니다."
	}
<%
	}
%>