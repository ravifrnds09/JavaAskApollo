package com.test;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


public class ApolloPharmacyDataLoad {
public static void main(String args[]){
	Runnable runnable = new Runnable() {
	      public void run() {
	        // task to run goes here
	Client client = Client.create();
	WebResource webResource = client.resource("https://www.apollopharmacy.in/storelocationsapi.php?token=6edc284b5929c718878e57861e452ea575fc9f6238ac9f2852c7157184aea5df");
	ClientResponse res = webResource.type("application/json").get(ClientResponse.class);

	String output = res.getEntity(String.class);
	PharmacyDataLoadGetModel pharmacyresponse;
	List list;
	try {
		JSONArray c = new JSONArray(output);
		list=new ArrayList();
	    for (int i = 0 ; i < c.length(); i++) {
	        JSONObject obj = c.getJSONObject(i);
	        pharmacyresponse=new PharmacyDataLoadGetModel();
	        pharmacyresponse.setBaddress(obj.getString("baddress"));
			pharmacyresponse.setBranchtype(obj.getString("branchtype"));
			pharmacyresponse.setPhno(obj.getString("phno"));
			pharmacyresponse.setPincode(obj.getString("pincode"));
			pharmacyresponse.setPlat(obj.getString("plat"));
			pharmacyresponse.setPlon(obj.getString("plon"));
			pharmacyresponse.setStoreid(Integer.parseInt(obj.getString("storeid")));
			pharmacyresponse.setStorename(obj.getString("storename"));
			pharmacyresponse.setPcity(obj.getString("pcity"));
			pharmacyresponse.setStaten(obj.getString("staten"));
			list.add(pharmacyresponse);
	    }
	PharmacyDataLoadDAO pharmacylist=new PharmacyDataLoadDAO();
	try {
		pharmacylist.pharmacyDB(list);
	} catch (Exception e) {
		e.printStackTrace();
	}
	} catch (JSONException e) {
		e.printStackTrace();
	}
	      }
	};
	ScheduledExecutorService service = Executors
            .newSingleThreadScheduledExecutor();
service.scheduleAtFixedRate(runnable, 0, 4, TimeUnit.MINUTES);
}
}
