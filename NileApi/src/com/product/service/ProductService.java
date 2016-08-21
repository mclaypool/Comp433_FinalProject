package com.product.service;

import java.util.List;
import javax.jws.WebService;
import com.product.ProductRep;
import com.product.ProductRequest;

@WebService
public interface ProductService {
	public List<ProductRep> getProductsByTitle(String title);
	public List<ProductRep> getProductsByGenre(String genre);
	public List<ProductRep> getProductsByAuthor(String author);
	public List<ProductRep> getAllProducts();
}
