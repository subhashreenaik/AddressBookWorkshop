package com.workshop.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AddressBookService {
	static String fname, lname, add, city, state, zip, phoneno, emailid;

	// creating ArrayList
	static List<Person> contact = new ArrayList<Person>();
	static Map<String, List<Person>> addressBook = new HashMap<String, List<Person>>();
	static Scanner s = new Scanner(System.in);
	static String[] book = { "AddressBook_One", "AddressBook_two", "AddressBook_Three" };

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
	public void add_information() {
		System.out.println("Enter number of Person you want to enter in a address Book ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int j = 0; j < book.length; j++) {
			System.out.println("Enter information for " + book[j]);
			contact = new ArrayList<Person>();
			for (int i = 0; i < n; i++) {
				enterInform();
				Person person = new Person(fname, lname, add, city, state, zip, phoneno, emailid);
				contact.add(person);

			}
			addressBook.put(book[j], contact);
		}
		addressBook.entrySet().stream().forEach(e -> System.out.println(e));
	}

	/*
	 * This method first check the person's information is present or not, if not
	 * then add the person's information to the addressBook.
	 */
	
	public void edit_ByName() {
		System.out.println("enter the name of the person ,you want to edit");
		String name = s.nextLine();
		System.out.println("Enter choice...\\n1.For AddressBookOne \\n2.For AddressBookTwo \\n3.For AddressBookThree  :where you want to edit");
		int choice = s.nextInt();
		switch (choice) {
		case 1:

			
				for (int j = 0; j < addressBook.get(book[0]).size(); j++) {
					if (addressBook.get(book[0]).get(j).getFirstName().equals(name)) {
						enterInform();
						Person person1 = new Person(fname, lname, add, city, state, zip, phoneno, emailid);
						addressBook.get(book[0]).set(j, person1);

					}
					else {
						do {
							System.out.println("the name is different : please give a correct name");
							name = s.nextLine();

						} while (!addressBook.get(book[0]).get(j).getFirstName().equals(name));
						enterInform();
						Person person = new Person(fname, lname, add, city, state, zip, phoneno, emailid);
						addressBook.get(book[0]).set(j, person);
				}
			}
			break;

		case 2:

			for (int j = 0; j < addressBook.get(book[1]).size(); j++) {
				if (addressBook.get(book[1]).get(j).getFirstName().equals(name)) {
					enterInform();
					Person person1 = new Person(fname, lname, add, city, state, zip, phoneno, emailid);
					addressBook.get(book[1]).set(j, person1);

				}
				else {
					do {
						System.out.println("the name is different : please give a correct name");
						name = s.nextLine();

					} while (!addressBook.get(book[1]).get(j).getFirstName().equals(name));
					enterInform();
					Person person = new Person(fname, lname, add, city, state, zip, phoneno, emailid);
					addressBook.get(book[1]).set(j, person);
			}
		}
		
			break;

		case 3:
			for (int j = 0; j < addressBook.get(book[2]).size(); j++) {
				if (addressBook.get(book[2]).get(j).getFirstName().equals(name)) {
					enterInform();
					Person person1 = new Person(fname, lname, add, city, state, zip, phoneno, emailid);
					addressBook.get(book[2]).set(j, person1);

				}
				else {
					do {
						System.out.println("the name is different : please give a correct name");
						name = s.nextLine();

					} while (!addressBook.get(book[2]).get(j).getFirstName().equals(name));
					enterInform();
					Person person = new Person(fname, lname, add, city, state, zip, phoneno, emailid);
					addressBook.get(book[2]).set(j, person);
			}
		}
		
			break;
		}
	}
	/*
	 * This method first check the person's information is present or not, if not
	 * then delete the person's information from the addressBook.
	 */

	public void delete_byName() {
		System.out.println("enter the name of the person ,you want to delete");
		String name = s.nextLine();
		System.out.println("Enter choice...\\n1.For AddressBookOne \\n2.For AddressBookTwo \\n3.For AddressBookThree  :where you want to delete");
		int choice = s.nextInt();
		switch (choice) {
		case 1:

			
				for (int j = 0; j < addressBook.get(book[0]).size(); j++) {
					if (addressBook.get(book[0]).get(j).getFirstName().equals(name)) {
						
						addressBook.get(book[0]).remove(j);

					}
					else {
						do {
							System.out.println("the name is different : please give a correct name");
							name = s.nextLine();

						} while (!addressBook.get(book[0]).get(j).getFirstName().equals(name));
						
						addressBook.get(book[0]).remove(j);
				}
			}
			break;

		case 2:

			for (int j = 0; j < addressBook.get(book[1]).size(); j++) {
				if (addressBook.get(book[1]).get(j).getFirstName().equals(name)) {
					
					addressBook.get(book[1]).remove(j);
					System.out.println("The contact person is removed");

				}
				else {
					do {
						System.out.println("the name is different : please give a correct name");
						name = s.nextLine();

					} while (!addressBook.get(book[1]).get(j).getFirstName().equals(name));
					
					addressBook.get(book[1]).remove(j);
					System.out.println("The contact person is removed");
			}
		}
		
			break;

		case 3:
			for (int j = 0; j < addressBook.get(book[2]).size(); j++) {
				if (addressBook.get(book[2]).get(j).getFirstName().equals(name)) {
					addressBook.get(book[2]).remove(j);
					System.out.println("The contact person is removed");
				}
				else {
					do {
						System.out.println("the name is different : please give a correct name");
						name = s.nextLine();

					} while (!addressBook.get(book[2]).get(j).getFirstName().equals(name));
					
					addressBook.get(book[2]).remove(j);
					System.out.println("The contact person is removed");
			}
		}
		
			break;
		}
	}
	
/** check duplicate and add person's information to the address book 
 * **/
	
	public void check_duplicate_AndADD() {

		System.out.println("Enter choice...\\n1.For AddressBookOne \\n2.For AddressBookTwo \\n3.For AddressBookThree");
		int choice = s.nextInt();
		switch (choice) {
		case 1:

			System.out.println("Enter information for " + book[0]);

			enterInform();
			Person person = new Person(fname, lname, add, city, state, zip, phoneno, emailid);
			// System.out.println(addressBook);
			if (addressBook.get(book[0]).size() == 0) {
				addressBook.get(book[0]).add(person);

			} else {
				System.out.println("size is " + addressBook.get(book[0]).size());
				for (int j = 0; j < addressBook.get(book[0]).size(); j++) {
					if (addressBook.get(book[0]).get(j).getFirstName().equals(person.getFirstName())) {
						System.out
								.println("The contact person is already present ,Please give different contact person");
						enterInform();
						Person person1 = new Person(fname, lname, add, city, state, zip, phoneno, emailid);
						addressBook.get(book[0]).add(person1);

					}
				}
			}
			break;

		case 2:

			System.out.println("Enter information for " + book[0]);

			enterInform();
			Person person2 = new Person(fname, lname, add, city, state, zip, phoneno, emailid);

			if (addressBook.get(book[1]).size() == 0) {
				addressBook.get(book[1]).add(person2);

			} else {
				System.out.println("size is " + addressBook.get(book[1]).size());
				for (int j = 0; j < addressBook.get(book[1]).size(); j++) {
					if (addressBook.get(book[1]).get(j).getFirstName().equals(person2.getFirstName())) {
						System.out
								.println("The contact person is already present ,Please give different contact person");
						enterInform();
						Person person1 = new Person(fname, lname, add, city, state, zip, phoneno, emailid);
						addressBook.get(book[1]).add(person1);

					}
				}
			}
			break;

		case 3:
			System.out.println("Enter information for " + book[2]);

			enterInform();
			Person person3 = new Person(fname, lname, add, city, state, zip, phoneno, emailid);
			// System.out.println(addressBook);
			if (addressBook.get(book[2]).size() == 0) {
				addressBook.get(book[2]).add(person3);

			} else {
				System.out.println("size is " + addressBook.get(book[2]).size());
				for (int j = 0; j < addressBook.get(book[2]).size(); j++) {
					if (addressBook.get(book[2]).get(j).getFirstName().equals(person3.getFirstName())) {
						System.out
								.println("The contact person is already present ,Please give different contact person");
						enterInform();
						Person person1 = new Person(fname, lname, add, city, state, zip, phoneno, emailid);
						addressBook.get(book[2]).add(person1);

					}
				}
			}
			break;
		}
		addressBook.entrySet().stream().forEach(e -> System.out.println(e));
	}
	
	
	/* Searching person from address book by state name using java stream*/
	
	public void search_state() {
		System.out.println("give the name of the state  :");
		String state = s.nextLine();
		
		for (Entry<String, List<Person>> j : addressBook.entrySet()) {
			List<Person> list = j.getValue();
			list.stream().filter(person -> person.getState().equals(state))
					.forEach(person -> System.out.println(person.getFirstName()));
		
		}
	}
	
	/* Counting person from address book by state or city name using java stream*/
	
	public void count_numberOfThePersonByCity_orState() {
		System.out.println("give the name of the state or city  :");
		String stateOrCityname = s.nextLine();
		
		for (Entry<String, List<Person>> set : addressBook.entrySet()) {
			List<Person> list = set.getValue();
			long countPeople = list.stream()
					.filter(person -> person.getState().equals(stateOrCityname) || person.getCity().equals(stateOrCityname))
					.count();
			System.out.println("The number of people are  :"+countPeople);
		
		}
	}
	
	/* Viewing person from address book by state or city name in dictionary using java stream*/
	public void viewPerson_byDictionary() {
		System.out.println("give the name of the state  :");
		String state = s.nextLine();
		for (Entry<String, List<Person>> j : addressBook.entrySet()) {
			List<Person> list = j.getValue();
			System.out.println( list.stream().filter (person-> person.getState().equals(state))
					.collect(Collectors.toMap(person ->person.getState(), person -> person.getFirstName())));
					
		
		}
	}

}
