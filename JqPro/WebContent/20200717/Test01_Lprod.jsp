<%@page import="kr.or.ddit.lprod.vo.LprodVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

[
<%
	List<LprodVO> lprodList = (List<LprodVO>) request.getAttribute("lprodList");

	for (int i = 0; i < lprodList.size(); i ++) {
		LprodVO lpVo = lprodList.get(i);
		
		if(i > 0) {
			out.print(",");
		}
%>
	{
			"id" : "<%= lpVo.getLprod_id() %>",
			"gu" : "<%= lpVo.getLprod_gu() %>",
			"name" : "<%= lpVo.getLprod_nm() %>"
	}
<%
	}
%>
]