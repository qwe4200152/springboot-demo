package demo.springboot.scheduler11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Scheduler11Application {

    public static void main(String[] args) {
        SpringApplication.run(Scheduler11Application.class, args);
    }

}
