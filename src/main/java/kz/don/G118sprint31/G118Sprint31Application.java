package kz.don.G118sprint31;

import kz.don.G118sprint31.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class G118Sprint31Application {

	public static void main(String[] args) {
		Student student = Student.builder()
				.name("Vovan")
				.surname("Vlados")
				.exam(90)
				.mark("A")
				.build();
		SpringApplication.run(G118Sprint31Application.class, args);
	}

}
