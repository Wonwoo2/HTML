<%@page import="kr.or.ddit.buyer.vo.BuyerVO"%>
<%@page import="kr.or.ddit.ibatis.config.SqlMapClientFactory"%>
<%@page import="com.ibatis.sqlmap.client.SqlMapClient"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%
	// 요청 시 전송되는 데이터 id 값을 가져온다.
	
	// SqlMapClient 객체 얻어오기
	SqlMapClient smc = SqlMapClientFactory.getClient();

	String buyerID = request.getParameter("id");
	
	// Mapper의 sql쿼리를 수행 하기
	BuyerVO bv = (BuyerVO) smc.queryForObject("buyer.getBuyer", buyerID);
	
	// JSON Object 결과를 생성한다.
%>

{
	"id" : "<%= bv.getBuyer_id() %>",
	"name" : "<%= bv.getBuyer_name() %>",
	"lgu" : "<%= bv.getBuyer_lgu() %>",
	"bank" : "<%= bv.getBuyer_bank() %>",
	"bankno" : "<%= bv.getBuyer_bankno() %>",
	"bankname" : "<%= bv.getBuyer_bankname() %>",
	"zip" : "<%= bv.getBuyer_zip() %>",
	"add1" : "<%= bv.getBuyer_add1() %>",
	"add2" : "<%= bv.getBuyer_add2() %>",
	"comtel" : "<%= bv.getBuyer_comtel() %>",
	"mail" : "<%= bv.getBuyer_mail() %>"
}
