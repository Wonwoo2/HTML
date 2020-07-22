package kr.or.ddit.member.controller;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.BEncoderStream;

import kr.or.ddit.member.service.IMemberService;
import kr.or.ddit.member.service.MemberServiceImpl;
import kr.or.ddit.member.vo.MemberVO;

/**
 * Servlet implementation class InsertMember
 */
@WebServlet("/InsertMember")
public class InsertMember extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertMember() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 클라이언트 요청시 전송되는 데이터를 받는다.
		request.setCharacterEncoding("UTF-8");
		
		MemberVO mv = new MemberVO();
		
		/*String id = request.getParameter("mem_id");
		String name = request.getParameter("mem_name");
		String pass = request.getParameter("mem_pass");
		String hp = request.getParameter("mem_hp");
		String email = request.getParameter("mem_mail");
		String zipCode = request.getParameter("mem_zip");
		String add1 = request.getParameter("mem_add1");
		String add2 = request.getParameter("mem_add2");
		
		mv.setMem_id(id);
		mv.setMem_name(name);
		mv.setMem_pass(pass);
		mv.setMem_hp(hp);
		mv.setMem_mail(email);
		mv.setMem_zip(zipCode);
		mv.setMem_add1(add1);
		mv.setMem_add2(add2);*/
		
		// serialize() 이용시 데이터 가져오는 방법
		// 1. form의 name 속성을 이용하여 가져온다.
		// String id = request.getParameter("mem_id");
		
		// beanUtil 라이브러리를 이용해서 자동 완성
		try {
			BeanUtils.populate(mv, request.getParameterMap());
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		// 2. service 객체 얻어오기
		IMemberService service = MemberServiceImpl.getInstance();
		
		// 3. 결과값 service.메소드 호출
		String resID = service.insertMember(mv);
		
		// 4. 결과값을 request에 저장
		request.setAttribute("result", resID);
		
		
		// 5. JSP로 forward - 20200720/Test01_Insert.jsp
		request.getRequestDispatcher("20200720/Test04_Insert.jsp").forward(request, response);
	}

}
