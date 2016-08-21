package com.partner;

public class PartnerRequest extends Partner {

	public PartnerRequest(){}
	
	public PartnerRequest(String email, String password, String businessName, String contactFirstName,
			String contactMiddleName, String contactLastName, String phone, String street, String city, String state,
			String zipCode) {
		super(email, password, businessName, contactFirstName, contactMiddleName, contactLastName, phone, street, city,
				state, zipCode);
	}

	public PartnerRequest(String email, String password) {
		super(email, password);
	}
	public PartnerRequest(String id){
		super(id);
	}

}
