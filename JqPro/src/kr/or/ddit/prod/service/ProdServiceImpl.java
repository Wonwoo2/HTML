package kr.or.ddit.prod.service;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.prod.dao.IProdDao;
import kr.or.ddit.prod.dao.ProdDaoImpl;
import kr.or.ddit.prod.vo.ProdVO;

public class ProdServiceImpl implements IProdService {

	private static IProdService service;
	private IProdDao dao;
	
	public static IProdService getInstance() {
		if(service == null) {
			service = new ProdServiceImpl();
		}
		return service;
	}
	
	private ProdServiceImpl() {
		dao = ProdDaoImpl.getInstance();
	}
	
	@Override
	public List<ProdVO> getProdList(String prod_lgu) {
		List<ProdVO> prodList = null;
		try {
			prodList = dao.getProdList(prod_lgu);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return prodList;
	}

	@Override
	public ProdVO getProd(String prod_id) {
		ProdVO prodVo = null;
		
		try {
			prodVo = dao.getProd(prod_id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return prodVo;
	}

}
