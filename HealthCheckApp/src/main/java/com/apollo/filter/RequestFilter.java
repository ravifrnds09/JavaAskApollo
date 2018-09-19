package com.apollo.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebFilter("/RequestLoggingFilter")
public class RequestFilter implements Filter{
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		 HttpServletRequest httpRequest = (HttpServletRequest) request;
	     System.out.println("CORSFilter HTTP Request: " + httpRequest.getMethod());
	     
	     ((HttpServletResponse) response).addHeader("Access-Control-Allow-Origin", "*");
	     ((HttpServletResponse) response).addHeader("Access-Control-Allow-Methods","GET, OPTIONS, HEAD, PUT, POST");
	     ((HttpServletResponse) response).addHeader("Access-Control-Allow-Headers","Origin, Authorization, Accept, X-Requested-With, Content-Type, Access-Control-Allow-Origin");
	     ((HttpServletResponse) response).addHeader("Access-Control-Allow-Credentials","true");
	     
	     HttpServletResponse resp = (HttpServletResponse) response;
	     
	     /*if (httpRequest.getMethod().equals("GET")) {
	    	 resp.setStatus(HttpServletResponse.SC_ACCEPTED);
	         return;
	     }*/
		 
		 chain.doFilter(request, response);

	}

	@Override
	public void destroy() {
		
	}
	
}