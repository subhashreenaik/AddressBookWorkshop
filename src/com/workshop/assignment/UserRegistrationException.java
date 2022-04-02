package com.workshop.assignment;

public class UserRegistrationException extends Exception {
	 public String message;
		public UserRegistrationException(String message) {
			this.message=message;
		}

	}
