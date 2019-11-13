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
		// 接受数据
		String username = request.getParameter("username");
		String userpwd = request.getParameter("userpwd");// springmvc
		// 处理数据
		UserBean u = new UserBean();// spring 反轉注入
		// ----UserBean ----交给业务逻辑层进行处理
		// 控制跳转
		boolean b = uservice.addUser(u);
		if (b) {
			//传输数据到前台页面
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
