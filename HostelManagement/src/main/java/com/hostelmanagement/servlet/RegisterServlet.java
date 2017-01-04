package com.hostelmanagement.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.hostelmanagement.service.LoginService;
import com.hostelmanagement.service.RegisterService;


@WebServlet("/RegisterServlet.do")
public class RegisterServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
   
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/registration.jsp").forward(
				request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		/*InputStream inputStream = null;*/
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		String city = request.getParameter("city");
		System.out.println(request.getParameter("mobileNum"));
		long mobileNum = Long.parseLong(request.getParameter("mobileNum"));
		int roomNum = Integer.parseInt(request.getParameter("roomNum"));
		float advancepaid = Float.parseFloat(request.getParameter("advancePaid"));
		Date joiningDate = new Date();
		try {
			joiningDate = new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("JD"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 /*		Part idProof = request.getPart("idProof");
*/		
		/*if(idProof != null){
			 inputStream = idProof.getInputStream();
		}
		*/
		RegisterService rs = new RegisterService();
		rs.insertNewRegister(firstName, lastName, email, pwd, city, mobileNum, joiningDate, roomNum, advancepaid);
		request.setAttribute("successMessage", "Registered Successfully");
		request.getRequestDispatcher("/registration.jsp").forward(
				request, response);
		
		
	}

}

