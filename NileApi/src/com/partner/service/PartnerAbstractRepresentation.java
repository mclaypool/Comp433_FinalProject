package com.partner.service;

import java.util.Arrays;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import com.partner.service.PartnerLink;

public abstract class PartnerAbstractRepresentation {
	
	@XmlElement(name="PartnerLink", namespace="")
	protected List<PartnerLink> links;
	
	public List<PartnerLink> getLinks() {
		return links;
	}
	
	public void setLinks(PartnerLink...links) {
		this.links = Arrays.asList(links);
	}
}
