package demo.springboot.async15;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class Async15Application {

	public static void main(String[] args) {
		SpringApplication.run(Async15Application.class, args);
	}

}
