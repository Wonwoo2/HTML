package kr.or.ddit.lprod.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.lprod.service.ILprodService;
import kr.or.ddit.lprod.service.LprodServiceImpl;
import kr.or.ddit.lprod.vo.LprodVO;

/**
 * Servlet implementation class LprodServlet
 */
@WebServlet("/LprodServlet")
public class LprodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LprodServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청시 전송되는 데이터를 받는다.
		
		// service객체를 얻어온다.
		ILprodService service = LprodServiceImpl.getInstance();
		
		// 서비스 메소드 호출 - 결과 값 리턴
		List<LprodVO> lprodList = service.getLprodList();
		
		// request에 결과 값을 저장
		request.setAttribute("lprodList", lprodList);
		
		// view페이지로 forward
		request.getRequestDispatcher("20200717/Test01_Lprod.jsp").forward(request, response);
	}
}
