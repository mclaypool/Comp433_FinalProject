package com.product.service;

import java.util.Arrays;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import com.product.service.ProductLink;

public abstract class ProductAbstractRepresentation {
	
	@XmlElement(name="ProductLink", namespace="")
	protected List<ProductLink> links;
	
	public List<ProductLink> getLinks() {
		return links;
	}
	
	public void setLinks(ProductLink...links) {
		this.links = Arrays.asList(links);
	}
}
