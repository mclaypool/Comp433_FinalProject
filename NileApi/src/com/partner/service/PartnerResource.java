package com.partner.service;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.partner.PartnerRequest;
import com.partner.PartnerLogic;
import com.partner.PartnerRep;
import com.product.ProductRequest;
import com.product.ProductLogic;
import com.product.ProductRep;
import com.customer.CustomerLogic;
import com.customer.CustomerRep;
import com.customer.CustomerRequest;
import com.order.OrderRequest;
import com.order.OrderLogic;
import com.order.OrderRep;

@Path("/partnerResource/")
public class PartnerResource {
	
	/**************************************************************************
	* getPartner
	**************************************************************************/
	@GET
	@Produces({"application/xml","application/json"})
	@Path("/partner/{id}")  ///{password}
	public PartnerRep getPartner(
		@PathParam("id") String id) 
		//@PathParam("password") String password) not needed if we are just sear
	{
		System.out.println(
				"GET METHOD Request from Client with Partner: " + id);
		PartnerLogic partnerLogic = new PartnerLogic();
		return partnerLogic.getPartner(new PartnerRequest(id));
	}

		/**************************************************************************
		* updatePartner
		**************************************************************************/
		@POST
		@Produces({"application/xml","application/json"})
		@Path("/partner/{id}") //{firstName}/{middleName}/{lastName}/{pass^word}/{phone}/{street}/{city}/{state}/{zipCode}
		public PartnerRep updatePartner(@PathParam("id")String id) 			
			
			//****We have to take in a JSON file**** that will have this info
			/*@PathParam("firstName") String firstName, 
			@PathParam("middleName") String middleName, 
			@PathParam("lastName") String lastName, 
			@PathParam("password") String password, 	
			@PathParam("phone") String phone, 
			@PathParam("street") String street, 		
			@PathParam("city") String city, 
			@PathParam("state") String state, 			
			@PathParam("zipCode") String zipCode)*/
		{
			System.out.println(
					"POST METHOD Request from Client with Partner: " );
			PartnerLogic partnerLogic = new PartnerLogic();
			return partnerLogic.updatePartner(new PartnerRequest());
		}
			
			
	/*************************************************************************
	* deletePartner
	**************************************************************************/
	@DELETE
	@Produces({"application/xml","application/json"})
	@Path("/partner/{id}")
	public void deletePartner(@PathParam("id") String id) 
		//@PathParam("password") String password)
	{
		System.out.println(
				"DELETE METHOD Request from Client with Partner: " + id);
		PartnerLogic partnerLogic = new PartnerLogic();
		partnerLogic.deletePartner(new PartnerRequest(id));
	}

	/**************************************************************************
	* createCustomer
	**************************************************************************/
	@POST
	@Produces({"application/xml","application/json"})
	@Path("/partner")
	public PartnerRep createPartner() 
	{
		System.out.println(
				"POST METHOD Request from Client with Partner: ");
		PartnerLogic partnerLogic = new PartnerLogic();
		PartnerRequest request = new PartnerRequest();
		return partnerLogic.createPartner(new PartnerRequest());
	}

}
