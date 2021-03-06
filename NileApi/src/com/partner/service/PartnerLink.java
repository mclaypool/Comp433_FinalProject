package com.partner.service;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="PartnerLink")
public class PartnerLink {
	private String action;
	private String url;
	
	public PartnerLink() {}
	
	public PartnerLink(String action, String url) {
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
