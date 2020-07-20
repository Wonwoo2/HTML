package kr.or.ddit.lprod.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.ibatis.config.SqlMapClientFactory;
import kr.or.ddit.lprod.vo.LprodVO;

/**
 * Mapper(lprod.mxl)에 접근해서 sql 쿼리문을 수행
 * SqlMapClient 객체 필요
 * 여러 서비스에서 공유해서 사용할 자신의 객체를 생성하여 리턴
 */
public class LprodDaoImpl implements ILprodDao {
	private static ILprodDao dao;
	private SqlMapClient smc;
	
	private LprodDaoImpl() {
		smc = SqlMapClientFactory.getClient(); 
	}
	
	public static ILprodDao getInstance() {
		if(dao == null) {
			dao = new LprodDaoImpl();
		}
		return dao;
	}
	
	@Override
	public List<LprodVO> getLprodList() throws SQLException {
		return smc.queryForList("lprod.getLprodList");
	}

}