package com.hostelmanagement.servlet;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hostelmanagement.model.Register;
import com.hostelmanagement.service.AdminHomeDataService;

/**
 * Servlet implementation class AdminServlet
 */
@WebServlet("/AdminHomeServlet")
public class AdminHomeServlet extends HttpServlet {
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List l=new AdminHomeDataService().registrationDetails();
		System.out.println(l.size());
		Iterator i=l.iterator();
		while(i.hasNext()){
			
			Object[] r=(Object[])i.next();
			System.out.println(r[0]);
		}
		request.setAttribute("details", l);
		request.getRequestDispatcher("/adminhome.jsp").forward(
				request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
