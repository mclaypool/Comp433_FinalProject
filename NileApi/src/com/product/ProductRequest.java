package com.product;

import java.util.Date;

public class ProductRequest extends Product {

	public ProductRequest() {
	}

	public ProductRequest(int productId, String partnerID, String isbn13, String isbn10, String title, double cost,
			String genre, String author, String description, Boolean isUsed, Boolean isHardcover, Date datePublished,
			double length, double width, double height, double weight, int quantity) {
		super(productId, partnerID, isbn13, isbn10, title, cost, genre, author, description, isUsed, isHardcover,
				datePublished, length, width, height, weight, quantity);
	}

	public ProductRequest(String partnerID, String isbn13, String isbn10, String title, double cost, String genre,
			String author, String description, Boolean isUsed, Boolean isHardcover, Date datePublished, double length,
			double width, double height, double weight, int quantity) {
		super(partnerID, isbn13, isbn10, title, cost, genre, author, description, isUsed, isHardcover, datePublished,
				length, width, height, weight, quantity);
	}

}
