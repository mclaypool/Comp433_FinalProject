package com.product;

import java.util.Date;
import com.product.service.ProductAbstractRepresentation;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Book")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class ProductRep extends ProductAbstractRepresentation{


	/**************************************************************************
	* global variables
	**************************************************************************/
	private int productId; //primary key
	private String partnerID;
 	private String isbn13;
 	private String isbn10;
 	private String title;
 	private double cost;
 	private String genre;
 	private String author;
 	private String description;
 	private Boolean isUsed;
 	private Boolean isHardcover;
 	private Date datePublished;
 	private double length;
 	private double width;
 	private double height;
 	private double weight;
 	private int quantity;

 	/**************************************************************************
	* constructor
	**************************************************************************/
 	public ProductRep(){}
 	
	public ProductRep(int productId, String partnerID, String isbn13, String isbn10, 
			String title, double cost, String genre, String author, 
			String description, Boolean isUsed, Boolean isHardcover, Date datePublished,
			double length, double width, double height, double weight, int quantity) {
		this.productId = productId;
		this.partnerID = partnerID;
		this.isbn13 = isbn13;
		this.isbn10 = isbn10;
		this.title = title;
		this.cost = cost;
		this.genre = genre;
		this.author = author;
		this.description = description;
		this.isUsed = isUsed;
		this.isHardcover = isHardcover;
		this.datePublished = datePublished;
		this.length = length;
		this.width = width;
		this.height = height;
		this.weight = weight;
		this.quantity = quantity;
	}

	public ProductRep(String partnerID, String isbn13, String isbn10, 
			String title, double cost, String genre, String author, 
			String description, Boolean isUsed, Boolean isHardcover, Date datePublished,
			double length, double width, double height, double weight, int quantity) {
		this.partnerID = partnerID;
		this.isbn13 = isbn13;
		this.isbn10 = isbn10;
		this.title = title;
		this.cost = cost;
		this.genre = genre;
		this.author = author;
		this.description = description;
		this.isUsed = isUsed;
		this.isHardcover = isHardcover;
		this.datePublished = datePublished;
		this.length = length;
		this.width = width;
		this.height = height;
		this.weight = weight;
		this.quantity = quantity;
	}


	/**************************************************************************
	* getters setters
	**************************************************************************/
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getPartnerID() {
		return partnerID;
	}

	public void setPartnerID(String partnerID) {
		this.partnerID = partnerID;
	}

	public String getIsbn13() {
		return isbn13;
	}

	public void setIsbn13(String isbn13) {
		this.isbn13 = isbn13;
	}

	public String getIsbn10() {
		return isbn10;
	}

	public void setIsbn10(String isbn10) {
		this.isbn10 = isbn10;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(Boolean isUsed) {
		this.isUsed = isUsed;
	}

	public Boolean getIsHardcover() {
		return isHardcover;
	}

	public void setIsHardcover(Boolean isHardcover) {
		this.isHardcover = isHardcover;
	}

	public Date getDatePublished() {
		return datePublished;
	}

	public void setDatePublished(Date datePublished) {
		this.datePublished = datePublished;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
