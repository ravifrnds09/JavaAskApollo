package com.apollo.Controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.json.JSONObject;

import com.apollo.Service.PackageTestService;
import com.apollo.ServiceImpl.PackageTestServiceImpl;
import com.apollo.model.PackageTest;

@Path("/package")
public class PackageTestController {
	private static Logger logger=Logger.getLogger(PackageTestController.class);
	private PackageTestService service;
	@POST
	@Path("/fetchPackage")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String PackageDetails(PackageTest test)
	{
		
		logger.info("packageTest Controller");
		service=new PackageTestServiceImpl();
		/*JSONObject obj=new JSONObject();
		obj.put("", test);*/
		return service.RegisterPackges(test);
	}

}
