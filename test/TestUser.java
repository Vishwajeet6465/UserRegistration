package test;

import static org.junit.Assert.*;

import org.junit.Test;
import registration.User;

public class TestUser {

	@Test
	public void testFirstName() {
		User obj = new User();
		boolean result = obj.validFirstName("Vishwajeet");
		assertTrue(result);
		System.out.println("Valid FirstName.");
	}
	
	@Test
	public void testLastName() {
		User obj = new User();
		boolean result = obj.validLastName("Bamane");
		assertTrue(result);
		System.out.println("Valid LastName.");
	}

	@Test
	public void testEmail() {
		User obj = new User();
		boolean result = obj.validEmail("vishwajeet.bamane@nmiet.edu.in");
		assertTrue(result);
		System.out.println("Valid Email.");
	}
}
