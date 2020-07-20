package kr.or.ddit.lprod.service;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.lprod.dao.ILprodDao;
import kr.or.ddit.lprod.dao.LprodDaoImpl;
import kr.or.ddit.lprod.vo.LprodVO;

/**
 * Dao의 메소드 호출 => Dao 객체 필요
 * 여러 Controller에서 공유하여 사용할 수 있도록 자신의 객체 생성하여 리턴
 */
public class LprodServiceImpl implements ILprodService{
	private static ILprodService service;
	private ILprodDao dao;
	
	public static ILprodService getInstance() {
		if(service == null) {
			service = new LprodServiceImpl();
		}
		return service;
	}
	
	private LprodServiceImpl() {
		dao = LprodDaoImpl.getInstance();
	}

	@Override
	public List<LprodVO> getLprodList() {
		List<LprodVO> lprodList = null;
		
		try {
			lprodList = dao.getLprodList();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lprodList;
	}
}
