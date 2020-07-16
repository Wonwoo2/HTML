<%@page import="kr.or.ddit.member.vo.MemberVO"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.ibatis.config.SqlMapClientFactory"%>
<%@page import="com.ibatis.sqlmap.client.SqlMapClient"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%--  --%>

[
<%
	// ibatis mapper 파일 실행하기 위한 SqlMapClient객체
	SqlMapClient smc = SqlMapClientFactory.getClient();
	
	// member.xml의 select 구문을 실행
	List<MemberVO> list = smc.queryForList("member.getMemberList");

	for (int i = 0; i < list.size(); i ++) {
		MemberVO mv = list.get(i);
		if (i > 0) {
			out.print(",");
		}
%>
		{
			"id" : "<%= mv.getMem_id() %>",
			"name" : "<%= mv.getMem_name() %>",
			"hp" : "<%= mv.getMem_hp() %>",
			"mail" : "<%= mv.getMem_mail() %>",
			"addr" : "<%= mv.getMem_add1() %> <%= mv.getMem_add2() %>" 
		}
<%
	}
%>
]