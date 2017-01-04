package com.hostelmanagement.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hostelmanagement.service.RoomAvailabilityUpdateService;

/**
 * Servlet implementation class RoomAvailabilityUpadate
 */
@WebServlet("/RoomAvailabilityUpadate")
public class RoomAvailabilityUpdateServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
System.out.println(Integer.parseInt(request.getParameter("sharing")));
System.out.println(Integer.parseInt(request.getParameter("floor1")));
System.out.println(Integer.parseInt(request.getParameter("floor2")));
System.out.println(Integer.parseInt(request.getParameter("floor3")));


		int sharing=Integer.parseInt(request.getParameter("sharing"));
		int floor1=Integer.parseInt(request.getParameter("floor1"));
		int floor2=Integer.parseInt(request.getParameter("floor2"));
		int floor3=Integer.parseInt(request.getParameter("floor3"));
		RoomAvailabilityUpdateService ru=new RoomAvailabilityUpdateService();
		ru.roomsUpdate(sharing, floor1, floor2, floor3);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
