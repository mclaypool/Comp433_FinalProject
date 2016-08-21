package com.order;

import java.util.List;

public class OrderLogic {
	
	
	/**************************************************************************
	* members
	**************************************************************************/
	private OrderDao conn = new OrderDao();
	
	
	/**************************************************************************
	* methods
	**************************************************************************/
	
	/**************************************************************
	 * for customer
	 **************************************************************/
	public List<OrderRep> getShoppingCart(String attribute, String value){
		return conn.getShoppingCart(attribute, value);
		//TODO add link code
	}		
	
	public List<OrderRep> createShoppingCart(String attribute, String value){
		return conn.createShoppingCart(attribute, value);
		//TODO: send partner email
		//TODO add link code
	}
	
	public List<OrderRep> addItemToShoppingCart(OrderRequest request){
		return conn.addItemToShoppingCart(request);
		//TODO: send partner email
		//TODO add link code
	}
	
	public List<OrderRep> placeOrder(int id){
		return conn.placeOrder(id);
		//TODO: send partner email
		//TODO add link code
	}
	
	public void orderCancellationRequest(int id){
		//TODO: send partner email
	}
	
	public void returnOrderRequest(int id){
		//conn.returnOrder(id);
		//TODO: send partner email
	}
	

	/**************************************************************
	 * for both
	 **************************************************************/
	public List<OrderRep> getOrdersByAttribute(String attribute, String value){
		return null;
		//return conn.getOrderByAttribute(attribute, value);
		//TODO add link code
	}
	
	public List<OrderRep> getAllOrders(String attribute, String value){
		return null;
		//return conn.getOrderByAttribute(attribute, value);
		//TODO add link code
	}	
	
	
	
	
	/**************************************************************
	 * for partners
	 **************************************************************/
	public List<OrderRep> updateOrder(List<OrderRequest> request){
		return conn.updateOrder(request);
		//TODO add link code
	}
	
	public void deleteOrder(int id){
		conn.deleteOrder(id);
		//TODO: send partner email
	}
	
	public void cancelOrder(int id){
		//conn.cancelOrder(id);
		//TODO: send partner email
	}
}
