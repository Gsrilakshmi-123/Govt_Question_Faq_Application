package net.javaguides.govtquestion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
public class GovtQuestionFaqApplication {

	@CrossOrigin(origins="http://localhost:4200")
	public static void main(String[] args) {
		
		SpringApplication.run(GovtQuestionFaqApplication.class, args);
	}

}
