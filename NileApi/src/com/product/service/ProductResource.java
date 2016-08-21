package com.product.service;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.product.ProductLogic;
import com.product.ProductRep;
import com.product.ProductRequest;

@Path("/ProductResource/")
public class ProductResource {

	/**************************************************************************
	* getAllProducts
	**************************************************************************/
	@GET
	@Produces({"application/xml","application/json"})
	@Path("/product/products")  ///{password}
	public List<ProductRep> getAllProducts(
		@PathParam("id") String id) 
		//@PathParam("password") String password) not needed if we are just sear
	{
		System.out.println(
				"GET METHOD Request from Client with getAllProducts");
		ProductLogic ProductLogic = new ProductLogic();
		return ProductLogic.getAllProducts();
	}
	
	/**************************************************************************
	* getProductsByTitle1
	**************************************************************************/
	@GET
	@Produces({"application/xml","application/json"})
	@Path("/product/{title}")  ///{password}
	public List<ProductRep> getProductsByTitle(
		@PathParam("title") String title) 
		//@PathParam("password") String password) not needed if we are just sear
	{
		System.out.println(
				"GET METHOD Request from Client with product title: " + title);
		ProductLogic ProductLogic = new ProductLogic();
		return ProductLogic.getProductsByTitle(title);
	}
	
	/**************************************************************************
	* getProductsByGenre
	**************************************************************************/
	@GET
	@Produces({"application/xml","application/json"})
	@Path("/product/{genre}")  ///{password}
	public List<ProductRep> getProductsByGenre(
		@PathParam("genre") String genre) 
		//@PathParam("password") String password) not needed if we are just sear
	{
		System.out.println(
				"GET METHOD Request from Client with product genre: " + genre);
		ProductLogic ProductLogic = new ProductLogic();
		return ProductLogic.getProductsByGenre(genre);
	}
	
	/**************************************************************************
	* getProductsByAuthor
	**************************************************************************/
	@GET
	@Produces({"application/xml","application/json"})
	@Path("/product/{author}")  ///{password}
	public List<ProductRep> getProductsByAuthor(
		@PathParam("author") String author) 
		//@PathParam("password") String password) not needed if we are just sear
	{
		System.out.println(
				"GET METHOD Request from Client with product author: " + author);
		ProductLogic ProductLogic = new ProductLogic();
		return ProductLogic.getProductsByGenre(author);
	}	
}
