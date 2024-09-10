package registration;
import java.util.regex.*;

public class User {
	public boolean validFirstName(String firstName) {
		return Pattern.matches("^[A-Z]{1}[a-z]{2,}", firstName);
	}
	
	public boolean validLastName(String lastName) {
		return Pattern.matches("^[A-Z]{1}[a-z]{2,}", lastName);
	}
	
	public boolean validEmail(String email) {
		return Pattern.matches("^[a-z0-9.]{3,}@[a-z.]{2,}", email);
	}
	
	public boolean validMobNo(String mob) {
		return Pattern.matches("^\\d{2} \\d{10}", mob);
	}
	
	public boolean validPassword(String password) {
		return Pattern.matches("^(?=.{8,}$)(?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*?[#@$?!%&]).*$", password);
	}
}
