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
		System.out.println("Valid Username.");
	}

}
