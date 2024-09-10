package registration;
import java.util.regex.*;

public class User {
	public boolean validFirstName(String firstName) {
		return Pattern.matches("^[A-Z]{1}[a-z]{2,}", firstName);
	}
}
