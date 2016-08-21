package com.customer.service;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="CustomerLink")
public class CustomerLink {
	private String action;
	private String url;
	
	public CustomerLink() {}
	
	public CustomerLink(String action, String url) {
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
