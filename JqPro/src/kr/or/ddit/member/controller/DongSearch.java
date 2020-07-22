package kr.or.ddit.member.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.member.service.IMemberService;
import kr.or.ddit.member.service.MemberServiceImpl;
import kr.or.ddit.member.vo.ZipVO;

/**
 * Servlet implementation class DongSearch
 */
@WebServlet("/DongSearch")
public class DongSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DongSearch() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 클라이언트 요청시 전송되는 데이터 받아오기
		request.setCharacterEncoding("UTF-8");
		String dong = request.getParameter("dong");
		
		// 2. service 객체 얻어오기
		IMemberService service = MemberServiceImpl.getInstance();
		
		// 3. service 메서드 호출 - 결과
		List<ZipVO> dongList = service.getDongList(dong);
		
		// 4. 결과값을 request에 저장
		request.setAttribute("dongList", dongList);
		
		// 5. JSP로 forward
		request.getRequestDispatcher("20200720/Test03_DongList.jsp").forward(request, response);
	}

}
