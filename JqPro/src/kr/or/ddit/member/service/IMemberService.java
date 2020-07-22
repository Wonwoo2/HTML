package kr.or.ddit.member.service;

import java.util.List;

import kr.or.ddit.member.vo.MemberVO;
import kr.or.ddit.member.vo.ZipVO;

public interface IMemberService {
	public String getMemberID(String id);
	
	public String insertMember(MemberVO mv);
	
	public List<MemberVO> getMemberList();
	
	public List<ZipVO> getDongList(String dong); 
}
