package com.customer.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Calendar;

import javax.xml.ws.Response;




import javax.jws.WebService;

import com.customer.Customer;
import com.customer.CustomerRep;
import com.customer.CustomerRequest;
import com.order.OrderRep;
import com.order.OrderRequest;
import com.product.ProductRep;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;

public class CustomerServiceClient {
	
	private CustomerServiceClient(){
}
	
	public static void main(String args[]) throws Exception {

		Date today = Calendar.getInstance().getTime();
		List<Object> providers = new ArrayList<Object>();
        JacksonJsonProvider provider = new JacksonJsonProvider();
        provider.addUntouchable(Response.class);
        providers.add(provider);
        
        /*****************************************************************************************
         * GET METHOD invoke for single customer
         *****************************************************************************************/
        System.out.println("GET METHOD .........................................................");
        WebClient getClient = WebClient.create("http://localhost:8081", providers);
        
        //Configuring the CXF logging interceptor for the outgoing message
        WebClient.getConfig(getClient).getOutInterceptors().add(new LoggingOutInterceptor());
      //Configuring the CXF logging interceptor for the incoming response
        WebClient.getConfig(getClient).getInInterceptors().add(new LoggingInInterceptor());
        
        // change application/xml  to get in xml format
        getClient = getClient.accept("application/json").type("application/json").path("/customerservice/customer/ID");
        
        //The following lines are to show how to log messages without the CXF interceptors
        String getRequestURI = getClient.getCurrentURI().toString();
        System.out.println("Client GET METHOD Request URI:  " + getRequestURI);
        String getRequestHeaders = getClient.getHeaders().toString();
        System.out.println("Client GET METHOD Request Headers:  " + getRequestHeaders);
        
        //to see as raw XML/json
        String response = getClient.get(String.class);
        System.out.println("GET METHOD Response: ...." + response);
        
       //to get the response as object of Customer class
       Customer customer = getClient.get(Customer.class);
       System.out.println("Name:" + customer.getFirstName()+" "+ customer.getLastName());
       System.out.println("Address:" + customer.getStreet()+" "+customer.getCity()+", "+customer.getState()+ " " + customer.getZipCode());
       System.out.println("Phone:" + customer.getPhone());
       
       /*****************************************************************************************
        * GET METHOD invoke for all products
        *****************************************************************************************/
       System.out.println("GET METHOD for all customer..........................................");
       WebClient getAllClient = WebClient.create("http://localhost:8081", providers);
       WebClient.getConfig(getAllClient).getOutInterceptors().add(new LoggingOutInterceptor());
       WebClient.getConfig(getAllClient).getInInterceptors().add(new LoggingInInterceptor());
       
       // change application/xml  to get in xml format
       getAllClient = getAllClient.accept("application/json").type("application/json").path("/ProductService/product");
                
       String getAllRequestURI = getAllClient.getCurrentURI().toString();
       System.out.println("Client GET METHOD Request URI:  " + getAllRequestURI);
       String getAllRequestHeaders = getAllClient.getHeaders().toString();
       System.out.println("Client GET METHOD Request Headers:  " + getAllRequestHeaders);
       
       //to see as raw XML/json
       String getAllResponse = getAllClient.get(String.class);
       System.out.println("GET All METHOD Response: ...." + getAllResponse); 
       
       /*****************************************************************************************
        * GET METHOD invoke for all  products by author
        *****************************************************************************************/
       System.out.println("GET METHOD for all customer..........................................");
       WebClient getAllAuthorClient = WebClient.create("http://localhost:8081", providers);
       WebClient.getConfig(getAllAuthorClient).getOutInterceptors().add(new LoggingOutInterceptor());
       WebClient.getConfig(getAllAuthorClient).getInInterceptors().add(new LoggingInInterceptor());
       
       // change application/xml  to get in xml format
       getAllAuthorClient = getAllAuthorClient.accept("application/json").type("application/json").path("/ProductService/product/author");
                
       String getAllAuthorRequestURI = getAllAuthorClient.getCurrentURI().toString();
       System.out.println("Client GET METHOD Request URI:  " + getAllAuthorRequestURI);
       String getAllAuthorRequestHeaders = getAllAuthorClient.getHeaders().toString();
       System.out.println("Client GET METHOD Request Headers:  " + getAllAuthorRequestHeaders);
       
       //to see as raw XML/json
       String getAllAuthorResponse = getAllAuthorClient.get(String.class);
       System.out.println("GET All METHOD Response: ...." + getAllAuthorResponse); 
       
       /*****************************************************************************************
        * GET METHOD invoke for all  products by title
        *****************************************************************************************/
       System.out.println("GET METHOD for all customer..........................................");
       WebClient getAllTitleClient = WebClient.create("http://localhost:8081", providers);
       WebClient.getConfig(getAllTitleClient).getOutInterceptors().add(new LoggingOutInterceptor());
       WebClient.getConfig(getAllTitleClient).getInInterceptors().add(new LoggingInInterceptor());
       
       // change application/xml  to get in xml format
       getAllTitleClient = getAllTitleClient.accept("application/json").type("application/json").path("/ProductService/product/title");
                
       String getAllTitleRequestURI = getAllTitleClient.getCurrentURI().toString();
       System.out.println("Client GET METHOD Request URI:  " + getAllTitleRequestURI);
       String getAllTitleRequestHeaders = getAllTitleClient.getHeaders().toString();
       System.out.println("Client GET METHOD Request Headers:  " + getAllTitleRequestHeaders);
       
       //to see as raw XML/json
       String getAllTitleResponse = getAllTitleClient.get(String.class);
       System.out.println("GET All METHOD Response: ...." + getAllTitleResponse); 
       
       /*****************************************************************************************
        * GET METHOD invoke for all  products by genre
        *****************************************************************************************/
       System.out.println("GET METHOD for all customer..........................................");
       WebClient getAllGenreClient = WebClient.create("http://localhost:8081", providers);
       WebClient.getConfig(getAllGenreClient).getOutInterceptors().add(new LoggingOutInterceptor());
       WebClient.getConfig(getAllGenreClient).getInInterceptors().add(new LoggingInInterceptor());
       
       // change application/xml  to get in xml format
       getAllGenreClient = getAllGenreClient.accept("application/json").type("application/json").path("/ProductService/product/genre");
                
       String getAllGenreRequestURI = getAllGenreClient.getCurrentURI().toString();
       System.out.println("Client GET METHOD Request URI:  " + getAllGenreRequestURI);
       String getAllGenreRequestHeaders = getAllGenreClient.getHeaders().toString();
       System.out.println("Client GET METHOD Request Headers:  " + getAllGenreRequestHeaders);
       
       //to see as raw XML/json
       String getAllGenreResponse = getAllGenreClient.get(String.class);
       System.out.println("GET All METHOD Response: ...." + getAllGenreResponse); 
       
       /*****************************************************************************************
        * GET METHOD invoke for all  orders by Attribute (Oba)
        *****************************************************************************************/
       System.out.println("GET METHOD for all customer..........................................");
       WebClient getAllObaClient = WebClient.create("http://localhost:8081", providers);
       WebClient.getConfig(getAllObaClient).getOutInterceptors().add(new LoggingOutInterceptor());
       WebClient.getConfig(getAllObaClient).getInInterceptors().add(new LoggingInInterceptor());
       
       // change application/xml  to get in xml format
       getAllObaClient = getAllObaClient.accept("application/json").type("application/json").path("/OrderService/order/attribute");
                
       String getAllObaRequestURI = getAllObaClient.getCurrentURI().toString();
       System.out.println("Client GET METHOD Request URI:  " + getAllObaRequestURI);
       String getAllObaRequestHeaders = getAllObaClient.getHeaders().toString();
       System.out.println("Client GET METHOD Request Headers:  " + getAllObaRequestHeaders);
       
       //to see as raw XML/json
       String getAllObaResponse = getAllObaClient.get(String.class);
       System.out.println("GET All METHOD Response: ...." + getAllObaResponse); 
       
       /*****************************************************************************************
        * GET METHOD invoke for all  orders by customer
        *****************************************************************************************/
       System.out.println("GET METHOD for all customer..........................................");
       WebClient getAllOrdersClient = WebClient.create("http://localhost:8081", providers);
       WebClient.getConfig(getAllOrdersClient).getOutInterceptors().add(new LoggingOutInterceptor());
       WebClient.getConfig(getAllOrdersClient).getInInterceptors().add(new LoggingInInterceptor());
       
       // change application/xml  to get in xml format
       getAllOrdersClient = getAllOrdersClient.accept("application/json").type("application/json").path("/OrderService/order/customerEmail");
                
       String getAllOrdersRequestURI = getAllOrdersClient.getCurrentURI().toString();
       System.out.println("Client GET METHOD Request URI:  " + getAllOrdersRequestURI);
       String getAllOrdersRequestHeaders = getAllOrdersClient.getHeaders().toString();
       System.out.println("Client GET METHOD Request Headers:  " + getAllOrdersRequestHeaders);
       
       //to see as raw XML/json
       String getAllOrdersResponse = getAllOrdersClient.get(String.class);
       System.out.println("GET All METHOD Response: ...." + getAllOrdersResponse); 
       
       /*****************************************************************************************
        * GET METHOD invoke for shopping cart
        *****************************************************************************************/
       System.out.println("GET METHOD for all customer..........................................");
       WebClient getAllCartClient = WebClient.create("http://localhost:8081", providers);
       WebClient.getConfig(getAllCartClient).getOutInterceptors().add(new LoggingOutInterceptor());
       WebClient.getConfig(getAllCartClient).getInInterceptors().add(new LoggingInInterceptor());
       
       // change application/xml  to get in xml format
       getAllCartClient = getAllCartClient.accept("application/json").type("application/json").path("/OrderService/order/email");
                
       String getAllCartRequestURI = getAllCartClient.getCurrentURI().toString();
       System.out.println("Client GET METHOD Request URI:  " + getAllCartRequestURI);
       String getAllCartRequestHeaders = getAllCartClient.getHeaders().toString();
       System.out.println("Client GET METHOD Request Headers:  " + getAllCartRequestHeaders);
       
       //to see as raw XML/json
       String getAllCartResponse = getAllCartClient.get(String.class);
       System.out.println("GET All METHOD Response: ...." + getAllCartResponse); 


       /*****************************************************************************************
        * POST METHOD invoke create/update customer
       *****************************************************************************************/
       System.out.println("POST METHOD .........................................................");
       WebClient postClient = WebClient.create("http://localhost:8081", providers);
       WebClient.getConfig(postClient).getOutInterceptors().add(new LoggingOutInterceptor());
       WebClient.getConfig(postClient).getInInterceptors().add(new LoggingInInterceptor());
                
       // change application/xml  to application/json get in json format
       postClient = postClient.accept("application/xml").type("application/json").path("/customerservice/customer");
    	
       String postRequestURI = postClient.getCurrentURI().toString();
       System.out.println("Client POST METHOD Request URI:  " + postRequestURI);
       String postRequestHeaders = postClient.getHeaders().toString();
       System.out.println("Client POST METHOD Request Headers:  " + postRequestHeaders);
       CustomerRequest customerRequest = new CustomerRequest("email", "firstName", "middleName", 
   			 "lastName", "password", "phone", "street", "city",  "state",  "zipCode");
   
    	String responsePost =  postClient.post(customerRequest, String.class);
       System.out.println("POST MEDTHOD Response ........." + responsePost);
       
       /*****************************************************************************************
        * POST METHOD invoke create shopping cart
       *****************************************************************************************/
       System.out.println("POST METHOD .........................................................");
       WebClient postNewCartClient = WebClient.create("http://localhost:8081", providers);
       WebClient.getConfig(postNewCartClient).getOutInterceptors().add(new LoggingOutInterceptor());
       WebClient.getConfig(postNewCartClient).getInInterceptors().add(new LoggingInInterceptor());
                
       // change application/xml  to application/json get in json format
       postNewCartClient = postNewCartClient.accept("application/xml").type("application/json").path("/orderservice/order");
    	
       String postNewCartRequestURI = postNewCartClient.getCurrentURI().toString();
       System.out.println("Client POST METHOD Request URI:  " + postNewCartRequestURI);
       String postNewCartRequestHeaders = postNewCartClient.getHeaders().toString();
       System.out.println("Client POST METHOD Request Headers:  " + postNewCartRequestHeaders);
       OrderRequest orderRequest = new OrderRequest("email", 101 /*prodId*/, 2 /*Quantity*/, "phone", 
				 "street", "city", "state", "zipCode","Status",today);
   
    	String responseNewCartPost =  postNewCartClient.post(orderRequest, String.class);
       System.out.println("POST MEDTHOD Response ........." + responseNewCartPost);
       
       /*****************************************************************************************
        * POST METHOD invoke update/add shopping cart
       *****************************************************************************************/
       System.out.println("POST METHOD .........................................................");
       WebClient postAddCartClient = WebClient.create("http://localhost:8081", providers);
       WebClient.getConfig(postAddCartClient).getOutInterceptors().add(new LoggingOutInterceptor());
       WebClient.getConfig(postAddCartClient).getInInterceptors().add(new LoggingInInterceptor());
                
       // change application/xml  to application/json get in json format
       postAddCartClient = postAddCartClient.accept("application/xml").type("application/json").path("/orderservice/order/orderId");
    	
       String postAddCartRequestURI = postAddCartClient.getCurrentURI().toString();
       System.out.println("Client POST METHOD Request URI:  " + postAddCartRequestURI);
       String postAddCartRequestHeaders = postAddCartClient.getHeaders().toString();
       System.out.println("Client POST METHOD Request Headers:  " + postAddCartRequestHeaders);
       OrderRequest orderAddRequest = new OrderRequest("email", 101 /*prodId*/, 2 /*Quantity*/, "phone", 
				 "street", "city", "state", "zipCode","Status",today);
   
    	String responseAddCartPost =  postAddCartClient.post(orderAddRequest, String.class);
       System.out.println("POST MEDTHOD Response ........." + responseAddCartPost);
       
       
       /*****************************************************************************************
        * POST METHOD invoke submit order
       *****************************************************************************************/
       System.out.println("POST METHOD .........................................................");
       WebClient postPlaceOrderClient = WebClient.create("http://localhost:8081", providers);
       WebClient.getConfig(postPlaceOrderClient).getOutInterceptors().add(new LoggingOutInterceptor());
       WebClient.getConfig(postPlaceOrderClient).getInInterceptors().add(new LoggingInInterceptor());
                
       // change application/xml  to application/json get in json format
       postPlaceOrderClient = postPlaceOrderClient.accept("application/xml").type("application/json").path("/orderservice/order/place/orderId");
    	
       String postPlaceOrderRequestURI = postPlaceOrderClient.getCurrentURI().toString();
       System.out.println("Client POST METHOD Request URI:  " + postPlaceOrderRequestURI);
       String postPlaceOrderRequestHeaders = postPlaceOrderClient.getHeaders().toString();
       System.out.println("Client POST METHOD Request Headers:  " + postPlaceOrderRequestHeaders);
       OrderRequest orderPlaceOrderRequest = new OrderRequest("email", 101 /*prodId*/, 2 /*Quantity*/, "phone", 
				 "street", "city", "state", "zipCode","Status",today);
   
    	String responsePlaceOrderPost =  postPlaceOrderClient.post(orderPlaceOrderRequest, String.class);
       System.out.println("POST MEDTHOD Response ........." + responsePlaceOrderPost);
       
       /*****************************************************************************************
        * Post METHOD invoke Cancel order
       *****************************************************************************************/
       System.out.println("Post METHOD .........................................................");
       WebClient postCancelClient = WebClient.create("http://localhost:8081", providers);
       WebClient.getConfig(postCancelClient).getOutInterceptors().add(new LoggingOutInterceptor());
       WebClient.getConfig(postCancelClient).getInInterceptors().add(new LoggingInInterceptor());
       
       // change application/xml  to application/json get in json format
       postCancelClient = postCancelClient.accept("application/xml").type("application/json").path("/orderservice/order/cancel/orderId");
    	
       String postCancelRequestURI = postCancelClient.getCurrentURI().toString();
       System.out.println("Client Post METHOD Request URI:  " + postCancelRequestURI);
       String postCancelRequestHeaders = postCancelClient.getHeaders().toString();
       System.out.println("Client Post METHOD Request Headers:  " + postCancelRequestHeaders);
       
       OrderRequest orderCancelOrderRequest = new OrderRequest("email", 101 /*prodId*/, 2 /*Quantity*/, "phone", 
				 "street", "city", "state", "zipCode","Status",today);
       
       String responseCancelOrderPost =  postCancelClient.post(orderCancelOrderRequest, String.class);
       System.out.println("Post MEDTHOD Response ........." + responseCancelOrderPost);
        
       /*****************************************************************************************
        * Post METHOD invoke Return order
       *****************************************************************************************/
       System.out.println("Post METHOD .........................................................");
       WebClient postReturnClient = WebClient.create("http://localhost:8081", providers);
       WebClient.getConfig(postReturnClient).getOutInterceptors().add(new LoggingOutInterceptor());
       WebClient.getConfig(postReturnClient).getInInterceptors().add(new LoggingInInterceptor());
       
       // change application/xml  to application/json get in json format
       postReturnClient = postReturnClient.accept("application/xml").type("application/json").path("/orderservice/order/return/orderID");
    	
       String postReturnRequestURI = postReturnClient.getCurrentURI().toString();
       System.out.println("Client Post METHOD Request URI:  " + postReturnRequestURI);
       String postReturnRequestHeaders = postReturnClient.getHeaders().toString();
       System.out.println("Client Post METHOD Request Headers:  " + postReturnRequestHeaders);
       
       OrderRequest orderReturnOrderRequest = new OrderRequest("email", 101 /*prodId*/, 2 /*Quantity*/, "phone", 
				 "street", "city", "state", "zipCode","Status",today);
       
       String responseReturnOrderPost =  postReturnClient.post(orderReturnOrderRequest, String.class);
       System.out.println("Post MEDTHOD Response ........." + responseReturnOrderPost);
       
       /*****************************************************************************************
        * DELETE METHOD invoke customer
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