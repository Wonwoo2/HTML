<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String res = (String) request.getAttribute("result");
	String input = (String) request.getAttribute("input");

	if(res == null) {
%>
	{
		"id" : "<%= input %> 사용가능한 아이디입니다."
	}

<%		
	} else {
%>
	{
		"id" : "<%= res %> 사용불가능한 아이디입니다."
	}
<%		
	}
%>
