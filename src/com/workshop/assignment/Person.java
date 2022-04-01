package com.workshop.assignment;

public class Person {
	
	
	//Declaring instance variable
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phoneNo;
	private String email;
	
	/*
	 * Declaring parameterised constructor of class
	 */
	Person(String firstName, String lastName,String address,String city,String state,String zip,String phoneNo,String email){
		this.lastName = lastName;
		this.address = address;
		this.firstName = firstName;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNo=phoneNo;
		this.email = email;
		
	}
}
