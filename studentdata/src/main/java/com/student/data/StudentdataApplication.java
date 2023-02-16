package com.student.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@Configuration
@PropertySource("classpath:query.properties")
@SpringBootApplication
public class StudentdataApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentdataApplication.class, args);
	}

}
