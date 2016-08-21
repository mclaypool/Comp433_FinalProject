/******************************************************************************
* Class:	PartnerDao
* Purpose:	
*******************************************************************************
* Style:		https://google.github.io/styleguide/javaguide.html
* Column limit: 80
******************************************************************************/
package com.partner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PartnerDao {

	/**************************************************************************
	* global variables
	**************************************************************************/
	private static SessionFactory factory; 
	
	
	/**************************************************************************
	* constructor
	**************************************************************************/	
	public PartnerDao()
	{
	      try{
	          factory = new Configuration().configure().buildSessionFactory();
	       }catch (Throwable ex) { 
	          System.err.println("Failed to create sessionFactory object." + ex);
	          throw new ExceptionInInitializerError(ex); 
	       }
	}
	
	
	/**************************************************************************
	* methods
	**************************************************************************/
	public PartnerRep getPartner(PartnerRequest request){
		//save request
		Session session = factory.openSession();
		
		//get representation
		PartnerRep representation = 
				session.get(PartnerRep.class, request.getEmail());
        session.close();
        return representation;
	}
	
	public PartnerRep updatePartner(PartnerRequest request){
		//declare variables
		Transaction tx = null;

		//save request
		Session session = factory.openSession();
		tx = session.beginTransaction();
		session.update(request);
		tx.commit();
		
		//get representation
		PartnerRep representation = 
				session.get(PartnerRep.class, request.getEmail());
        session.close();
        return representation;
	}
	
	public void deletePartner(PartnerRequest request){
		//declare variables
		Transaction tx = null;

		//save request
		Session session = factory.openSession();
		tx = session.beginTransaction();
		session.delete(request);
		tx.commit();
        session.close();
	}
	
	public PartnerRep createPartner(PartnerRequest request){
		//declare variables
		Transaction tx = null;

		//save request
		Session session = factory.openSession();
		tx = session.beginTransaction();
		session.save(request);
		tx.commit();
		
		//get representation
		PartnerRep representation = session.get(PartnerRep.class, request.getEmail());
        session.close();
        return representation;
	}
}
