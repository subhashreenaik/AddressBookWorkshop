package com.workshop.assignment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	    
	    
	
	    /* Method to check validation of First and last name
	     *  where regular expression of first and last name is defined */
public boolean validForName(String firstname) 
	    {
		Pattern p = Pattern.compile("[A-Z]{1}[a-z]{2,}");
		Matcher m = p.matcher(firstname);
		boolean b = m.matches(); 
		return b;
	    }
	   /* Method to check validation of EmailId
	    *  where regular expression of emailId is defined */
public  boolean validEmailId(String s) {
		
		Pattern p = Pattern.compile("^[a-zA-Z0-9]+([._+-]*[0-9A-Za-z]+)*[@][a-zA-Z0-9]+.[a-zA-Z]{2,}([.][a-z]{2,})?$");
		Matcher m = p.matcher(s);
		boolean b = m.matches(); 
		
		return b;
		
	    }
/* Method to check validation of mobile Number
 *  where regular expression of 10 digit mobile number is defined */
 public  boolean validMobileNo(String s) {
		
		Pattern p = Pattern.compile("91 [0-9]{10}");
		Matcher m = p.matcher(s);
		boolean b = m.matches(); 
		
		return b;
		
	    }
 /* Method to check validation of password
  * with at least one number,one upper case letter and has exactly one special character  
  * of regex is defined */
 public  boolean validPassword(String s) {
		Pattern p = Pattern.compile("(?=.*[A-Z]){1}(?=.*[0-9]){1}(?=.*[!@#$&*]){1}([A-Za-z0-9]).{5,}");
		Matcher m = p.matcher(s);
		boolean b = m.matches(); 
		
		return b;
		
		}
 /* Method to check validation of pin code Number
  *  where regular expression of 6 digit zip number is defined */
 public  boolean validpincode(String s) {
		
		Pattern p = Pattern.compile("[0-9]{6}");
		Matcher m = p.matcher(s);
		boolean b = m.matches(); 
		
		return b;
		
	    }
 /* Method to check validation of city name
  *  where regular expression of city name is defined */
 public  boolean validcity(String s) {
		
		Pattern p = Pattern.compile("[A-Z][a-z]+(?:[A-Z][a-z]+)*");
		Matcher m = p.matcher(s);
		boolean b = m.matches(); 
		
		return b;
		
	    }
 /* Method to check validation of state name
  *  where regular expression of state name is defined */
 public  boolean validstate(String s) {
		
		Pattern p = Pattern.compile("[A-Z][a-z]+(?:[A-Z][a-z]+)*");
		Matcher m = p.matcher(s);
		boolean b = m.matches(); 
		
		return b;
		
	    }
 /* Method to check validation of state name
  *  where regular expression of state name is defined */
 public  boolean valid_address(String s) {
		
		Pattern p = Pattern.compile("[a-zA-Z0-9]+([ ,._+-]*[0-9A-Za-z]+)*");
		Matcher m = p.matcher(s);
		boolean b = m.matches(); 
		
		return b;
		
	    }
	
	 
}