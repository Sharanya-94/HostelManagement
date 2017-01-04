package com.hostelmanagement.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hostelmanagement.service.AdminLoginService;

/**
 * Servlet implementation class AdminLoginServlet
 */
@WebServlet("/AdminLoginServlet.do")
public class AdminLoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("2");
		

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("1");
		long mobileNum =  Long.parseLong(request.getParameter("mobileNum"));
		String password = request.getParameter("password");
		AdminLoginService ads=new AdminLoginService();
		boolean result=ads.checkUserCredentials(mobileNum, password);
		System.out.println(result);
		if(result==true){
			
			request.getRequestDispatcher("/AdminHomeServlet").forward(request, response);
			
		}
		else
{
			
			request.getRequestDispatcher("/home.jsp").forward(request, response);
			
		}
		
	}

}
