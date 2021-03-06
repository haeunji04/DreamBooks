package user.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import user.model.service.UserService;
import user.model.vo.CartExtends;

/**
 * Servlet implementation class OrderFailedServlet
 */
@WebServlet("/user/orderFailed")
public class OrderFailedServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderFailedServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userId = request.getParameter("userId");
		String orderNo = request.getParameter("orderNo");
		
		int result = new UserService().deleteOrder(orderNo);
		
		List<CartExtends> list = new UserService().selectCartList(userId);
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("/WEB-INF/views/customer/Cart.jsp").forward(request, response);


		
		
	}


}
