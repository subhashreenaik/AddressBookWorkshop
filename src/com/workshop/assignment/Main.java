package com.workshop.assignment;


public class Main {

		
	public static void main(String[] args) {
		AddressBookService service = new AddressBookService();
		service.add_information();
		service.check_duplicate_AndADD();
		service.edit_Name();
		service.delete_byName();
		
	}

}
