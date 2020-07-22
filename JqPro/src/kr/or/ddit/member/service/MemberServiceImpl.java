package kr.or.ddit.member.service;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.member.dao.IMemberDao;
import kr.or.ddit.member.dao.MemberDaoImpl;
import kr.or.ddit.member.vo.MemberVO;
import kr.or.ddit.member.vo.ZipVO;

public class MemberServiceImpl implements IMemberService{
	private IMemberDao dao;
	
	private static IMemberService service;
	
	private MemberServiceImpl() {
		dao = MemberDaoImpl.getInstance();
	}
	
	public static IMemberService getInstance() {
		if(service == null) {
			service = new MemberServiceImpl();
		}
		return service;
	}
	
	@Override
	public String getMemberID(String id) {
		String mem_id = null;
		try {
			mem_id = dao.getMemberID(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return mem_id;
	}

	@Override
	public String insertMember(MemberVO mv) {
		String mem_id = null;
		try {
			mem_id = dao.insertMember(mv);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return mem_id;
	}

	@Override
	public List<MemberVO> getMemberList() {
		List<MemberVO> memList = null;
		try {
			memList = dao.getMemberList();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return memList;
	}

	@Override
	public List<ZipVO> getDongList(String dong) {
		List<ZipVO> dongList = null;
		try {
			dongList = dao.getDongList(dong);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dongList;
	}
}