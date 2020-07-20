package kr.or.ddit.prod.service;

import java.util.List;

import kr.or.ddit.prod.vo.ProdVO;

public interface IProdService {
	public List<ProdVO> getProdList(String lprod_gu);
	
	public ProdVO getProd(String prod_id);
}
