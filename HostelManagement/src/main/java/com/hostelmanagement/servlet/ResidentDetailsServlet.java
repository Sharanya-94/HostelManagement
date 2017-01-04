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
import com.hostelmanagement.service.LoginService;

/**
 * Servlet implementation class ResidentDetails
 */
@WebServlet("/ResidentDetails.do")
public class ResidentDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResidentDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*System.out.println(request.getAttribute("list"));
		List<Register> list = (List<Register>) request.getAttribute("list");*/
		
		LoginService loginServiceImpl = new LoginService();
		
		long mobileNum = (long) request.getSession().getAttribute("mobileNum");
		List<Register> list = loginServiceImpl.getUserDetails(mobileNum);
		if (list.isEmpty() != true) {

			Iterator itr = list.iterator();
			while (itr.hasNext()) {

				Object[] obj = (Object[]) itr.next();
				
				
				request.setAttribute("firstName", obj[0]);   
				request.setAttribute("firstName", obj[0]);
				request.setAttribute("lastName", obj[1]);
				request.setAttribute("email", obj[2]);
				request.setAttribute("city", obj[4]);
				/*request.setAttribute("mobileNum", obj[3]);*/
				request.setAttribute("date", obj[5]);
				request.setAttribute("roomNum", obj[6]);
				request.setAttribute("advancePaid", obj[7]);
			}
			request.getRequestDispatcher("/residantdetails.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
