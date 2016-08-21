package com.product;
/*
import static org.junit.Assert.*;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.junit.Test;
*/

public class ProductLogicTest {
/*
	@Test
	public void testCreate() 
	{
		//declare variables
		ProductLogic logic = new ProductLogic();
		ProductRep rep = new ProductRep();
		Date today = Calendar.getInstance().getTime();
		
		ProductRequest request = new ProductRequest("mclaypool@luc.edu",
				"1234567890123", "1234567890", "Test Title", 12.25, 
				"Test", "Test Anderson", "A test book", false, false, 
				today, 10.25, 10.25, 10.25, 10.25, 5);
		
		//test functions
		rep = logic.createProduct(request);
		logic.deleteProductById(rep.getProductId());
		assertEquals(request.getTitle(), rep.getTitle());
	}
	
	@Test
	public void testGetProductsByTitle() 
	{
		//declare variables
		ProductLogic logic = new ProductLogic();
		Date today = Calendar.getInstance().getTime();
		
		//create products
		ProductRequest request = new ProductRequest("mclaypool@luc.edu",
				"1234567890123", "1234567890", "Test Title", 12.25, 
				"Test", "Test Anderson", "A test book", false, false, 
				today, 10.25, 10.25, 10.25, 10.25, 5);
		logic.createProduct(request);
		
		request = new ProductRequest("mclaypool2@luc.edu",
				"1234567890123", "1234567890", "T2", 12.25, 
				"Test2", "Test Anderson2", "A test book", false, false, 
				today, 10.25, 10.25, 10.25, 10.25, 5);
		logic.createProduct(request);
		
		//get products
		List<ProductRep> productList = logic.getProductsByTitle("Test Title");
		
		//clean up
		List<ProductRep> productList2 = logic.getAllProducts();
		for (int i = 0; i < productList2.size(); i++)
		{
			logic.deleteProductById(productList2.get(i).getProductId());
		}
		
		//test function
		assertTrue(productList.size() == 1);
	}

	@Test
	public void testGetProductsByGenre() 
	{
		//declare variables
		ProductLogic logic = new ProductLogic();
		Date today = Calendar.getInstance().getTime();
		
		//create products
		ProductRequest request = new ProductRequest("mclaypool@luc.edu",
				"1234567890123", "1234567890", "Test Title", 12.25, 
				"Test", "Test Anderson", "A test book", false, false, 
				today, 10.25, 10.25, 10.25, 10.25, 5);
		logic.createProduct(request);
		
		request = new ProductRequest("mclaypool2@luc.edu",
				"1234567890123", "1234567890", "T2", 12.25, 
				"Test2", "Test Anderson2", "A test book", false, false, 
				today, 10.25, 10.25, 10.25, 10.25, 5);
		logic.createProduct(request);
		
		//get products
		List<ProductRep> productList = logic.getProductsByGenre("Test");
		
		//clean up
		List<ProductRep> productList2 = logic.getAllProducts();
		for (int i = 0; i < productList2.size(); i++)
		{
			logic.deleteProductById(productList2.get(i).getProductId());
		}
		
		//test function
		assertTrue(productList.size() == 1);
	}
	
	@Test
	public void testGetProductsByAuthor() 
	{
		//declare variables
		ProductLogic logic = new ProductLogic();
		Date today = Calendar.getInstance().getTime();
		
		//create products
		ProductRequest request = new ProductRequest("mclaypool@luc.edu",
				"1234567890123", "1234567890", "Test Title", 12.25, 
				"Test", "Test Anderson", "A test book", false, false, 
				today, 10.25, 10.25, 10.25, 10.25, 5);
		logic.createProduct(request);
		
		request = new ProductRequest("mclaypool2@luc.edu",
				"1234567890123", "1234567890", "T2", 12.25, 
				"Test2", "Test Anderson2", "A test book", false, false, 
				today, 10.25, 10.25, 10.25, 10.25, 5);
		logic.createProduct(request);
		
		//get products
		List<ProductRep> productList = logic.getProductsByAuthor("Test Anderson");
		
		//clean up
		List<ProductRep> productList2 = logic.getAllProducts();
		for (int i = 0; i < productList2.size(); i++)
		{
			logic.deleteProductById(productList2.get(i).getProductId());
		}
		
		//test function
		assertTrue(productList.size() == 1);
	}

	@Test
	public void testGetProductsByPartner() 
	{
		//declare variables
		ProductLogic logic = new ProductLogic();
		Date today = Calendar.getInstance().getTime();
		
		//create products
		ProductRequest request = new ProductRequest("mclaypool@luc.edu",
				"1234567890123", "1234567890", "Test Title", 12.25, 
				"Test", "Test Anderson", "A test book", false, false, 
				today, 10.25, 10.25, 10.25, 10.25, 5);
		logic.createProduct(request);
		
		request = new ProductRequest("mclaypool2@luc.edu",
				"1234567890123", "1234567890", "T2", 12.25, 
				"Test2", "Test Anderson2", "A test book", false, false, 
				today, 10.25, 10.25, 10.25, 10.25, 5);
		logic.createProduct(request);
		
		//get products
		List<ProductRep> productList = 
				logic.getProductsByPartnerId("mclaypool@luc.edu");
		
		//clean up
		List<ProductRep> productList2 = logic.getAllProducts();
		for (int i = 0; i < productList2.size(); i++)
		{
			logic.deleteProductById(productList2.get(i).getProductId());
		}
		
		//test function
		assertTrue(productList.size() == 1);
	}	
	
	@Test
	public void testGetAllProducts() 
	{
		//declare variables
		ProductLogic logic = new ProductLogic();
		Date today = Calendar.getInstance().getTime();
		
		//create products
		ProductRequest request = new ProductRequest("mclaypool@luc.edu",
				"1234567890123", "1234567890", "Test Title", 12.25, 
				"Test", "Test Anderson", "A test book", false, false, 
				today, 10.25, 10.25, 10.25, 10.25, 5);
		logic.createProduct(request);
		
		request = new ProductRequest("mclaypool2@luc.edu",
				"1234567890123", "1234567890", "Test Title", 12.25, 
				"Test", "Test Anderson", "A test book", false, false, 
				today, 10.25, 10.25, 10.25, 10.25, 5);
		logic.createProduct(request);
		
		//get products
		List<ProductRep> productList = logic.getAllProducts();
		
		//clean up
		for (int i = 0; i < productList.size(); i++)
		{
			logic.deleteProductById(productList.get(i).getProductId());
		}
		
		//test function
		assertTrue(productList.size() == 2);
	}	
	
	@Test
	public void testUpdate() throws Exception 
	{
		//declare variables
		ProductLogic logic = new ProductLogic();
		ProductRep rep = new ProductRep();
		Date today = Calendar.getInstance().getTime();
		
		ProductRequest request = new ProductRequest("mclaypool@luc.edu",
				"1234567890123", "1234567890", "Test Title", 12.25, 
				"Test", "Test Anderson", "A test book", false, false, 
				today, 10.25, 10.25, 10.25, 10.25, 5);
		rep = logic.createProduct(request);
		
		//test functions
		request = new ProductRequest(request.getProductId(), 
				"mclaypool@luc.edu","1234567890123", "1234567890", 
				"Test Title2", 12.25, "Test", "Test Anderson", 
				"A test book", false, false, today, 10.25, 10.25, 
				10.25, 10.25, 5);
		rep = logic.updateProduct(request);
		
		//clean up and test
		logic.deleteProductById(rep.getProductId());
		assertEquals(request.getTitle(), rep.getTitle());
	}
	*/
}
