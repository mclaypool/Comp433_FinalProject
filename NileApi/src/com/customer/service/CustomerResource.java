/******************************************************************************
* Class:	CustomerResource
* Purpose:	
*******************************************************************************
* Style:		https://google.github.io/styleguide/javaguide.html
* Column limit: 80
******************************************************************************/
package com.customer.service;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import com.customer.CustomerRequest;
import com.customer.CustomerLogic;
import com.customer.CustomerRep;

@Path("/customerResource/")
public class CustomerResource{
	
	/**************************************************************************
	* getCustomer
	**************************************************************************/
	@GET
	@Produces({"application/xml","application/json"})
	@Path("/customer/{id}")  ///{password}
	public CustomerRep getCustomer(
		@PathParam("id") String id) 
		//@PathParam("password") String password) not needed if we are just sear
	{
		System.out.println(
				"GET METHOD Request from Client with Customer: " + id);
		CustomerLogic customerLogic = new CustomerLogic();
		return customerLogic.getCustomer(new CustomerRequest(id));
	}

		/**************************************************************************
		* updateCustomer
		**************************************************************************/
		@POST
		@Produces({"application/xml","application/json"})
		@Path("/customer/{id}") //{firstName}/{middleName}/{lastName}/{pass^word}/{phone}/{street}/{city}/{state}/{zipCode}
		public CustomerRep updateCustomer(@PathParam("id")String id) 			
			
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
					"POST METHOD Request from Client with Customer: " );
			CustomerLogic customerLogic = new CustomerLogic();
			return customerLogic.updateCustomer(new CustomerRequest());
		}
			
			
	/*************************************************************************
	* deleteCustomer
	**************************************************************************/
	@DELETE
	@Produces({"application/xml","application/json"})
	@Path("/customer/{id}")
	public void deleteCustomer(@PathParam("id") String id) 
		//@PathParam("password") String password)
	{
		System.out.println(
				"DELETE METHOD Request from Client with Customer: " + id);
		CustomerLogic customerLogic = new CustomerLogic();
		customerLogic.deleteCustomer(new CustomerRequest(id));
	}

	/**************************************************************************
	* createCustomer
	**************************************************************************/
	@POST
	@Produces({"application/xml","application/json"})
	@Path("/customer")
	public CustomerRep createCustomer() 
	{
		System.out.println(
				"POST METHOD Request from Client with Customer: ");
		CustomerLogic customerLogic = new CustomerLogic();
		CustomerRequest request = new CustomerRequest();
		return customerLogic.createCustomer("email", "firstName", "middleName", 
	   			 "lastName", "password", "phone", "street", "city",  "state",  "zipCode");
	}
}

