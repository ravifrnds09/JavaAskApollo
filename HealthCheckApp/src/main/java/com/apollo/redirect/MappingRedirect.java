package com.apollo.redirect;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class M
 */
@WebServlet("/mappingDetails")
public class MappingRedirect extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		HttpSession session = request.getSession(false);
		
		ServletContext sc = getServletContext();
		
		if (session == null) {
			sc.getRequestDispatcher("/login.html").forward(request, response);
		}
		else {  
	        String userName = (String) session.getAttribute("uName");
	        System.out.println(userName);
			sc.getRequestDispatcher("/WEB-INF/packagemappingdetails.html").forward(request, response);
		}
				
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
		
		ServletContext sc = getServletContext();
		
		if (session == null) {
			sc.getRequestDispatcher("/login.html").forward(request, response);
		}
		else {  
	        String userName = (String) session.getAttribute("uName");
	        System.out.println(userName);
			sc.getRequestDispatcher("/WEB-INF/packagemappingdetails.html").forward(request, response);
		}
		
	}
		
}
