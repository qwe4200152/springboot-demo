package demo.springboot.mybatis16;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//这里使用的扫描注解不是mybatis的，是通用mapper的注解
@MapperScan("demo.springboot.mybatis16.dao")
public class Mybatis16Application {

    public static void main(String[] args) {
        SpringApplication.run(Mybatis16Application.class, args);
    }

}
