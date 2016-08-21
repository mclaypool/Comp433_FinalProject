package com.customer.service;
import java.io.IOException;
import java.io.File;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.customer.CustomerRep;

public class CreateCustomerJSON {

	public void objectToJson(){
		System.out.println("Calling objectToJson...");
		CustomerRep customerRep = new CustomerRep();
		customerRep.setEmail("email@yahoo.com");
		customerRep.setFirstName("First Name");
		customerRep.setMiddleName("Middle Name");
		customerRep.setLastName("Last Name");
		customerRep.setPassword("Password");
		customerRep.setPhone("Phone");
		customerRep.setStreet("Street");
		customerRep.setCity("City");
		customerRep.setState("State");
		customerRep.setZipCode("Zip");
		
		ObjectMapper objectMapper = new ObjectMapper();
		try{
			
			objectMapper.writeValue(new File("c:\\users\\mike\\desktop\\customer.json"), customerRep);
		
			//display to console
			Object json = objectMapper.readValue(
					objectMapper.writeValueAsString(customerRep),Object.class);
			
			System.out.println(objectMapper.writerWithDefaultPrettyPrinter()
					.writeValueAsString(json));
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e){
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	public void jsonToObject(){
		System.out.println("Calling jsonToObject...");
		ObjectMapper objectMapper = new ObjectMapper();
		try{
			
			CustomerRep customerRep = objectMapper.readValue(new File(
					"c:\\users\\mike\\desktop\\customer.json"),CustomerRep.class);
			System.out.println("Email:- " + customerRep.getEmail());
			System.out.println("First Name:- " + customerRep.getFirstName());
			System.out.println("Middle Name:- " + customerRep.getMiddleName());
			System.out.println("Last Name:- " + customerRep.getLastName());
			System.out.println("Password:- " + customerRep.getPassword());
			System.out.println("Street:- " + customerRep.getStreet());
			System.out.println("City:- " + customerRep.getCity());
			System.out.println("State:- " + customerRep.getState());
			System.out.println("Zip Code:- " + customerRep.getZipCode());
			
		} catch (JsonGenerationException e) {
			   e.printStackTrace();
			  } catch (JsonMappingException e) {
			   e.printStackTrace();
			  } catch (IOException e) {
			   e.printStackTrace();
			  }
	
		}
	public static void main(String[] args) {
		CreateCustomerJSON jsonDemo = new CreateCustomerJSON();
		  jsonDemo.objectToJson();
		  jsonDemo.jsonToObject();
	}

}

