package com.order;

import java.util.Date;

public class OrderRequest extends Order {

	public OrderRequest() {
	}

	public OrderRequest(String email, int productId, int quantity, String phone, String street, String city,
			String state, String zipCode, String status, Date orderDate) {
		super(email, productId, quantity, phone, street, city, state, zipCode, status, orderDate);
	}

}
