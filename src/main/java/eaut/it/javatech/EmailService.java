package eaut.it.javatech;

import org.springframework.stereotype.Component;

@Component
public class EmailService {
	private EmailSource emailSource;
	
	public EmailService(EmailSource emailSource) {
		this.emailSource = emailSource;
	}

	public void sendEmail(String message) {
		String[] emails = emailSource.getEmails();
		System.out.println(String.format("Bản tin \"%s\" đã được gửi đến những emails sau đây: ", message));
		for (String email : emails) {
			System.out.println(String.format("       %s", email));
		}
	}
}
