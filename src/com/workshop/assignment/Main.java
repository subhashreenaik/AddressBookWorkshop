package com.workshop.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	static String fname, lname, add, city, state, zip, phoneno, emailid;
	
	//creating ArrayList
	static List<Person> contact = new ArrayList<Person>();
	
	
	/*
	 * This method is used to enter the information of a person
	 * like first name,last name,address,city,zip,state,mobile no,and email id
	 */
		public static  void enterInform() {
		     Scanner sc = new Scanner(System.in);
			System.out.println("Enter your First name :");
			fname = sc.nextLine();
			System.out.println("Enter your Last name : ");
			lname = sc.nextLine();
			System.out.println("Enter your address :");
			add = sc.nextLine();
			System.out.println("Enter your city :");
			city = sc.nextLine();
			System.out.println("Enter your state :");
			state = sc.nextLine();
			System.out.println("Enter your zip :");
			zip = sc.nextLine();
			System.out.println("Enter your phoneno :");
			phoneno = sc.nextLine();
			System.out.println("Enter your email id :");
			emailid = sc.nextLine();
			
		}
	public static void main(String[] args) {
		System.out.println("Enter information about Person and their details ");
		enterInform();
		Person person =new Person(lname, fname, add, city, state, zip, phoneno, emailid);
		contact.add(person);
		System.out.println(contact);
		

	}

}
