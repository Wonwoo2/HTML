package kr.or.ddit.prod.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.ibatis.config.SqlMapClientFactory;
import kr.or.ddit.prod.vo.ProdVO;

public class ProdDaoImpl implements IProdDao {
	
	private SqlMapClient smc;
	private static IProdDao dao;
	
	private ProdDaoImpl() {
		smc = SqlMapClientFactory.getClient();
	}
	
	public static IProdDao getInstance() {
		if(dao == null) {
			dao = new ProdDaoImpl();
		}
		return dao;
	}
	
	@Override
	public List<ProdVO> getProdList(String prod_gu) throws SQLException {
		return smc.queryForList("prod.getProdList", prod_gu);
	}

	@Override
	public ProdVO getProd(String prod_id) throws SQLException {
		return (ProdVO) smc.queryForObject("prod.getProd", prod_id);
	}

}
