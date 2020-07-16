<%@page import="kr.or.ddit.buyer.vo.BuyerVO"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.ibatis.config.SqlMapClientFactory"%>
<%@page import="com.ibatis.sqlmap.client.SqlMapClient"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
[
<%
	SqlMapClient smc = SqlMapClientFactory.getClient();
	
	List<BuyerVO> buyerList = smc.queryForList("buyer.getBuyerList");
	
	for (int i = 0; i < buyerList.size(); i ++) {
		BuyerVO bVo = buyerList.get(i);
		if(i > 0) {
			out.print(",");
		}
%>
	{
		"id" : "<%= bVo.getBuyer_id() %>",
		"name" : "<%= bVo.getBuyer_name() %>"
	}
<%
	}
%>
]