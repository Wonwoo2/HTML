<%@page import="kr.or.ddit.prod.vo.ProdVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
[
<%
	List<ProdVO> prodList = (List<ProdVO>) request.getAttribute("prodList");

	for (int i = 0; i < prodList.size(); i ++) {
		ProdVO prodVo = prodList.get(i);
		
		if(i > 0) {
			out.print(",");
		}
%>
	{
			"id" : "<%= prodVo.getProd_id() %>",
			"name" : "<%= prodVo.getProd_name() %>"
	}
<%
	}
%>
]