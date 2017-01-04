package com.hostelmanagement.servlet;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hostelmanagement.model.Register;
import com.hostelmanagement.service.LoginService;

import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/LoginServlet.do")
public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("/login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		long mobileNum = Long.parseLong(request.getParameter("mobileNum"));
		String password = request.getParameter("password");

		LoginService loginServiceImpl = new LoginService();
		List<Register> list = loginServiceImpl.checkUserCredentials(mobileNum, password);
		System.out.println(list);
		request.setAttribute("list", list);
		System.out.println(request.getAttribute("list"));
		if (list.isEmpty() != true) {

			/*Iterator itr = list.iterator();
			while (itr.hasNext()) {

				Object[] obj = (Object[]) itr.next();
				request.setAttribute("firstName", obj[0]);   
			}
*/
			/*PrintWriter out = response.getWriter();
			out.println(list);*/
			request.getSession().setAttribute("mobileNum", mobileNum);
			/*request.getRequestDispatcher("/ResidentDetails.do").forward(request, response);*/
			response.sendRedirect("/ResidentDetails.do");
		} else {
			request.setAttribute("errorMessage", "Invalid Credentials!");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}

	}

}
