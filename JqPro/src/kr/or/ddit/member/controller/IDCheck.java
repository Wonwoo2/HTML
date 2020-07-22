package kr.or.ddit.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.member.service.IMemberService;
import kr.or.ddit.member.service.MemberServiceImpl;

/**
 * Servlet implementation class IDCheck
 */
@WebServlet("/IDCheck")
public class IDCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IDCheck() {
        super();
    }
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 클라이언트 전송(요청시) 전달되는 데이터를 받는다. - mem_id
		request.setCharacterEncoding("UTF-8");
		String mem_id = request.getParameter("mem_id");
		
		// 2. service객체 얻어온다.
		IMemberService service = MemberServiceImpl.getInstance();
		
		// 3. 결과값 = service.메소드 호출
		String res_id = service.getMemberID(mem_id);
		
		// 4. 결과값을 request에 저장
		request.setAttribute("result", res_id);
		request.setAttribute("input", mem_id);
		
		// 5. JSP로 forword
		request.getRequestDispatcher("20200720/Test01_IDCheck.jsp").forward(request, response);
	}

	

}
