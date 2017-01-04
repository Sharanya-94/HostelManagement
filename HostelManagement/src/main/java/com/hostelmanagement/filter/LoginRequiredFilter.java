package com.hostelmanagement.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@WebFilter(urlPatterns = "/ResidentDetails.do")
public class LoginRequiredFilter implements Filter{

	public LoginRequiredFilter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		  HttpServletRequest request = (HttpServletRequest) servletRequest;
		  System.out.println(request.getRequestURI());
		  
	        if (request.getSession().getAttribute("mobileNum") != null) {
	        	System.out.println("hi iam filter");
	            chain.doFilter(servletRequest, servletResponse);
	        } else {
	        	System.out.println("hi iam login");
	            request.getRequestDispatcher("/login.jsp").forward(servletRequest,
	                    servletResponse);
	        }
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
