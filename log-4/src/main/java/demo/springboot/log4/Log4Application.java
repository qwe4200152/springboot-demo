package demo.springboot.log4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Log4Application {

    private static Logger log = LoggerFactory.getLogger(Log4Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Log4Application.class, args);
        log.debug("启动成功");
    }

}
