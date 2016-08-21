package com.customer;

import com.customer.service.CustomerAbstractRepresentation;

public class CustomerRep extends CustomerAbstractRepresentation
{

	/**************************************************************************
	* global variables
	**************************************************************************/
	private String email;
	private String firstName;
	private String middleName;
	private String lastName;
	private String password;
	private String phone;
	private String street;
	private String city;
	private String state;
	private String zipCode;
	
	/**************************************************************************
	* constructor
	**************************************************************************/
	public CustomerRep(){}
	
	public CustomerRep(String email, String firstName, String middleName, 
			String lastName, String password, String phone, String street, 
			String city, String state, String zipCode) {

		this.email = email;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.password = password;
		this.phone = phone;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	public CustomerRep(String email, String password) {
		this.email = email;
		this.password = password;
	}
	public CustomerRep(String email){ //mf
		this.email=email;
	}
	/**************************************************************************
	* getters setters
	**************************************************************************/
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middle) {
		this.middleName = middle;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
}
