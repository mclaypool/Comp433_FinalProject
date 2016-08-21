package com.partner;
import com.order.OrderLogic;
import com.product.ProductLogic;

public class PartnerLogic {
	
	/**************************************************************************
	* members
	**************************************************************************/
	private PartnerDao conn = new PartnerDao();
	public ProductLogic productLogic = new ProductLogic();
	public OrderLogic orderLogic = new OrderLogic();
	
	/**************************************************************************
	* methods
	**************************************************************************/
	public PartnerRep getPartner(PartnerRequest request)
	{
		return conn.getPartner(request);
		//TODO add link code
	}
	
	public PartnerRep updatePartner(PartnerRequest request)
	{
		return conn.updatePartner(request);
		//TODO add link code
	}
	
	public void deletePartner(PartnerRequest request)
	{
		conn.deletePartner(request);
	}
	
	public PartnerRep createPartner(PartnerRequest request)
	{
		return conn.createPartner(request);
		//TODO add link code
	}
	
	private void setLinks(PartnerRep rep) {
		//TODO
	}
}
