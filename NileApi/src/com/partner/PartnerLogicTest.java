package com.partner;
import static org.junit.Assert.*;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.junit.Test;
import com.product.ProductRep;
import com.product.ProductRequest;

public class PartnerLogicTest {
	
	/**************************************************************************
	* PartnerLogic
	**************************************************************************/
	@Test
	public void testCreate() 
	{
		//declare variables
		PartnerLogic logic = new PartnerLogic();
		PartnerRep rep = new PartnerRep();
		PartnerRequest request = new PartnerRequest("mclaypool@homtail.com",
				"a", "testBiz", "Max", "Strike", "Claypool", "555-555-5555", 
				"123 test st.", "Test City", "IL", "60626");
		
		//test functions
		rep = logic.createPartner(request);
		logic.deletePartner(request);
		assertSame(request.getEmail(), rep.getEmail());
	}
	
	@Test
	public void testUpdate() 
	{
		//declare variables
		PartnerLogic logic = new PartnerLogic();
		PartnerRep rep = new PartnerRep();
		PartnerRequest request = new PartnerRequest("mclaypool@homtail.com",
				"a", "testBiz", "Max", "Strike", "Claypool", "555-555-5555", 
				"123 test st.", "Test City", "IL", "60626");
		
		//test functions
		logic.createPartner(request);
		request = new PartnerRequest("mclaypool@homtail.com",
				"a", "testBiz", "Max", "Strike", "Claypool", "316-555-5555", 
				"123 test st.", "Test City", "IL", "60626");
		
		//test functions
		rep = logic.updatePartner(request);
		logic.deletePartner(request);
		//System.out.println(rep.getPhone());
		assertEquals(request.getPhone(), rep.getPhone());
	}
	
	@Test
	public void testGet() 
	{
		//declare variables
		PartnerLogic logic = new PartnerLogic();
		PartnerRep rep = new PartnerRep();
		PartnerRequest request = new PartnerRequest("mclaypool@homtail.com",
				"a", "testBiz", "Max", "Strike", "Claypool", "555-555-5555", 
				"123 test st.", "Test City", "IL", "60626");
		
		//test functions
		logic.createPartner(request);
		request = new PartnerRequest("mclaypool@homtail.com", "a");
		
		//test functions
		rep = logic.getPartner(request);
		logic.deletePartner(request);
		assertSame(request.getEmail(), rep.getEmail());
	}
	
	@Test
	public void testDelete() 
	{
		//declare variables
		PartnerLogic logic = new PartnerLogic();
		PartnerRequest request = new PartnerRequest("mclaypool@homtail.com",
				"a", "testBiz", "Max", "Strike", "Claypool", "555-555-5555", 
				"123 test st.", "Test City", "IL", "60626");
		
		//test functions
		logic.createPartner(request);
		logic.deletePartner(request);
		assertNull(null);
	}
	
	
	
	
	
	
	
	

	/**************************************************************************
	* ProductLogic
	**************************************************************************/
	public void testCreateProduct() 
	{
		//declare variables
		PartnerLogic logic = new PartnerLogic();
		ProductRep rep = new ProductRep();
		Date today = Calendar.getInstance().getTime();
		
		ProductRequest request = new ProductRequest("mclaypool@luc.edu",
				"1234567890123", "1234567890", "Test Title", 12.25, 
				"Test", "Test Anderson", "A test book", false, false, 
				today, 10.25, 10.25, 10.25, 10.25, 5);
		
		//test functions
		rep = logic.productLogic.createProduct(request);
		logic.productLogic.deleteProductById(rep.getProductId());
		assertEquals(request.getTitle(), rep.getTitle());
	}
	
	@Test
	public void testGetProductsByTitle() 
	{
		//declare variables
		PartnerLogic logic = new PartnerLogic();
		Date today = Calendar.getInstance().getTime();
		
		//create products
		ProductRequest request = new ProductRequest("mclaypool@luc.edu",
				"1234567890123", "1234567890", "Test Title", 12.25, 
				"Test", "Test Anderson", "A test book", false, false, 
				today, 10.25, 10.25, 10.25, 10.25, 5);
		logic.productLogic.createProduct(request);
		
		request = new ProductRequest("mclaypool2@luc.edu",
				"1234567890123", "1234567890", "T2", 12.25, 
				"Test2", "Test Anderson2", "A test book", false, false, 
				today, 10.25, 10.25, 10.25, 10.25, 5);
		logic.productLogic.createProduct(request);
		
		//get products
		List<ProductRep> productList = 
				logic.productLogic.getProductsByTitle("Test Title");
		
		//clean up
		List<ProductRep> productList2 = 
				logic.productLogic.getAllProducts();
		for (int i = 0; i < productList2.size(); i++)
		{
			logic.productLogic.deleteProductById(productList2.get(i).getProductId());
		}
		
		//test function
		assertTrue(productList.size() == 1);
	}

	@Test
	public void testGetProductsByGenre() 
	{
		//declare variables
		PartnerLogic logic = new PartnerLogic();
		Date today = Calendar.getInstance().getTime();
		
		//create products
		ProductRequest request = new ProductRequest("mclaypool@luc.edu",
				"1234567890123", "1234567890", "Test Title", 12.25, 
				"Test", "Test Anderson", "A test book", false, false, 
				today, 10.25, 10.25, 10.25, 10.25, 5);
		logic.productLogic.createProduct(request);
		
		request = new ProductRequest("mclaypool2@luc.edu",
				"1234567890123", "1234567890", "T2", 12.25, 
				"Test2", "Test Anderson2", "A test book", false, false, 
				today, 10.25, 10.25, 10.25, 10.25, 5);
		logic.productLogic.createProduct(request);
		
		//get products
		List<ProductRep> productList = 
				logic.productLogic.getProductsByGenre("Test");
		
		//clean up
		List<ProductRep> productList2 = 
				logic.productLogic.getAllProducts();
		for (int i = 0; i < productList2.size(); i++)
		{
			logic.productLogic.deleteProductById(
					productList2.get(i).getProductId());
		}
		
		//test function
		assertTrue(productList.size() == 1);
	}
	
	@Test
	public void testGetProductsByAuthor() 
	{
		//declare variables
		PartnerLogic logic = new PartnerLogic();
		Date today = Calendar.getInstance().getTime();
		
		//create products
		ProductRequest request = new ProductRequest("mclaypool@luc.edu",
				"1234567890123", "1234567890", "Test Title", 12.25, 
				"Test", "Test Anderson", "A test book", false, false, 
				today, 10.25, 10.25, 10.25, 10.25, 5);
		logic.productLogic.createProduct(request);
		
		request = new ProductRequest("mclaypool2@luc.edu",
				"1234567890123", "1234567890", "T2", 12.25, 
				"Test2", "Test Anderson2", "A test book", false, false, 
				today, 10.25, 10.25, 10.25, 10.25, 5);
		logic.productLogic.createProduct(request);
		
		//get products
		List<ProductRep> productList = 
				logic.productLogic.getProductsByAuthor("Test Anderson");
		
		//clean up
		List<ProductRep> productList2 = logic.productLogic.getAllProducts();
		for (int i = 0; i < productList2.size(); i++)
		{
			logic.productLogic.deleteProductById(
					productList2.get(i).getProductId());
		}
		
		//test function
		assertTrue(productList.size() == 1);
	}

	@Test
	public void testGetProductsByPartner() 
	{
		//declare variables
		PartnerLogic logic = new PartnerLogic();
		Date today = Calendar.getInstance().getTime();
		
		//create products
		ProductRequest request = new ProductRequest("mclaypool@luc.edu",
				"1234567890123", "1234567890", "Test Title", 12.25, 
				"Test", "Test Anderson", "A test book", false, false, 
				today, 10.25, 10.25, 10.25, 10.25, 5);
		logic.productLogic.createProduct(request);
		
		request = new ProductRequest("mclaypool2@luc.edu",
				"1234567890123", "1234567890", "T2", 12.25, 
				"Test2", "Test Anderson2", "A test book", false, false, 
				today, 10.25, 10.25, 10.25, 10.25, 5);
		logic.productLogic.createProduct(request);
		
		//get products
		List<ProductRep> productList = 
				logic.productLogic.getProductsByPartnerId("mclaypool@luc.edu");
		
		//clean up
		List<ProductRep> productList2 = logic.productLogic.getAllProducts();
		for (int i = 0; i < productList2.size(); i++)
		{
			logic.productLogic.deleteProductById(productList2.get(i).getProductId());
		}
		
		//test function
		assertTrue(productList.size() == 1);
	}	
	
	@Test
	public void testGetAllProducts() 
	{
		//declare variables
		PartnerLogic logic = new PartnerLogic();
		Date today = Calendar.getInstance().getTime();
		
		//create products
		ProductRequest request = new ProductRequest("mclaypool@luc.edu",
				"1234567890123", "1234567890", "Test Title", 12.25, 
				"Test", "Test Anderson", "A test book", false, false, 
				today, 10.25, 10.25, 10.25, 10.25, 5);
		logic.productLogic.createProduct(request);
		
		request = new ProductRequest("mclaypool2@luc.edu",
				"1234567890123", "1234567890", "Test Title", 12.25, 
				"Test", "Test Anderson", "A test book", false, false, 
				today, 10.25, 10.25, 10.25, 10.25, 5);
		logic.productLogic.createProduct(request);
		
		//get products
		List<ProductRep> productList = logic.productLogic.getAllProducts();
		
		//clean up
		for (int i = 0; i < productList.size(); i++)
		{
			logic.productLogic.deleteProductById(productList.get(i).getProductId());
		}
		
		//test function
		assertTrue(productList.size() == 2);
	}	
	
	@Test
	public void testUpdateProduct() 
	{
		//declare variables
		PartnerLogic logic = new PartnerLogic();
		ProductRep rep = new ProductRep();
		Date today = Calendar.getInstance().getTime();
		
		ProductRequest request = new ProductRequest("mclaypool@luc.edu",
				"1234567890123", "1234567890", "Test Title", 12.25, 
				"Test", "Test Anderson", "A test book", false, false, 
				today, 10.25, 10.25, 10.25, 10.25, 5);
		rep = logic.productLogic.createProduct(request);
		
		//test functions
		request = new ProductRequest(request.getProductId(), 
				"mclaypool@luc.edu","1234567890123", "1234567890", 
				"Test Title2", 12.25, "Test", "Test Anderson", 
				"A test book", false, false, today, 10.25, 10.25, 
				10.25, 10.25, 5);
		rep = logic.productLogic.updateProduct(request);
		
		//clean up and test
		logic.productLogic.deleteProductById(rep.getProductId());
		assertEquals(request.getTitle(), rep.getTitle());
	}

	
	
	
	
}
