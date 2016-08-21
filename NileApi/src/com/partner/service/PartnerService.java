package com.partner.service;

import java.util.List;
import javax.jws.WebService;
import com.partner.PartnerRep;
import com.partner.PartnerRequest;
import com.order.OrderRep;
import com.order.OrderRequest;
import com.product.ProductRep;
import com.product.ProductRequest;

@WebService
public interface PartnerService {
	
	//Partner functions
	public PartnerRep getPartner(PartnerRequest request);
	public PartnerRep updatePartner(PartnerRequest request);
	public void deletePartner(PartnerRequest request);
	public PartnerRep createPartner(PartnerRequest request);

	//partner methods for order
	public List<OrderRep> getOrdersByAttribute(String attribute, String value);
	public List<OrderRep> getAllOrders(String attribute, String value);
	public List<OrderRep> updateOrder(List<OrderRequest> request);
	public void deleteOrder(int id);
	public void cancelOrder(int id);
	
	//product methods for partner
	public List<ProductRep> getProductsByTitle(String title);
	public List<ProductRep> getProductsByGenre(String genre);
	public List<ProductRep> getProductsByAuthor(String author);
	public List<ProductRep> getAllProducts();
	public List<ProductRep> getProductsByPartnerId(String partnerID);
	public ProductRep createProduct(ProductRequest request);
	public void deleteProductById(int productId);
	public ProductRep updateProduct(ProductRequest request);
}
