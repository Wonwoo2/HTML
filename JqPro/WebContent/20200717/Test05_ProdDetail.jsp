<%@page import="kr.or.ddit.prod.vo.ProdVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
	ProdVO prodVo = (ProdVO) request.getAttribute("prodVo");
%>
	{
		"id" : "<%= prodVo.getProd_id() %>",
		"name" : "<%= prodVo.getProd_name() %>",
		"lgu" : "<%= prodVo.getProd_lgu() %>",
		"buyer" : "<%= prodVo.getProd_buyer() %>",
		"cost" : "<%= prodVo.getProd_cost() %>",
		"price" : "<%= prodVo.getProd_price() %>",
		"sale" : "<%= prodVo.getProd_sale() %>",
		"size" : "<%= prodVo.getProd_size() %>"
	}