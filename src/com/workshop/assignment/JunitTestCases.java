package com.workshop.assignment;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class JunitTestCases {

UserRegistration ur=new UserRegistration();
    
    /**
	 * In this case we are testing regex pattern for first name and last name .
	 * The assertEqual will check if the result is true or not.
     * @throws UserRegistrationException 
	 */
	@Test
	public void testValidName() throws UserRegistrationException {
		assertEquals(true,ur.validForName("Subhashree") );
	}
	/**
	 * In this case we are testing regex pattern for mobile number .
	 * The assertEqual will check if the result is true or not.
	 * @throws UserRegistrationException 
	 */
	@Test
	public void testValidMobileNo() throws UserRegistrationException {
		assertEquals(true,ur.validMobileNo("91 2345678910") );
	}
	/**
	 * In this case we are testing regex pattern for email id .
	 * The assertEqual will check if the result is true or not.
	 * @throws UserRegistrationException 
	 */
	@Test
	public void testValidEmailid() throws UserRegistrationException {
		assertEquals(true,ur.validEmailId("sunima.naik@gmail.com") );
	}
	
	/**
	 * In this case we are testing regex pattern for valid password.
	 * The assertEqual will check if the result is true or not.
	 * @throws UserRegistrationException 
	 */
	@Test
	public void testValidPassword() throws UserRegistrationException {
		assertEquals(true,ur.validPassword("12A@asdewrt") );
	}
	
	@Test
	public void validState() throws UserRegistrationException {
		assertEquals(true,ur.validstate("Maharastra") );
	}
	
	@Test
	public void validCity() throws UserRegistrationException {
		assertEquals(true,ur.validcity("Pune") );
	}
	@Test
	public void validPincode() throws UserRegistrationException {
		assertEquals(true,ur.validpincode("411017") );
	}

}
