/******************************************************************************
* Class:	PartnerLogicLayer
* Purpose:	
*******************************************************************************
* Style:		https://google.github.io/styleguide/javaguide.html
* Column limit: 80
******************************************************************************/
package com.partner;

public abstract class Partner {

	/**************************************************************************
	* global variables
	**************************************************************************/
	private String email; //primary
	private String password;
	private String businessName;
	private String contactFirstName;
	private String contactMiddleName;
	private String contactLastName;
	private String phone;
	private String street;
	private String city;
	private String state;
	private String zipCode;
	
	/**************************************************************************
	* constructor
	**************************************************************************/
	public Partner(){}
	
	public Partner(String email, String password, String businessName, 
			String contactFirstName, String contactMiddleName, 
			String contactLastName, String phone, String street, 
			String city, String state, String zipCode) {
		
		this.email = email;
		this.password = password;
		this.businessName = businessName;
		this.contactFirstName = contactFirstName;
		this.contactMiddleName = contactMiddleName;
		this.contactLastName = contactLastName;
		this.phone = phone;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	
	public Partner(String email, String password){
		this.email = email;
		this.password = password;
	}
	
	public Partner(String email){
		this.email=email;
	}
	

	/**************************************************************************
	* getter setter
	**************************************************************************/
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getContactFirstName() {
		return contactFirstName;
	}

	public void setContactFirstName(String contactFirstName) {
		this.contactFirstName = contactFirstName;
	}

	public String getContactMiddleName() {
		return contactMiddleName;
	}

	public void setContactMiddleName(String contactMiddleName) {
		this.contactMiddleName = contactMiddleName;
	}

	public String getContactLastName() {
		return contactLastName;
	}

	public void setContactLastName(String contactLastName) {
		this.contactLastName = contactLastName;
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
