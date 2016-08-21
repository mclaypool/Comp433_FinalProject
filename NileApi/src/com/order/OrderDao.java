package com.order;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class OrderDao {
	/**************************************************************************
	* global variables
	**************************************************************************/
	private static SessionFactory factory; 
	
	/**************************************************************************
	* constructor
	**************************************************************************/	
	public OrderDao()
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
	public List<OrderRep> getShoppingCart(String attribute, String value){
		//declare variables
		Session session = factory.openSession();
		
		//get representation
        Criteria criteria = session.createCriteria(OrderRep.class);		
        criteria.add(Restrictions.eq(attribute, value));
        criteria.add(Restrictions.eq("orderDate", null));
        List<?> results = criteria.list();
        session.close();

        if (results != null)
        {
    		List<OrderRep> orderList = new ArrayList<OrderRep>();
    		
    		for (int i = 0; i < results.size(); i++)
    		{
    			orderList.add((OrderRep)results.get(i));
    		}
    		return orderList;
        }
        else
        {
        	return null;
        }
	}		
	
	public List<OrderRep> createShoppingCart(String attribute, String value){
		//declare variables
		Transaction tx = null;
		OrderRequest request = new OrderRequest();
		request.setCustomerId(value);

		//save request
		Session session = factory.openSession();
		tx = session.beginTransaction();
		session.save(request);
		tx.commit();
		
		//get representation
		List<OrderRep> representation = 
				getOrdersByAttribute(attribute, value);
        session.close();
        return representation;
	}
	
	public List<OrderRep> addItemToShoppingCart(OrderRequest request){
		//declare variables
		Transaction tx = null;

		//save request
		Session session = factory.openSession();
		tx = session.beginTransaction();
		session.save(request);
		tx.commit();
		
		//get representation
		List<OrderRep> representation = 
				getOrdersByAttribute("customerId", request.getCustomerId());
        session.close();
        return representation;
	}
	
	public List<OrderRep> placeOrder(int orderId){
		//declare variables
		Transaction tx = null;
		OrderRequest request= new OrderRequest();
		Date today = Calendar.getInstance().getTime();

		request.setOrderId(orderId);
		request.setOrderDate(today);

		//save request
		Session session = factory.openSession();
		tx = session.beginTransaction();
		session.update(request);
		tx.commit();
		
		//get representation
		List<OrderRep> representation = 
				getOrdersByAttribute("customerId", request.getCustomerId());
        session.close();
        return representation;
	}
	
	public List<OrderRep> getOrdersByAttribute(String attribute, String value){
		//declare variables
		Session session = factory.openSession();
		
		//get representation
        Criteria criteria = session.createCriteria(OrderRep.class);		
        criteria.add(Restrictions.eq(attribute, value));		
        List<?> results = criteria.list();
        session.close();

        if (results != null)
        {
    		List<OrderRep> orderList = new ArrayList<OrderRep>();
    		
    		for (int i = 0; i < results.size(); i++)
    		{
    			orderList.add((OrderRep)results.get(i));
    		}
    		
    		return orderList;
        }
        else
        {
        	return null;
        }
	}
	
	public List<OrderRep> getAllOrders(String attribute, String value){
		//declare variables
		Session session = factory.openSession();
		
		//get representation
        Criteria criteria = session.createCriteria(OrderRep.class);
        criteria.add(Restrictions.eq(attribute, value));
        List<?> results = criteria.list();
        session.close();

        if (results != null)
        {
    		List<OrderRep> orderList = new ArrayList<OrderRep>();
    		
    		for (int i = 0; i < results.size(); i++)
    		{
    			orderList.add((OrderRep)results.get(i));
    		}
    		
    		return orderList;
        }
        else
        {
        	return null;
        }
	}	
	
	public List<OrderRep> updateOrder(List<OrderRequest> request){
		//declare variables
		Transaction tx = null;

		//save request
		Session session = factory.openSession();
		
		for (int i = 0; i < request.size(); i++)
		{
			tx = session.beginTransaction();
			session.update(request.get(i));
			tx.commit();
		}
	
		//get representation
		List<OrderRep>  orderList = getAllOrders("orderId",
				Integer.toString(request.get(0).getOrderId()));
		
        session.close();
        return orderList;
	}
	
	public void deleteOrder(int orderId){
		//declare variables
		Transaction tx = null;
		OrderRequest request = new OrderRequest();
		request.setOrderId(orderId);

		//save request
		Session session = factory.openSession();
		tx = session.beginTransaction();
		session.delete(request);
		tx.commit();
        session.close();
	}
}
