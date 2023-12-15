package az.com.fidan.springboot.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args -> {
			Student person1 = new Student(
					"John Doe",
					"mail@example.az",
					LocalDate.of(2000, Month.JANUARY, 5)
			);

			Student person2 = new Student(
					"Alex",
					"alex@mail.az",
					LocalDate.of(2002, Month.JANUARY, 5)
			);

			repository.saveAll(
					List.of(person1, person2));
		};
	}
}
