package com.customer.service;

import java.util.Arrays;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import com.customer.service.CustomerLink;

public abstract class CustomerAbstractRepresentation {

	@XmlElement(name="CustomerLink", namespace="")
	protected List<CustomerLink> links;
	
	public List<CustomerLink> getLinks() {
		return links;
	}
	
	public void setLinks(CustomerLink...links) {
		this.links = Arrays.asList(links);
	}
}
