package demo.springboot.cache8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Cache8Application {

    public static void main(String[] args) {
        SpringApplication.run(Cache8Application.class, args);
    }

}
