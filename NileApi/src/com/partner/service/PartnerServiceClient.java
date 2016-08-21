package com.partner.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Calendar;

import javax.xml.ws.Response;




import javax.jws.WebService;

import com.partner.Partner;
import com.partner.PartnerRep;
import com.partner.PartnerRequest;
import com.order.OrderRep;
import com.order.OrderRequest;
import com.product.ProductRep;
import com.customer.Customer;
import com.customer.CustomerRequest;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;

public class PartnerServiceClient {
	
	private PartnerServiceClient(){}
	
	public static void main(String args[]) throws Exception {
		
		Date today = Calendar.getInstance().getTime();
		List<Object> providers = new ArrayList<Object>();
        JacksonJsonProvider provider = new JacksonJsonProvider();
        provider.addUntouchable(Response.class);
        providers.add(provider);
	
	
	/*****************************************************************************************
     * GET METHOD invoke for single partner
     *****************************************************************************************/
    System.out.println("GET METHOD .........................................................");
    WebClient getClient = WebClient.create("http://localhost:8081", providers);
    
    //Configuring the CXF logging interceptor for the outgoing message
    WebClient.getConfig(getClient).getOutInterceptors().add(new LoggingOutInterceptor());
  //Configuring the CXF logging interceptor for the incoming response
    WebClient.getConfig(getClient).getInInterceptors().add(new LoggingInInterceptor());
    
    // change application/xml  to get in xml format
    getClient = getClient.accept("application/json").type("application/json").path("/partnerservice/partner/ID");
    
    //The following lines are to show how to log messages without the CXF interceptors
    String getRequestURI = getClient.getCurrentURI().toString();
    System.out.println("Client GET METHOD Request URI:  " + getRequestURI);
    String getRequestHeaders = getClient.getHeaders().toString();
    System.out.println("Client GET METHOD Request Headers:  " + getRequestHeaders);
    
    //to see as raw XML/json
    String response = getClient.get(String.class);
    System.out.println("GET METHOD Response: ...." + response);
    
   //to get the response as object of Customer class
   //Partner partner= getClient.get(Partner.class);
   //System.out.println("Name:" + customer.getFirstName()+" "+ customer.getLastName());
   //System.out.println("Address:" + customer.getStreet()+" "+customer.getCity()+", "+customer.getState()+ " " + customer.getZipCode());
   //System.out.println("Phone:" + customer.getPhone());
   
    /*****************************************************************************************
     * POST METHOD invoke create customer
    *****************************************************************************************/
    System.out.println("POST METHOD .........................................................");
    WebClient postClient = WebClient.create("http://localhost:8081", providers);
    WebClient.getConfig(postClient).getOutInterceptors().add(new LoggingOutInterceptor());
    WebClient.getConfig(postClient).getInInterceptors().add(new LoggingInInterceptor());
             
    // change application/xml  to application/json get in json format
    postClient = postClient.accept("application/xml").type("application/json").path("/partnerservice/partner");
 	
    String postRequestURI = postClient.getCurrentURI().toString();
    System.out.println("Client POST METHOD Request URI:  " + postRequestURI);
    String postRequestHeaders = postClient.getHeaders().toString();
    System.out.println("Client POST METHOD Request Headers:  " + postRequestHeaders);
    PartnerRequest partnerRequest = new PartnerRequest();

 	String responsePost =  postClient.post(partnerRequest, String.class);
    System.out.println("POST MEDTHOD Response ........." + responsePost);
    
    /*****************************************************************************************
     * POST METHOD invoke update customer
    *****************************************************************************************/
    System.out.println("POST METHOD .........................................................");
    WebClient postUpdateClient = WebClient.create("http://localhost:8081", providers);
    WebClient.getConfig(postUpdateClient).getOutInterceptors().add(new LoggingOutInterceptor());
    WebClient.getConfig(postUpdateClient).getInInterceptors().add(new LoggingInInterceptor());
             
    // change application/xml  to application/json get in json format
    postUpdateClient = postUpdateClient.accept("application/xml").type("application/json").path("/partnerservice/partner");
 	
    String postUpdateRequestURI = postUpdateClient.getCurrentURI().toString();
    System.out.println("Client POST METHOD Request URI:  " + postUpdateRequestURI);
    String postUpdateRequestHeaders = postUpdateClient.getHeaders().toString();
    System.out.println("Client POST METHOD Request Headers:  " + postUpdateRequestHeaders);
    PartnerRequest partnerUpdateRequest = new PartnerRequest();

 	String responseUpdatePost =  postUpdateClient.post(partnerUpdateRequest, String.class);
    System.out.println("POST MEDTHOD Response ........." + responseUpdatePost);
    
    /*****************************************************************************************
     * DELETE METHOD invoke partner
    *****************************************************************************************/
    System.out.println("DELETE METHOD .........................................................");
    WebClient deleteClient = WebClient.create("http://localhost:8081", providers);
    WebClient.getConfig(deleteClient).getOutInterceptors().add(new LoggingOutInterceptor());
    WebClient.getConfig(deleteClient).getInInterceptors().add(new LoggingInInterceptor());
    
    // change application/xml  to application/json get in json format
    deleteClient = deleteClient.accept("application/xml").type("application/json").path("/customerservice/customer/XY1111");
 	
    String deleteRequestURI = deleteClient.getCurrentURI().toString();
    System.out.println("Client DELETE METHOD Request URI:  " + deleteRequestURI);
    String deleteRequestHeaders = deleteClient.getHeaders().toString();
    System.out.println("Client DELETE METHOD Request Headers:  " + deleteRequestHeaders);
    
    deleteClient.delete();
    System.out.println("DELETE MEDTHOD Response ......... OK");
     
    System.exit(0);
	}
}
