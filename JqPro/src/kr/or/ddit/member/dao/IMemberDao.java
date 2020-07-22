package kr.or.ddit.member.dao;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.member.vo.MemberVO;
import kr.or.ddit.member.vo.ZipVO;

public interface IMemberDao {
	
	public String getMemberID(String id) throws SQLException;
	
	public String insertMember(MemberVO mv) throws SQLException;
	
	public List<MemberVO> getMemberList() throws SQLException;
	
	public List<ZipVO> getDongList(String dong) throws SQLException; 
}