package eaut.it.javatech;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PostgreSqlEmailSource implements EmailSource {

	@Override
	public String[] getEmails() {
		String[] emails = { "email_4@amazon.com", "email_5@microsoft.com", "email_6@facebook.com" };
		return emails;
	}

}
