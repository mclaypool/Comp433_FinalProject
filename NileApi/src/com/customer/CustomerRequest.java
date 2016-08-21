package com.customer;

public class CustomerRequest extends Customer
{
	public CustomerRequest(String email, String firstName, String middleName, 
			String lastName, String password, String phone, String street, 
			String city, String state, String zipCode) 
	{
		super(email, firstName, middleName, lastName, 
				password, phone, street, city, state, zipCode);
	}
	
	public CustomerRequest(String email, String password) 
	{
		super(email, password);
	}
	public CustomerRequest (String id) //mf
	{
		super(id); 
	}
	
	public CustomerRequest(){}
}
