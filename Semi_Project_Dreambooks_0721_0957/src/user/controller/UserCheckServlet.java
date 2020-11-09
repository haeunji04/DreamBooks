package user.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.util.Utils;
import user.model.service.UserService;
import user.model.vo.Users;

/**
 * Servlet implementation class UserCheckServlet
 */
@WebServlet("/mypage/usercheck")
public class UserCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserCheckServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.getRequestDispatcher("/WEB-INF/views/customer/updateCustomerChk.jsp")
			   .forward(request, response);
	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//여기에 보안을 위한 비밀번호 입력 후 폼 제출 시(확인 클릭) 처리할 코드 구현할 것
		//로그인 된 사용자의 아이디를 가져와서(UserLoggedIn.getUserId), DB에서 꺼내고(users 객체 타입으로)
		//users.getPassword()랑 사용자 입력값이랑 같으면 성공, updateCustomer.jsp로 연결
		//같지 않다면 다시 updateCustomerChk.jsp로 돌아가기
		
		//1. 사용자 입력값 처리
		String userId = request.getParameter("userId");
		//String password = request.getParameter("password");
		String password = Utils.getEncryptedPassword(request.getParameter("password"));
		//System.out.println("userIdchk@servlet = "+ userId);
		//System.out.println("사용자가 입력한 password = "+ password);

		//2. 업무로직
		Users u = new UserService().selectOne(userId);
		//System.out.println("u@servelt = " + u);
		//System.out.println("디비 u.getPassword()값  = " +u.getPassword());
		
		//3. view단 처리 중
		String msg = "";
		String loc = "/";
		
		if(password.equals(u.getPassword())) {
			msg =  "비밀번호 일치합니다!!";
			loc =  "/user/userupdate?userId="+userId;

		}
		else {
			//msg.jsp
			msg = "비밀번호가 일치하지 않습니다";
			loc = "/mypage/usercheck";			
		}
			
		request.setAttribute("msg", msg);
		request.setAttribute("loc", loc);
		request.getRequestDispatcher("/WEB-INF/views/common/popup.jsp")
		.forward(request, response);			
	}

}