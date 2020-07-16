<%@page import="kr.or.ddit.member.vo.MemberVO"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.ibatis.config.SqlMapClientFactory"%>
<%@page import="com.ibatis.sqlmap.client.SqlMapClient"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
[
<%
	SqlMapClient smc = SqlMapClientFactory.getClient();
	
	List<MemberVO> mvList = smc.queryForList("member.getMemberList");
	
	for (int i = 0; i < mvList.size(); i ++) {
		MemberVO mv = mvList.get(i);
		
		if(i > 0) {
			out.print(",");
		}
%>
	{
		"name" : "<%= mv.getMem_name() %>",
		"hp" : "<%= mv.getMem_hp() %>",
		"addr" : "<%= mv.getMem_add1() %>",
		"mail" : "<%= mv.getMem_mail() %>"
	}
<%
	}
%>
]