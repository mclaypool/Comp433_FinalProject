package com.order;

import java.util.Date;

public class OrderRep extends Order {

	public OrderRep() {
	}

	public OrderRep(String email, int productId, int quantity, String phone, String street, String city, String state,
			String zipCode, String status, Date orderDate) {
		super(email, productId, quantity, phone, street, city, state, zipCode, status, orderDate);
	}

}
