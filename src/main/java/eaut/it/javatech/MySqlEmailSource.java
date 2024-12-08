package eaut.it.javatech;

import org.springframework.stereotype.Component;

@Component
public class MySqlEmailSource implements EmailSource {

	@Override
	public String[] getEmails() {
		String[] emails = { "email_1@gmail.com", "email_2@hotmail.com", "email_3@yahoo.com" };
		return emails;
	}

}
