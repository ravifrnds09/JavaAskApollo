package com.apollo.Controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import com.apollo.Service.PackageListService;
import com.apollo.ServiceImpl.PackageListServiceImpl;
import com.apollo.model.PackageList;

@Path("/package")
public class PackageListController {
	private static Logger logger=Logger.getLogger(PackageListController.class);
	private PackageListService service;
	@POST
	@Path("/list")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String PackageDetails(PackageList test)
	{
		
		logger.info("packageTest Controller");
		service=new PackageListServiceImpl();
		return service.RegisterPackges(test);
	}

}
