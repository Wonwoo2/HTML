<%@page import="kr.or.ddit.member.vo.ZipVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
[
<%
	List<ZipVO> dongList = (List<ZipVO>) request.getAttribute("dongList");

	for (int i = 0; i < dongList.size(); i ++) {
		ZipVO zipVo = dongList.get(i);
		
		if(i > 0) {
			out.print(",");
		}
		
		String bunji = zipVo.getBunji(); 
		
		if(bunji == null) {
			bunji = "";
		}
%>
	{
			"code" : "<%= zipVo.getZipcode() %>",
			"addr" : "<%= zipVo.getSido() %> <%= zipVo.getGugun() %> <%= zipVo.getDong() %>",
			"bunji" : "<%= bunji %>"
	}
<%		
	}
%>
]
