package com.hostelmanagement.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.hostelmanagement.model.RoomDetails;
import com.hostelmanagement.service.FindingDetailsService;



@WebServlet(urlPatterns = "/RoomAvailabilityServlet")
public class RoomAvailabilityServlet extends HttpServlet {
	
    public RoomAvailabilityServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("reached");
	int sharing=Integer.parseInt(request.getParameter("value"));
	System.out.println(sharing);
	FindingDetailsService fd=new FindingDetailsService();
	RoomDetails rd=fd.Availability(sharing);
	/*Integer firstfloor=new Integer(rd.getFirstFlloor());
	Integer secondfloor=new Integer(rd.getSecondFloor());
	String ffloor=firstfloor.toString();
	String sfloor=secondfloor.toString();*/
	Map<String, Integer> map= new HashMap<>();
	map.put("sharing", rd.getSharing());
	map.put("firstfloor", rd.getFirstFlloor());
	map.put("secondfloor", rd.getSecondFloor());
	map.put("thirdfloor", rd.getThirdFloor());
	System.out.println(rd.getFirstFlloor());
	/*request.setAttribute("roomdetails", rd);
	
	request.getRequestDispatcher("/roomavailability.jsp").forward(request,response);*/
	
	 Gson gson = new Gson(); 
     /*JsonObject myObj = new JsonObject();
     JsonElement jsonObj = gson.toJsonTree(rd);*/
	 gson.toJson(map);
	// System.out.println(gson.toJson(map));
     response.getWriter().write(gson.toJson(map));
    
   // response.getWriter().write(gson);
   // myObj.add("roomdetails",jsonObj);
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
