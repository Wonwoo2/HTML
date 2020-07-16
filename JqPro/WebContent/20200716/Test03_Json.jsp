<%@page import="kr.or.ddit.member.vo.MemberVO"%>
<%@page import="kr.or.ddit.ibatis.config.SqlMapClientFactory"%>
<%@page import="com.ibatis.sqlmap.client.SqlMapClient"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
	SqlMapClient smc = SqlMapClientFactory.getClient();
	
	String memID = request.getParameter("id");
	MemberVO mv = (MemberVO) smc.queryForObject("member.getMember", memID);
%>

	{
		"name" : "<%= mv.getMem_name() %>",
		"hp" : "<%= mv.getMem_hp() %>",
		"zip" : "<%= mv.getMem_zip() %>",
		"addr" : "<%= mv.getMem_add1() %>"
	}
