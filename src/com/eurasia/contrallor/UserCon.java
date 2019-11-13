package com.eurasia.contrallor;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eurasia.bean.UserBean;
import com.eurasia.service.UserService;
import com.eurasia.service.UserServiceImpl;

/**
 * Servlet implementation class UserCon
 */
@WebServlet("/UserCon")
public class UserCon extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserService uservice =new UserServiceImpl();
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserCon() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// ��������
		String username = request.getParameter("username");
		String userpwd = request.getParameter("userpwd");// springmvc
		// ��������
		UserBean u = new UserBean();// spring ���Dע��
		// ----UserBean ----����ҵ���߼�����д���
		// ������ת
		boolean b = uservice.addUser(u);
		if (b) {
			//�������ݵ�ǰ̨ҳ��
			request.getSession().setAttribute("user", username);
			request.getRequestDispatcher("jsps/sys/ok.jsp").forward(request, response);
		} else {
			response.sendRedirect("jsps/sys/user.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
