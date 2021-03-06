package com.product.service;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ProductLink")
public class ProductLink {
	
	private String action;
	private String url;
	
	public ProductLink() {}
	
	public ProductLink(String action, String url) {
		this.action = action;
		this.url = url;
	}
	
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
