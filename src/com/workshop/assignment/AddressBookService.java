package com.workshop.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;



public class AddressBookService {
	static String fname, lname, add, city, state, zip, phoneno, emailid;

	// creating ArrayList
	static List<Person> contact = new ArrayList<Person>();
	static Map<String, List<Person>> addressBook = new HashMap<String, List<Person>>();

	/*
	 * This method is used to enter the information of a person like first name,last
	 * name,address,city,zip,state,mobile no,and email id
	 */
	public static void enterInform() {
		UserRegistration user = new UserRegistration();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter your First name :Give a valid name,first letter should be capital letter");
			fname = sc.nextLine();

		} while (user.validForName(fname) != true);

		do {
			System.out.println("Enter your Last name : Give a valid name,first letter should be capital letter");
			lname = sc.nextLine();
		} while (user.validForName(lname) != true);

		do {
			System.out.println("Enter your address : Give a valid address,dont give any special character");
			add = sc.nextLine();
		} while (user.valid_address(add) != true);

		do {
			System.out.println("Enter your city : Give a valid city name,dont give any special character and digits");
			city = sc.nextLine();
		} while (user.validcity(city) != true);

		do {
			System.out.println("Enter your state :Give a valid state name,dont give any special character and digits");
			state = sc.nextLine();
		} while (user.validstate(state) != true);

		do {
			System.out.println("Enter your zip : Give a valid pincode ,dont give any special character and letter");
			zip = sc.nextLine();
		} while (user.validpincode(zip) != true);

		do {
			System.out.println(
					"Enter your phoneno :Give a valid 10 digit mobile number ,dont give any special character and letter");
			phoneno = sc.nextLine();
		} while (user.validMobileNo(phoneno) != true);

		do {
			System.out.println("Enter your email id :valid email id");
			emailid = sc.nextLine();
		} while (user.validEmailId(emailid) != true);

	}

	/*
	 * This method first check the person's information is present or not, if not
	 * then add the person's information to the addressBook.
	 */
	public void edit_Name() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name of the person");
		String name = sc.nextLine();

		for (int j = 0; j < contact.size(); j++) {
			if (name.equals(contact.get(j).getFirstName())) {
				enterInform();
				Person person = new Person(fname, lname, add, city, state, zip, phoneno, emailid);
				contact.set(j, person);
			} else {
				do {
					System.out.println("the name is different : please give a correct name");
					name = sc.nextLine();

				} while (!name.equals(contact.get(j).getFirstName()));
				enterInform();
				Person person = new Person(fname, lname, add, city, state, zip, phoneno, emailid);
				contact.set(j, person);
				contact.stream().forEach(s -> System.out.println(s));
			}
		}
	}

	public void delete_byName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name of the person");
		String name = sc.nextLine();

		for (int j = 0; j < contact.size(); j++) {
			if (name.equals(contact.get(j).getFirstName())) {
				enterInform();
				Person person = new Person(fname, lname, add, city, state, zip, phoneno, emailid);
				contact.remove(j);
			} else {
				do {
					System.out.println("the name is different : please give a correct name");
					name = sc.nextLine();

				} while (!name.equals(contact.get(j).getFirstName()));
				enterInform();
				Person person = new Person(fname, lname, add, city, state, zip, phoneno, emailid);
				contact.remove(j);
				contact.stream().forEach(s -> System.out.println(s));
			}
		}
	}

	public void add_information() {
		System.out.println("Enter number of Person you want to enter in a address Book ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] book = {"AddressBook_One","AddressBook_two","AddressBook_Three"};
		
		for(int j =0;j<book.length;j++) {
			System.out.println("Enter information for "+book[j]);
			contact=new ArrayList<Person>();
		for(int i=0;i<n;i++) {	
			enterInform();
			Person person = new Person(fname, lname, add, city, state, zip, phoneno, emailid);
			contact.add(person);
		   
	}addressBook.put(book[j],contact);
		}
		addressBook.entrySet().stream().forEach(e-> System.out.println(e));
	}
}


	
