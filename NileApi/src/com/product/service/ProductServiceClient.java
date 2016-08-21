package com.product.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.ws.Response;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxrs.client.WebClient;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.product.ProductRep;

public class ProductServiceClient {

	private ProductServiceClient(){}
	
	public static void main(String args[]) throws Exception {

		List<Object> providers = new ArrayList<Object>();
	    JacksonJsonProvider provider = new JacksonJsonProvider();
	    provider.addUntouchable(Response.class);
	    providers.add(provider);
	    
	    /*****************************************************************************************
	     * GET METHOD invoke for getting all products
	     *****************************************************************************************/
	    System.out.println("GET METHOD .........................................................");
	    WebClient getClient = WebClient.create("http://localhost:8081", providers);
	    
	    //Configuring the CXF logging interceptor for the outgoing message
	    WebClient.getConfig(getClient).getOutInterceptors().add(new LoggingOutInterceptor());
	    //Configuring the CXF logging interceptor for the incoming response
	    WebClient.getConfig(getClient).getInInterceptors().add(new LoggingInInterceptor());
	    
	    // change application/xml  to get in xml format
	    getClient = getClient.accept("application/json").
	    		type("application/json").path("/productservice/product/");
	    
	    //The following lines are to show how to log messages without the CXF interceptors
	    String getRequestURI = getClient.getCurrentURI().toString();
	    System.out.println("Client GET METHOD Request URI:  " + getRequestURI);
	    String getRequestHeaders = getClient.getHeaders().toString();
	    System.out.println("Client GET METHOD Request Headers:  " + getRequestHeaders);
	    
	    //to see as raw XML/json
	    String response = getClient.get(String.class);
	    System.out.println("GET METHOD Response: ...." + response);
	    
	    //to get the response as object of product class
	    ProductRep rep = getClient.get(ProductRep.class);
	    System.out.println("getting all product");
	}
}
