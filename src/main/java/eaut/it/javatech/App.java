package eaut.it.javatech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		EmailService emailService = applicationContext.getBean(EmailService.class);
		emailService.sendEmail("Xin chào.......");
	}
}
