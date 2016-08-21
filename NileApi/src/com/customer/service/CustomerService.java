package com.customer.service;

import java.util.List;
import javax.jws.WebService;
import com.customer.CustomerRep;
import com.customer.CustomerRequest;
import com.order.OrderRep;
import com.order.OrderRequest;
import com.product.ProductRep;

@WebService
public interface CustomerService {
	
	//customer functions
	public CustomerRep getCustomer(CustomerRequest request);
	public CustomerRep updateCustomer(CustomerRequest request);
	public void deleteCustomer(CustomerRequest request);
	public CustomerRep createCustomer(CustomerRequest request);
	
	//product functions for customers
	public List<ProductRep> getAllProducts();
	public List<ProductRep> getProductsByTitle(String title);
	public List<ProductRep> getProductsByGenre(String genre);
	public List<ProductRep> getProductsByAuthor(String author);
	
	//order functions for customer
	public List<OrderRep> getOrdersByAttribute(String attribute, String value);
	public List<OrderRep> getAllOrders(String attribute, String value);
	public List<OrderRep> getShoppingCart(String attribute, String value);
	public List<OrderRep> createShoppingCart(String attribute, String value);
	public List<OrderRep> addItemToShoppingCart(OrderRequest request);
	public List<OrderRep> placeOrder(int id);
	public void orderCancellationRequest(int id);
	public void returnOrderRequest(int id);
}