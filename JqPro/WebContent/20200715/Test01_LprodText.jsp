<%@page import="kr.or.ddit.lprod.vo.LprodVO"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.ibatis.config.SqlMapClientFactory"%>
<%@page import="com.ibatis.sqlmap.client.SqlMapClient"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	// SqlMapClient 객체 얻어오기
	SqlMapClient smc = SqlMapClientFactory.getClient();
	
	// SQL 쿼리 SELECT 실행 하기
	List<LprodVO> list = smc.queryForList("lprod.getLprodList");
	
	// 결과값으로 응답 데이터 text형태의 데이터를 생성
	String str = "";
	for (int i = 0; i < list.size(); i ++) {
		LprodVO lpVo = list.get(i);
		if(i > 0) {
			str += ",";
		}
		
		str += lpVo.getLprod_nm();
	}
%>
<%= str %>