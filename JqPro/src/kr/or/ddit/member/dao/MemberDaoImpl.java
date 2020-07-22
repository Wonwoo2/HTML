package kr.or.ddit.member.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.ibatis.config.SqlMapClientFactory;
import kr.or.ddit.member.vo.MemberVO;
import kr.or.ddit.member.vo.ZipVO;

public class MemberDaoImpl implements IMemberDao{
	private SqlMapClient smc;
	private static IMemberDao dao;
	
	private MemberDaoImpl() {
		smc = SqlMapClientFactory.getClient();
	}
	
	public static IMemberDao getInstance() {
		if(dao == null) {
			dao = new MemberDaoImpl();
		}
		return dao;
	}

	@Override
	public String getMemberID(String id) throws SQLException {
		return (String) smc.queryForObject("member.getMemberID", id);
	}

	@Override
	public String insertMember(MemberVO mv) throws SQLException {
		return (String) smc.insert("member.insertMember", mv);
	}

	@Override
	public List<MemberVO> getMemberList() throws SQLException {
		return smc.queryForList("member.getMemberList");
	}

	@Override
	public List<ZipVO> getDongList(String dong) throws SQLException {
		return smc.queryForList("member.getZipCode", dong);
	}
}