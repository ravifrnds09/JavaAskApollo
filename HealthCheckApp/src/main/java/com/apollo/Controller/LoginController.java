package com.apollo.Controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.apollo.Service.LoginService;
import com.apollo.ServiceImpl.LoginServiceImpl;
import com.apollo.model.HCPackageResponse;
import com.apollo.model.Login;

@Path("/login")
public class LoginController {
	
	private final Logger logger = Logger.getLogger(LoginController.class);
	
	LoginService loginService;
	
	@POST
	@Path("/checkUser")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public HCPackageResponse checkUserValidity(@Context HttpServletRequest httpServletRequest, Login login) {
		
		LoginService loginService;
	    HCPackageResponse hcPackageResponse = new HCPackageResponse();
	    String userName;
		
	    try {
	    	
	    	logger.info("Login Controller API");
	    	
	    	loginService = new LoginServiceImpl();
	    	hcPackageResponse = loginService.checkUserService(login);
	    	
	    	if (hcPackageResponse.getResponse().equalsIgnoreCase("User Exists")) {
	    		
	    	    HttpSession session = httpServletRequest.getSession(true);
	    		userName = login.getUserName();
	    		session.setAttribute("uName", userName);
	    		System.out.println("Login Controller called" + session.getAttribute("uName"));
	    	    	    	    
			}
	    		    	
		} catch (Exception e) {
			logger.info("Login Controller API" + e.getMessage());
			hcPackageResponse.setResponse("Invalid UserName or Password");
			e.printStackTrace();
		}
				
        return hcPackageResponse;

    }
	
	//@GET
	@POST
	@Path("/logout")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public HCPackageResponse logout(@Context HttpServletRequest httpServletRequest) {
				
	    HttpSession session = httpServletRequest.getSession(false);
		
	    HCPackageResponse hcPackageResponse = new HCPackageResponse();
	    
	    if (session != null) {
	    	session.invalidate();
		    
		    if(session==null || !httpServletRequest.isRequestedSessionIdValid() )
		    {
			    System.out.println("logout2: " + session);
		    }
				   
		}
	    hcPackageResponse.setResponse("success");
		
        return hcPackageResponse;

    }
	
}
