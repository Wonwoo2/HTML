package kr.or.ddit.prod.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.prod.service.IProdService;
import kr.or.ddit.prod.service.ProdServiceImpl;
import kr.or.ddit.prod.vo.ProdVO;

/**
 * Servlet implementation class ProdServlet
 */
@WebServlet("/ProdServlet.do")
public class ProdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProdServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 요청 시 전송되는 값을 받는다. - gu
		String gu = request.getParameter("gu");
		
		// 2. Service 객체 얻어오기 
		IProdService service = ProdServiceImpl.getInstance();
		
		// 3. service 메서드 호출하기 : 결과 값 받기
		List<ProdVO> prodList = service.getProdList(gu);
		
		// 4. 결과 값을 request에 저장하기
		request.setAttribute("prodList", prodList);
		
		// 5. jsp 페이지 forword : 결과 값 출력(json 데이터 생성)
		request.getRequestDispatcher("20200717/Test04_ProdName.jsp").forward(request, response);
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 요청 시 전송되는 값을 받는다. - gu
		String id = request.getParameter("id");

		// 2. Service 객체 얻어오기
		IProdService service = ProdServiceImpl.getInstance();

		// 3. service 메서드 호출하기 : 결과 값 받기
		ProdVO prodVo = service.getProd(id);

		// 4. 결과 값을 request에 저장하기
		request.setAttribute("prodVo", prodVo);

		// 5. jsp 페이지 forword : 결과 값 출력(json 데이터 생성)
		request.getRequestDispatcher("20200717/Test05_ProdDetail.jsp").forward(request, response);
	}
}
